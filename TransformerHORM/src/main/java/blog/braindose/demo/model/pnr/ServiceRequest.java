package blog.braindose.demo.model.pnr;

import java.util.ArrayList;

public class ServiceRequest {
    private String type;
    private String status;
    private int quantity;
    private String companyId;
    private ArrayList<String> freeText;
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getCompanyId() {
        return companyId;
    }
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }
    public ArrayList<String> getFreeText() {
        return freeText;
    }
    public void setFreeText(ArrayList<String> freeText) {
        this.freeText = freeText;
    }

    
}
