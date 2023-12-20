package blog.braindose.demo.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import blog.braindose.demo.entity.Booking;
import jakarta.transaction.Transactional;

public class DBDeleteOperation  implements Processor {

    public void process(Exchange exchange) throws Exception {
        Booking booking = (Booking) exchange.getIn().getBody();
        
        if (Booking.findById(booking.pnr) != null){
            //System.out.println("Before delete ... ");
            Booking.deleteById(booking.pnr);
            //System.out.println("After delete ... ");
            
        }
    }
    
}
