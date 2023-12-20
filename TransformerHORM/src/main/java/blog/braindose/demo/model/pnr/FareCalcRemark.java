package blog.braindose.demo.model.pnr;

import java.util.ArrayList;

public class FareCalcRemark {
    private FreeTextDetails freeTextDetails;
    private ArrayList<String> freeText;
    public FreeTextDetails getFreeTextDetails() {
        return freeTextDetails;
    }
    public void setFreeTextDetails(FreeTextDetails freeTextDetails) {
        this.freeTextDetails = freeTextDetails;
    }
    public ArrayList<String> getFreeText() {
        return freeText;
    }
    public void setFreeText(ArrayList<String> freeText) {
        this.freeText = freeText;
    }

    
}
