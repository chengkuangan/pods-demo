package blog.braindose.demo.model.pnr;

import java.util.ArrayList;

public class CouponDetailsGroup {
    private ProductId productId;
    private Rfisc rfisc;
    private String feeOwnerCode;
    private ArrayList<CouponFlag> couponFlags;
    private BaggageInformation baggageInformation;
    private FareQualifier fareQualifier;
    public ProductId getProductId() {
        return productId;
    }
    public void setProductId(ProductId productId) {
        this.productId = productId;
    }
    public Rfisc getRfisc() {
        return rfisc;
    }
    public void setRfisc(Rfisc rfisc) {
        this.rfisc = rfisc;
    }
    public String getFeeOwnerCode() {
        return feeOwnerCode;
    }
    public void setFeeOwnerCode(String feeOwnerCode) {
        this.feeOwnerCode = feeOwnerCode;
    }
    public ArrayList<CouponFlag> getCouponFlags() {
        return couponFlags;
    }
    public void setCouponFlags(ArrayList<CouponFlag> couponFlags) {
        this.couponFlags = couponFlags;
    }
    public BaggageInformation getBaggageInformation() {
        return baggageInformation;
    }
    public void setBaggageInformation(BaggageInformation baggageInformation) {
        this.baggageInformation = baggageInformation;
    }
    public FareQualifier getFareQualifier() {
        return fareQualifier;
    }
    public void setFareQualifier(FareQualifier fareQualifier) {
        this.fareQualifier = fareQualifier;
    }

    

}
