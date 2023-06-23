package classes;

import java.util.List;

public class ListAsParameter {
    public final String class_name = "List as Parameter";
    List<Identifier> identifiers;
    Operation operation;

    public ListAsParameter() {
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

    @Override
    public String toString() {
        String s="";
        s+="ListAsParameter{" ;
            for (int i=0;i<identifiers.size();i++)
                s+="identifier" + String.valueOf(i+1) + "=" + identifiers.get(i) + "\n";
         s+=", operation=" + operation +
                '}';
         return s;
    }
}
