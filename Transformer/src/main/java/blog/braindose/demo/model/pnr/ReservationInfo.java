package blog.braindose.demo.model.pnr;

import java.util.Date;

public class ReservationInfo {
    
    private Date lastEOTDateTime;
    private String controlType;
    private String amadeusCompanyID;
    private String amadeusRecordLocator;
    
    public Date getLastEOTDateTime() {
        return lastEOTDateTime;
    }
    public void setLastEOTDateTime(Date lastEOTDateTime) {
        this.lastEOTDateTime = lastEOTDateTime;
    }
    public String getControlType() {
        return controlType;
    }
    public void setControlType(String controlType) {
        this.controlType = controlType;
    }
    public String getAmadeusCompanyID() {
        return amadeusCompanyID;
    }
    public void setAmadeusCompanyID(String amadeusCompanyID) {
        this.amadeusCompanyID = amadeusCompanyID;
    }
    public String getAmadeusRecordLocator() {
        return amadeusRecordLocator;
    }
    public void setAmadeusRecordLocator(String amadeusRecordLocator) {
        this.amadeusRecordLocator = amadeusRecordLocator;
    }

    
}
