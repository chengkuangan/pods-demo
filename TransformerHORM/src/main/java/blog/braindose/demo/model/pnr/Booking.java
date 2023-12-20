package blog.braindose.demo.model.pnr;

import java.util.ArrayList;

public class Booking {
    private ArrayList<ActivityReport> activityReport;
    private ActivePNRimage activePNRimage;
    private ActMarker actMarker;
    public ArrayList<ActivityReport> getActivityReport() {
        return activityReport;
    }
    public void setActivityReport(ArrayList<ActivityReport> activityReport) {
        this.activityReport = activityReport;
    }
    public ActivePNRimage getActivePNRimage() {
        return activePNRimage;
    }
    public void setActivePNRimage(ActivePNRimage activePNRimage) {
        this.activePNRimage = activePNRimage;
    }
    public ActMarker getActMarker() {
        return actMarker;
    }
    public void setActMarker(ActMarker actMarker) {
        this.actMarker = actMarker;
    }

    
}
