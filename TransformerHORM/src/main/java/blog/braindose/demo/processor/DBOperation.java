package blog.braindose.demo.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import blog.braindose.demo.entity.Booking;
import jakarta.transaction.Transactional;

public class DBOperation  implements Processor {

    public void process(Exchange exchange) throws Exception {
        Booking booking = (Booking) exchange.getIn().getBody();
        /*
        if (Booking.findById(booking.pnr) != null){
            System.out.println("Before delete ... ");
            Booking.deleteById(booking.pnr);
            System.out.println("After delete ... ");
            
        }
        */
        /*System.out.println("Before persist ... ");
        System.out.println("Record Size: " + Booking.findById(booking.pnr));
        System.out.println("ActivityReport Size: " + booking.activityReports.size());
        booking.activityReports.forEach(r -> {
            if (r.pnr == null){
                System.out.println("Activity Report PNR is Null");
            }
            
        });
        */
        booking.persist();
        //System.out.println("After persists ... ");
    }
    
}
