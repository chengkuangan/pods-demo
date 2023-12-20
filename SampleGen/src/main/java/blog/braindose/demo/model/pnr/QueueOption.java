package blog.braindose.demo.model.pnr;

import java.util.Date;

public class QueueOption {

    private String mainOffice;
    private Date queueOptDateTime;
    private int queue;
    private int category;
    private String freetext;
    public String getMainOffice() {
        return mainOffice;
    }
    public void setMainOffice(String mainOffice) {
        this.mainOffice = mainOffice;
    }
    public Date getQueueOptDateTime() {
        return queueOptDateTime;
    }
    public void setQueueOptDateTime(Date queueOptDateTime) {
        this.queueOptDateTime = queueOptDateTime;
    }
    public int getQueue() {
        return queue;
    }
    public void setQueue(int queue) {
        this.queue = queue;
    }
    public int getCategory() {
        return category;
    }
    public void setCategory(int category) {
        this.category = category;
    }
    public String getFreetext() {
        return freetext;
    }
    public void setFreetext(String freetext) {
        this.freetext = freetext;
    }

    
}
