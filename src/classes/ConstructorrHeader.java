package classes;

import java.util.List;

public class ConstructorrHeader {
    public final String class_name = "Constructor Header";

    List<DataType> dataType;
   List<Identifier> identifier;

    public ConstructorrHeader() {
    }

    public List<DataType> getDataType() {
        return dataType;
    }

    public void setDataType(List<DataType> dataType) {
        this.dataType = dataType;
    }

    public List<Identifier> getIdentifier() {
        return identifier;
    }

    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        String s="";
        s+= "ConstructorrHeader{" ;
        for (int i=0;i<dataType.size();i++)
            s+="dataType" + String.valueOf(i+1) + "=" + dataType.get(i) + "\n";
        for (int i=0;i<identifier.size();i++)
            s+="identifier" + String.valueOf(i+1) + "=" + identifier.get(i) + "\n";
        s+= '}';
        return s;
    }
}
