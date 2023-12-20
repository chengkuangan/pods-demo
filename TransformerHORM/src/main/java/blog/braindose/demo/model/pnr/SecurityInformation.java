package blog.braindose.demo.model.pnr;

public class SecurityInformation {
    
    private ResponsibilityInformation responsibilityInformation;
    private QueueingInformation queueingInformation;
    private SecondRpInformation secondRpInformation;
    
    public ResponsibilityInformation getResponsibilityInformation() {
        return responsibilityInformation;
    }
    public void setResponsibilityInformation(ResponsibilityInformation responsibilityInformation) {
        this.responsibilityInformation = responsibilityInformation;
    }
    public QueueingInformation getQueueingInformation() {
        return queueingInformation;
    }
    public void setQueueingInformation(QueueingInformation queueingInformation) {
        this.queueingInformation = queueingInformation;
    }
    public SecondRpInformation getSecondRpInformation() {
        return secondRpInformation;
    }
    public void setSecondRpInformation(SecondRpInformation secondRpInformation) {
        this.secondRpInformation = secondRpInformation;
    }

    

}
