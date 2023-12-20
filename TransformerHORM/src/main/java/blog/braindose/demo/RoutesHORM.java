package blog.braindose.demo;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jackson.JacksonDataFormat;
import blog.braindose.demo.model.pnr.Booking;
import blog.braindose.demo.processor.DBDeleteOperation;
import blog.braindose.demo.processor.DBOperation;
import blog.braindose.demo.processor.DataMappingProcessor;
import io.micrometer.core.instrument.MeterRegistry;

/**
 * Metrics can be viewed at http://localhost:8080/q/metrics/application
 */
//@ApplicationScoped
public class RoutesHORM {// extends RouteBuilder{
    
    //private Statistics stats = new Statistics();
    @Inject
    MeterRegistry registry;

    /*
    @Override
    public void configure() throws Exception {
        
        from ("jms:amadeus?testConnectionOnStartup=true").routeId("transformer").threads(5)
            .transacted()
            .unmarshal(new JacksonDataFormat(Booking.class))
            //.log("PNR Number: ${body.activePNRimage.amadeusId.reservation.controlNumber}")
            .process(new DataMappingProcessor())
            .process(new DBDeleteOperation())
            .process(new DBOperation())
            .process(this::metrics)
        ;            
    }
    */

    void metrics(Exchange exchange) {
        blog.braindose.demo.entity.Booking booking = (blog.braindose.demo.entity.Booking) exchange.getIn().getBody();
        int count = booking.activityReports.size();
        registry.counter("blog.braindose.demo.observability.sql", "type", "delete", "module", "total").increment(100);
        registry.counter("blog.braindose.demo.observability.sql", "type", "insert", "module", "activityReport").increment(count);
        registry.counter("blog.braindose.demo.observability.sql", "type", "insert", "module", "total").increment(count + 5);
    }

}
