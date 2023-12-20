package blog.braindose.demo.model.pnr;

import java.util.ArrayList;

public class DataElementsStruct {
    private ElemRef elemRef;
    private String elemType;
    private ArrayList<Association> association;
    private ArrayList<IdSection> idSection;
    private ArrayList<FopGroup> fopGroup;
    
    public ElemRef getElemRef() {
        return elemRef;
    }
    public void setElemRef(ElemRef elemRef) {
        this.elemRef = elemRef;
    }
    public String getElemType() {
        return elemType;
    }
    public void setElemType(String elemType) {
        this.elemType = elemType;
    }
    public ArrayList<Association> getAssociation() {
        return association;
    }
    public void setAssociation(ArrayList<Association> association) {
        this.association = association;
    }
    public ArrayList<IdSection> getIdSection() {
        return idSection;
    }
    public void setIdSection(ArrayList<IdSection> idSection) {
        this.idSection = idSection;
    }
    public ArrayList<FopGroup> getFopGroup() {
        return fopGroup;
    }
    public void setFopGroup(ArrayList<FopGroup> fopGroup) {
        this.fopGroup = fopGroup;
    }

    
}
