package blog.braindose.demo.model;

public class ActivityReport {
    
    public String activityType;
    private String actionCode;
    private String elemType;
    private String elemRefTattooType;
    private int elemRefTattooNum;

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
    public String getElemRefTattooType() {
        return elemRefTattooType;
    }
    public void setElemRefTattooType(String elemRefTattooType) {
        this.elemRefTattooType = elemRefTattooType;
    }
    public int getElemRefTattooNum() {
        return elemRefTattooNum;
    }
    public void setElemRefTattooNum(int elemRefTattooNum) {
        this.elemRefTattooNum = elemRefTattooNum;
    }

    
}
