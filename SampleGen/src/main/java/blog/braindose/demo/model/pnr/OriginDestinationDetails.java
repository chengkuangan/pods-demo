package blog.braindose.demo.model.pnr;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OriginDestinationDetails {
    private OriginDestination originDestination;
    private ArrayList<ItineraryInfo> itineraryInfo;
    public OriginDestination getOriginDestination() {
        return originDestination;
    }
    public void setOriginDestination(OriginDestination originDestination) {
        this.originDestination = originDestination;
    }
    public ArrayList<ItineraryInfo> getItineraryInfo() {
        return itineraryInfo;
    }
    public void setItineraryInfo(ArrayList<ItineraryInfo> itineraryInfo) {
        this.itineraryInfo = itineraryInfo;
    }

    
}
