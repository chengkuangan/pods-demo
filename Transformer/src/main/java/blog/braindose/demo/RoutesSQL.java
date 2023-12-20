package blog.braindose.demo;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.apache.camel.model.TransactedDefinition;

import blog.braindose.demo.model.pnr.Booking;
import blog.braindose.demo.service.DataMappingProcessor;
import blog.braindose.demo.service.Statistics;
import io.micrometer.core.instrument.MeterRegistry;

/**
 * Metrics can be viewed at http://localhost:8080/q/metrics/application
 */
@ApplicationScoped
public class RoutesSQL extends RouteBuilder{
    
    @Inject
    MeterRegistry registry;
    
    @Override
    public void configure() throws Exception {
        
        //from ("jms:amadeus?testConnectionOnStartup=true&concurrentConsumers={{jms.concurrent.consumers}}&maxConcurrentConsumers={{jms.max.concurrent.consumers}}").routeId("transformer")
        from ("activemq:amadeus?testConnectionOnStartup=true&concurrentConsumers={{jms.concurrent.consumers}}&maxConcurrentConsumers={{jms.max.concurrent.consumers}}").routeId("transformer")
            .transacted()
            .unmarshal(new JacksonDataFormat(Booking.class))
            //.log("PNR Number: ${body.activePNRimage.amadeusId.reservation.controlNumber}")
            .process(new DataMappingProcessor())
            .to("sql:classpath:sql/deleteAll.sql")
            .to("sql:classpath:sql/inserts.sql")
            .setHeader("pnr", simple("${body.pnr}"))
            .setBody(simple("${body.activityReports}"))
            .to("sql:classpath:sql/insertActivityReport.sql?batch=true")
            .process(this::countAllSQLInsert)
        ;            
    }
     
    void countAllSQLInsert(Exchange exchange) {
        int count = ((List) exchange.getIn().getBody()).size();
        registry.counter("blog.braindose.demo.observability.sql", "type", "delete", "module", "total").increment(100);
        //registry.counter("blog.braindose.demo.observability.sql", "type", "insert", "module", "activityReport").increment(count);
        registry.counter("blog.braindose.demo.observability.sql", "type", "insert", "module", "total").increment(count + 5);
    }

}
