package blog.braindose.demo.model.pnr;

public class TaxInformation {
    private String taxCategory;
    private TaxDetails taxDetails;
    public String getTaxCategory() {
        return taxCategory;
    }
    public void setTaxCategory(String taxCategory) {
        this.taxCategory = taxCategory;
    }
    public TaxDetails getTaxDetails() {
        return taxDetails;
    }
    public void setTaxDetails(TaxDetails taxDetails) {
        this.taxDetails = taxDetails;
    }
    
}
