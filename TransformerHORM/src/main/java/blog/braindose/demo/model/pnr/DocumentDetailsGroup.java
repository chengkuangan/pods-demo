package blog.braindose.demo.model.pnr;

import java.util.ArrayList;
import java.util.Date;

public class DocumentDetailsGroup {
    private double totalFareAmount;
    private String totalFareCurrency;
    private ArrayList<OtherFare> otherFares;
    private String issueIdentifiers;
    private String issueIndicators;
    private ArrayList<Rfic> rfics;
    private ArrayList<Flag> flags;
    private ArrayList<GeneralIndicator> generalIndicators;
    private ArrayList<FareCalcRemark> fareCalcRemarks;
    private String officeName;
    private String officeAmId;
    private String manualIndicatorStatus;
    private Date creationDateTime;
    private ArrayList<CouponDetailsGroup> couponDetailsGroup;
    private ArrayList<TaxInformation> taxInformation;
    private String fareOrigin;
    private String fareDestination;
    private NegoDetails negoDetails;

    public double getTotalFareAmount() {
        return totalFareAmount;
    }
    public void setTotalFareAmount(double totalFareAmount) {
        this.totalFareAmount = totalFareAmount;
    }
    public String getTotalFareCurrency() {
        return totalFareCurrency;
    }
    public void setTotalFareCurrency(String totalFareCurrency) {
        this.totalFareCurrency = totalFareCurrency;
    }
    public ArrayList<OtherFare> getOtherFares() {
        return otherFares;
    }
    public void setOtherFares(ArrayList<OtherFare> otherFares) {
        this.otherFares = otherFares;
    }
    public String getIssueIdentifiers() {
        return issueIdentifiers;
    }
    public void setIssueIdentifiers(String issueIdentifiers) {
        this.issueIdentifiers = issueIdentifiers;
    }
    public String getIssueIndicators() {
        return issueIndicators;
    }
    public void setIssueIndicators(String issueIndicators) {
        this.issueIndicators = issueIndicators;
    }
    public ArrayList<Rfic> getRfics() {
        return rfics;
    }
    public void setRfics(ArrayList<Rfic> rfics) {
        this.rfics = rfics;
    }
    public ArrayList<Flag> getFlags() {
        return flags;
    }
    public void setFlags(ArrayList<Flag> flags) {
        this.flags = flags;
    }
    public ArrayList<GeneralIndicator> getGeneralIndicators() {
        return generalIndicators;
    }
    public void setGeneralIndicators(ArrayList<GeneralIndicator> generalIndicators) {
        this.generalIndicators = generalIndicators;
    }
    public ArrayList<FareCalcRemark> getFareCalcRemarks() {
        return fareCalcRemarks;
    }
    public void setFareCalcRemarks(ArrayList<FareCalcRemark> fareCalcRemarks) {
        this.fareCalcRemarks = fareCalcRemarks;
    }
    public String getOfficeName() {
        return officeName;
    }
    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }
    public String getOfficeAmId() {
        return officeAmId;
    }
    public void setOfficeAmId(String officeAmId) {
        this.officeAmId = officeAmId;
    }
    public String getManualIndicatorStatus() {
        return manualIndicatorStatus;
    }
    public void setManualIndicatorStatus(String manualIndicatorStatus) {
        this.manualIndicatorStatus = manualIndicatorStatus;
    }
    public Date getCreationDateTime() {
        return creationDateTime;
    }
    public void setCreationDateTime(Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }
    public ArrayList<CouponDetailsGroup> getCouponDetailsGroup() {
        return couponDetailsGroup;
    }
    public void setCouponDetailsGroup(ArrayList<CouponDetailsGroup> couponDetailsGroup) {
        this.couponDetailsGroup = couponDetailsGroup;
    }
    public ArrayList<TaxInformation> getTaxInformation() {
        return taxInformation;
    }
    public void setTaxInformation(ArrayList<TaxInformation> taxInformation) {
        this.taxInformation = taxInformation;
    }
    public String getFareOrigin() {
        return fareOrigin;
    }
    public void setFareOrigin(String fareOrigin) {
        this.fareOrigin = fareOrigin;
    }
    public String getFareDestination() {
        return fareDestination;
    }
    public void setFareDestination(String fareDestination) {
        this.fareDestination = fareDestination;
    }
    public NegoDetails getNegoDetails() {
        return negoDetails;
    }
    public void setNegoDetails(NegoDetails negoDetails) {
        this.negoDetails = negoDetails;
    }

    
}
