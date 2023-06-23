package classes;

import java.util.List;

public class While {
    public final String class_name = "While";

    Whilew whilew;
    List<Identifier> identifiers;
    List<Operation> operations;
    WhileBody whileBody;

    public While() {
    }

    public Whilew getWhilew() {
        return whilew;
    }

    public void setWhilew(Whilew whilew) {
        this.whilew = whilew;
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

    public WhileBody getWhileBody() {
        return whileBody;
    }

    public void setWhileBody(WhileBody whileBody) {
        this.whileBody = whileBody;
    }

    @Override
    public String toString() {
        String s="";
        s+="While{" + "whilew=" + whilew;
        for (int i=0;i<identifiers.size();i++)
            s+="identifier" + String.valueOf(i+1) + "=" + identifiers.get(i) + "\n";
        for (int i=0;i<operations.size();i++)
            s+="program" + String.valueOf(i+1) + "=" + operations.get(i) + "\n";
        s+=", whileBody=" + whileBody;
        return s;
    }
}
