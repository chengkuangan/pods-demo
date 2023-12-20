package blog.braindose.demo.model.pnr;

public class ActivityReport {
    
    private String activityType;
    private String actionCode;
    private String elemType;
    private ElemRef elemRef;

    public String getActivityType() {
        return activityType;
    }
    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }
    public String getActionCode() {
        return actionCode;
    }
    public void setActionCode(String actionCode) {
        this.actionCode = actionCode;
    }
    public String getElemType() {
        return elemType;
    }
    public void setElemType(String elemType) {
        this.elemType = elemType;
    }
    public ElemRef getElemRef() {
        return elemRef;
    }
    public void setElemRef(ElemRef elemRef) {
        this.elemRef = elemRef;
    }

    

}
