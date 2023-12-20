package blog.braindose.demo.model.pnr;

public class BaggageDetails {
    private String quantityCode;
    private String unitQualifier;
    private int freeAllowance;
    public String getQuantityCode() {
        return quantityCode;
    }
    public void setQuantityCode(String quantityCode) {
        this.quantityCode = quantityCode;
    }
    public String getUnitQualifier() {
        return unitQualifier;
    }
    public void setUnitQualifier(String unitQualifier) {
        this.unitQualifier = unitQualifier;
    }
    public int getFreeAllowance() {
        return freeAllowance;
    }
    public void setFreeAllowance(int freeAllowance) {
        this.freeAllowance = freeAllowance;
    }

    
}
