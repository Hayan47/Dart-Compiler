package classes;

    import java.util.List;

public class Listt {
    public final String class_name = "Listt";

    DataType dataType;
    List<Identifier> identifiers;
    Operation operation;
    Keyword keyword;

    public Listt() {
    }

    public DataType getDataType() {
        return dataType;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

    public List<Identifier> getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(List<Identifier> identifiers) {
        this.identifiers = identifiers;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public Keyword getKeyword() {
        return keyword;
    }

    public void setKeyword(Keyword keyword) {
        this.keyword = keyword;
    }

    @Override
    public String toString() {
        String s="";
        s+="Listt{" +
                "dataType=" + dataType ;
        for (int i=0;i<identifiers.size();i++)
            s+="identifier" + String.valueOf(i+1) + "=" + identifiers.get(i) + "\n";
        s+= ", operation=" + operation +
                ", keyword=" + keyword +
                '}';
        return s;
    }
}
