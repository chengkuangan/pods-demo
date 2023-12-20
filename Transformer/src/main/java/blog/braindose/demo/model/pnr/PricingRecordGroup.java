package blog.braindose.demo.model.pnr;

import java.util.ArrayList;

public class PricingRecordGroup {
    private ArrayList<ProductPricingQuotationRecord> productPricingQuotationRecord;

    public ArrayList<ProductPricingQuotationRecord> getProductPricingQuotationRecord() {
        return productPricingQuotationRecord;
    }

    public void setProductPricingQuotationRecord(ArrayList<ProductPricingQuotationRecord> productPricingQuotationRecord) {
        this.productPricingQuotationRecord = productPricingQuotationRecord;
    }
    
}
