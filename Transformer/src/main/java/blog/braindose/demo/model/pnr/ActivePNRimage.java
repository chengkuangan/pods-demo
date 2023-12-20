package blog.braindose.demo.model.pnr;

import java.util.ArrayList;

public class ActivePNRimage {

    private AmadeusId amadeusId;
    private PnrHeader pnrHeader;
    private ArrayList<PaxInfo> paxInfo;
    private OriginDestinationDetails originDestinationDetails;
    private DataElementsMaster dataElementsMaster;
    private PricingRecordGroup pricingRecordGroup;
    public AmadeusId getAmadeusId() {
        return amadeusId;
    }
    public void setAmadeusId(AmadeusId amadeusId) {
        this.amadeusId = amadeusId;
    }
    public PnrHeader getPnrHeader() {
        return pnrHeader;
    }
    public void setPnrHeader(PnrHeader pnrHeader) {
        this.pnrHeader = pnrHeader;
    }
    public ArrayList<PaxInfo> getPaxInfo() {
        return paxInfo;
    }
    public void setPaxInfo(ArrayList<PaxInfo> paxInfo) {
        this.paxInfo = paxInfo;
    }
    public OriginDestinationDetails getOriginDestinationDetails() {
        return originDestinationDetails;
    }
    public void setOriginDestinationDetails(OriginDestinationDetails originDestinationDetails) {
        this.originDestinationDetails = originDestinationDetails;
    }
    public DataElementsMaster getDataElementsMaster() {
        return dataElementsMaster;
    }
    public void setDataElementsMaster(DataElementsMaster dataElementsMaster) {
        this.dataElementsMaster = dataElementsMaster;
    }
    public PricingRecordGroup getPricingRecordGroup() {
        return pricingRecordGroup;
    }
    public void setPricingRecordGroup(PricingRecordGroup pricingRecordGroup) {
        this.pricingRecordGroup = pricingRecordGroup;
    }

    
}
