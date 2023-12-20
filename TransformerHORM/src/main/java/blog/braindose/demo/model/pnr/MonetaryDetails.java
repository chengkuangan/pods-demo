package blog.braindose.demo.model.pnr;

public class MonetaryDetails {
    private String typeQualifier;
    private String amount;
    private String currency;
    public String getTypeQualifier() {
        return typeQualifier;
    }
    public void setTypeQualifier(String typeQualifier) {
        this.typeQualifier = typeQualifier;
    }
    public String getAmount() {
        return amount;
    }
    public void setAmount(String amount) {
        this.amount = amount;
    }
    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    
}
