package blog.braindose.demo.model.pnr;

public class YieldDataGroup {
    private int bidPriceAmount;
    private int yieldAmount;
    private int adjustedYieldAmount;
    private int effectiveYieldAmount;
    private String yieldClassOfService;
    private String yieldOrigin;
    private String yieldDestination;
    private String tripOrigin;
    private String tripDestination;
    
    public int getBidPriceAmount() {
        return bidPriceAmount;
    }
    public void setBidPriceAmount(int bidPriceAmount) {
        this.bidPriceAmount = bidPriceAmount;
    }
    public int getYieldAmount() {
        return yieldAmount;
    }
    public void setYieldAmount(int yieldAmount) {
        this.yieldAmount = yieldAmount;
    }
    public int getAdjustedYieldAmount() {
        return adjustedYieldAmount;
    }
    public void setAdjustedYieldAmount(int adjustedYieldAmount) {
        this.adjustedYieldAmount = adjustedYieldAmount;
    }
    public int getEffectiveYieldAmount() {
        return effectiveYieldAmount;
    }
    public void setEffectiveYieldAmount(int effectiveYieldAmount) {
        this.effectiveYieldAmount = effectiveYieldAmount;
    }
    public String getYieldClassOfService() {
        return yieldClassOfService;
    }
    public void setYieldClassOfService(String yieldClassOfService) {
        this.yieldClassOfService = yieldClassOfService;
    }
    public String getYieldOrigin() {
        return yieldOrigin;
    }
    public void setYieldOrigin(String yieldOrigin) {
        this.yieldOrigin = yieldOrigin;
    }
    public String getYieldDestination() {
        return yieldDestination;
    }
    public void setYieldDestination(String yieldDestination) {
        this.yieldDestination = yieldDestination;
    }
    public String getTripOrigin() {
        return tripOrigin;
    }
    public void setTripOrigin(String tripOrigin) {
        this.tripOrigin = tripOrigin;
    }
    public String getTripDestination() {
        return tripDestination;
    }
    public void setTripDestination(String tripDestination) {
        this.tripDestination = tripDestination;
    }

    
}
