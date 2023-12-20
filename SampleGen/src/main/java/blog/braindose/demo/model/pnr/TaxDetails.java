package blog.braindose.demo.model.pnr;

public class TaxDetails {
    private String rate;
    private String countryCode;
    private String currencyCode;
    private String type;
    public String getRate() {
        return rate;
    }
    public void setRate(String rate) {
        this.rate = rate;
    }
    public String getCountryCode() {
        return countryCode;
    }
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
    public String getCurrencyCode() {
        return currencyCode;
    }
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    
}
