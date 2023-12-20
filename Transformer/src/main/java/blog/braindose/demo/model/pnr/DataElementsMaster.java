package blog.braindose.demo.model.pnr;

import java.util.ArrayList;

public class DataElementsMaster {
    private Marker2 marker2;
    private ArrayList<DataElementsIndiv> dataElementsIndiv;
    private Marker3 marker3;
    private ArrayList<DataElementsStruct> dataElementsStruct;
    public Marker2 getMarker2() {
        return marker2;
    }
    public void setMarker2(Marker2 marker2) {
        this.marker2 = marker2;
    }
    public ArrayList<DataElementsIndiv> getDataElementsIndiv() {
        return dataElementsIndiv;
    }
    public void setDataElementsIndiv(ArrayList<DataElementsIndiv> dataElementsIndiv) {
        this.dataElementsIndiv = dataElementsIndiv;
    }
    public Marker3 getMarker3() {
        return marker3;
    }
    public void setMarker3(Marker3 marker3) {
        this.marker3 = marker3;
    }
    public ArrayList<DataElementsStruct> getDataElementsStruct() {
        return dataElementsStruct;
    }
    public void setDataElementsStruct(ArrayList<DataElementsStruct> dataElementsStruct) {
        this.dataElementsStruct = dataElementsStruct;
    }

    
}
