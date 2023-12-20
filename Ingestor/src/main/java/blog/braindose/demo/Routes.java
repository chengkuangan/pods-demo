package blog.braindose.demo;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import io.micrometer.core.instrument.MeterRegistry;
import org.apache.camel.model.dataformat.JsonLibrary;

import blog.braindose.demo.service.Statistics;

@ApplicationScoped
public class Routes extends RouteBuilder {

    private Statistics stats = new Statistics();
    @Inject
    MeterRegistry registry;

    @Override
    public void configure() throws Exception {
        
        from("file://{{local.path}}/?delete=true&readLock=changed").routeId("ingestor")
                .log("Start processing file(s) ... ")
                /*
                .process(
                        exchange -> {
                            String file = exchange.getIn().getBody(String.class);
                            byte[] content = file.getBytes();
                            long size = (long) content.length;
                            stats.setStartTime(System.currentTimeMillis());
                            stats.addSize(size);
                            stats.incrementFileCounter();
                        })
                */
                .split().jsonpath("$").streaming()
                    .marshal().json(JsonLibrary.Jackson)
                    //.marshal().json(JsonLibrary.Jackson, Booking.class)
                    //.log("${body}")
                    /*
                    .process(
                        exchange -> {
                            stats.incrementRecordCount();
                        })
                     */
                    //.to("file:///Users/ganck/Downloads?fileName=sia.json")
                    .process(this::countMessage)
                    .process(this::sumMessageSize)
                    .to("jms:amadeus?testConnectionOnStartup=true")
                .end()
                /*
                .process(
                        exchange -> {
                            stats.addDuration(System.currentTimeMillis());
                            System.out.println(stats.echo());
                        })
                */
                .log("Done processing file(s) ... ")
                ;
    }

    void countMessage(Exchange exchange) {
        registry.counter("blog.braindose.demo.observability.message", "type", "events", "purpose", "example").increment();
    }

    void sumMessageSize(Exchange exchange) {
        String content = exchange.getIn().getBody(String.class);
        long size = (long) content.length();
        registry.summary("blog.braindose.demo.observability.size.sum", "unit", "bytes").record(size);
    }

}
