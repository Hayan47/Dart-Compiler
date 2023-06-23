package classes;

import java.util.List;

public class Exp1 {
    public final String class_name = "Exp1";

    List<Operation> operations;
    List<Identifier> identifiers;

    public Exp1() {
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }

    public List<Identifier> getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(List<Identifier> identifiers) {
        this.identifiers = identifiers;
    }

    @Override
    public String toString() {
        String s="";
        s+="Exp1{";
        if (operations!=null)
            for(int i=0;i<operations.size();i++)
                s+= "operation" + String.valueOf(i+1) + "=" + operations.get(i) + "\n";
        if (identifiers!=null)
            for(int i=0;i<identifiers.size();i++)
                s+= "identifier" + String.valueOf(i+1) + "=" + identifiers.get(i) + "\n";
        s+='}';
            return s;
    }


}
