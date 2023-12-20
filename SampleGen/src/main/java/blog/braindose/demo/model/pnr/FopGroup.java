package blog.braindose.demo.model.pnr;

import java.util.ArrayList;

public class FopGroup {
    private ArrayList<FopDetail> fopDetails;
    private String fopSequenceNum;
    private String textSubjectQualifier;
    private String source;
    private String encoding;
    private String freeText;
    
    public ArrayList<FopDetail> getFopDetails() {
        return fopDetails;
    }
    public void setFopDetails(ArrayList<FopDetail> fopDetails) {
        this.fopDetails = fopDetails;
    }
    public String getFopSequenceNum() {
        return fopSequenceNum;
    }
    public void setFopSequenceNum(String fopSequenceNum) {
        this.fopSequenceNum = fopSequenceNum;
    }
    public String getTextSubjectQualifier() {
        return textSubjectQualifier;
    }
    public void setTextSubjectQualifier(String textSubjectQualifier) {
        this.textSubjectQualifier = textSubjectQualifier;
    }
    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }
    public String getEncoding() {
        return encoding;
    }
    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }
    public String getFreeText() {
        return freeText;
    }
    public void setFreeText(String freeText) {
        this.freeText = freeText;
    }

    
}
