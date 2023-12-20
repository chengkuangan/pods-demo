package blog.braindose.demo.model.pnr;

import java.util.Date;

public class SecondRpInformation {
    private String creationOfficeId;
    private String agentSignature;
    private String creatorIataCode;
    private Date pnrCreationDateTime;
    
    public String getCreationOfficeId() {
        return creationOfficeId;
    }
    public void setCreationOfficeId(String creationOfficeId) {
        this.creationOfficeId = creationOfficeId;
    }
    public String getAgentSignature() {
        return agentSignature;
    }
    public void setAgentSignature(String agentSignature) {
        this.agentSignature = agentSignature;
    }
    public String getCreatorIataCode() {
        return creatorIataCode;
    }
    public void setCreatorIataCode(String creatorIataCode) {
        this.creatorIataCode = creatorIataCode;
    }
    public Date getPnrCreationDateTime() {
        return pnrCreationDateTime;
    }
    public void setPnrCreationDateTime(Date pnrCreationDateTime) {
        this.pnrCreationDateTime = pnrCreationDateTime;
    }

    
}
