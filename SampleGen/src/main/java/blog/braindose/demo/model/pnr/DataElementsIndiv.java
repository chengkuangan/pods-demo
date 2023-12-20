package blog.braindose.demo.model.pnr;

import java.util.ArrayList;

public class DataElementsIndiv {
    private ElemRef elemRef;
    private String elemType;
    private ArrayList<Association> association;
    private ServiceRequest serviceRequest;
    private SsrIndicator ssrIndicator;
    private ArrayList<OtherDataFreetext> otherDataFreetext;
    private QueueOption queueOption;
    private TicketElement ticketElement;

    public ElemRef getElemRef() {
        return elemRef;
    }
    public void setElemRef(ElemRef elemRef) {
        this.elemRef = elemRef;
    }
    public String getElemType() {
        return elemType;
    }
    public void setElemType(String elemType) {
        this.elemType = elemType;
    }
    public ArrayList<Association> getAssociation() {
        return association;
    }
    public void setAssociation(ArrayList<Association> association) {
        this.association = association;
    }
    public ServiceRequest getServiceRequest() {
        return serviceRequest;
    }
    public void setServiceRequest(ServiceRequest serviceRequest) {
        this.serviceRequest = serviceRequest;
    }
    public SsrIndicator getSsrIndicator() {
        return ssrIndicator;
    }
    public void setSsrIndicator(SsrIndicator ssrIndicator) {
        this.ssrIndicator = ssrIndicator;
    }
    public ArrayList<OtherDataFreetext> getOtherDataFreetext() {
        return otherDataFreetext;
    }
    public void setOtherDataFreetext(ArrayList<OtherDataFreetext> otherDataFreetext) {
        this.otherDataFreetext = otherDataFreetext;
    }
    public TicketElement getTicketElement() {
        return ticketElement;
    }
    public void setTicketElement(TicketElement ticketElement) {
        this.ticketElement = ticketElement;
    }
    public QueueOption getQueueOption() {
        return queueOption;
    }
    public void setQueueOption(QueueOption queueOption) {
        this.queueOption = queueOption;
    }

    
}
