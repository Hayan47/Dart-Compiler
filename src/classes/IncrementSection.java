package classes;

import java.util.List;

public class IncrementSection {

    public final String class_name = "Increment Section";
    List<Identifier> identifiers;
    List<Operation> operations;

    public IncrementSection() {
    }

    public List<Identifier> getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(List<Identifier> identifiers) {
        this.identifiers = identifiers;
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }

    @Override
    public String toString() {
        String s="";
        s+="IncrementSection{";
        for (int i=0;i<identifiers.size();i++)
            s+="identifier" + String.valueOf(i+1) + "=" + identifiers.get(i) + "\n";
        for (int i=0;i<operations.size();i++)
            s+="operation" + String.valueOf(i+1) + "=" + operations.get(i) + "\n";
        s+='}';
        return  s;
    }
}
