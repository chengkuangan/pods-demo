package blog.braindose.demo.model.pnr;

import java.util.ArrayList;

public class ProductPricingQuotationRecord {
    private PricingRecordId pricingRecordId;
    private ArrayList<PassengerTattoo> passengerTattoos;
    private ArrayList<FareId> fareIds;
    private DocumentDetailsGroup documentDetailsGroup;
    private ArrayList<PtcDiscountCode> ptcDiscountCode;
    public PricingRecordId getPricingRecordId() {
        return pricingRecordId;
    }
    public void setPricingRecordId(PricingRecordId pricingRecordId) {
        this.pricingRecordId = pricingRecordId;
    }
    public ArrayList<PassengerTattoo> getPassengerTattoos() {
        return passengerTattoos;
    }
    public void setPassengerTattoos(ArrayList<PassengerTattoo> passengerTattoos) {
        this.passengerTattoos = passengerTattoos;
    }
    public ArrayList<FareId> getFareIds() {
        return fareIds;
    }
    public void setFareIds(ArrayList<FareId> fareIds) {
        this.fareIds = fareIds;
    }
    public DocumentDetailsGroup getDocumentDetailsGroup() {
        return documentDetailsGroup;
    }
    public void setDocumentDetailsGroup(DocumentDetailsGroup documentDetailsGroup) {
        this.documentDetailsGroup = documentDetailsGroup;
    }
    public ArrayList<PtcDiscountCode> getPtcDiscountCode() {
        return ptcDiscountCode;
    }
    public void setPtcDiscountCode(ArrayList<PtcDiscountCode> ptcDiscountCode) {
        this.ptcDiscountCode = ptcDiscountCode;
    }

    


}
