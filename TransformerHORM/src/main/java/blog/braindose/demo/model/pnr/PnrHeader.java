package blog.braindose.demo.model.pnr;

import java.util.ArrayList;

public class PnrHeader {

    private String pnrPurgeDate;
    private int currentEnvelopeNum;
    private int numEnvelopesSent;
    private ArrayList<ReservationInfo> reservationInfo;
    private ArrayList<SecurityInformation> securityInformation;
    private int numPaxInPNR;
    private String lastUpdatorOfficeID1;
    private String lastUpdatorAgentSine1;
    private String lastUpdatorReceivedFromInfo;
    private OwnerPosDetails ownerPosDetails;
    private CreationPosDetails creationPosDetails;
    private UpdatorPosDetails updatorPosDetails;
    private String bookingChannel;
    
    public String getPnrPurgeDate() {
        return pnrPurgeDate;
    }
    public void setPnrPurgeDate(String pnrPurgeDate) {
        this.pnrPurgeDate = pnrPurgeDate;
    }
    public int getCurrentEnvelopeNum() {
        return currentEnvelopeNum;
    }
    public void setCurrentEnvelopeNum(int currentEnvelopeNum) {
        this.currentEnvelopeNum = currentEnvelopeNum;
    }
    public int getNumEnvelopesSent() {
        return numEnvelopesSent;
    }
    public void setNumEnvelopesSent(int numEnvelopesSent) {
        this.numEnvelopesSent = numEnvelopesSent;
    }
    public ArrayList<ReservationInfo> getReservationInfo() {
        return reservationInfo;
    }
    public void setReservationInfo(ArrayList<ReservationInfo> reservationInfo) {
        this.reservationInfo = reservationInfo;
    }
    public ArrayList<SecurityInformation> getSecurityInformation() {
        return securityInformation;
    }
    public void setSecurityInformation(ArrayList<SecurityInformation> securityInformation) {
        this.securityInformation = securityInformation;
    }
    public int getNumPaxInPNR() {
        return numPaxInPNR;
    }
    public void setNumPaxInPNR(int numPaxInPNR) {
        this.numPaxInPNR = numPaxInPNR;
    }
    public String getLastUpdatorOfficeID1() {
        return lastUpdatorOfficeID1;
    }
    public void setLastUpdatorOfficeID1(String lastUpdatorOfficeID1) {
        this.lastUpdatorOfficeID1 = lastUpdatorOfficeID1;
    }
    public String getLastUpdatorAgentSine1() {
        return lastUpdatorAgentSine1;
    }
    public void setLastUpdatorAgentSine1(String lastUpdatorAgentSine1) {
        this.lastUpdatorAgentSine1 = lastUpdatorAgentSine1;
    }
    public String getLastUpdatorReceivedFromInfo() {
        return lastUpdatorReceivedFromInfo;
    }
    public void setLastUpdatorReceivedFromInfo(String lastUpdatorReceivedFromInfo) {
        this.lastUpdatorReceivedFromInfo = lastUpdatorReceivedFromInfo;
    }
    public OwnerPosDetails getOwnerPosDetails() {
        return ownerPosDetails;
    }
    public void setOwnerPosDetails(OwnerPosDetails ownerPosDetails) {
        this.ownerPosDetails = ownerPosDetails;
    }
    public CreationPosDetails getCreationPosDetails() {
        return creationPosDetails;
    }
    public void setCreationPosDetails(CreationPosDetails creationPosDetails) {
        this.creationPosDetails = creationPosDetails;
    }
    public UpdatorPosDetails getUpdatorPosDetails() {
        return updatorPosDetails;
    }
    public void setUpdatorPosDetails(UpdatorPosDetails updatorPosDetails) {
        this.updatorPosDetails = updatorPosDetails;
    }
    public String getBookingChannel() {
        return bookingChannel;
    }
    public void setBookingChannel(String bookingChannel) {
        this.bookingChannel = bookingChannel;
    }

    
}
