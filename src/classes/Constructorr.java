package classes;

import java.util.List;

public class Constructorr {
    public final String class_name = "Constructor";

    Identifier identifier;
    List<ConstructorrHeader> constructorrHeader;
    ConstructorrBody constructorrBody;

    public Constructorr() {
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public List<ConstructorrHeader> getConstructorrHeader() {
        return constructorrHeader;
    }

    public void setConstructorrHeader(List<ConstructorrHeader> constructorrHeader) {
        this.constructorrHeader = constructorrHeader;
    }

    public ConstructorrBody getConstructorrBody() {
        return constructorrBody;
    }

    public void setConstructorrBody(ConstructorrBody constructorrBody) {
        this.constructorrBody = constructorrBody;
    }

    @Override
    public String toString() {
        String s="";
        s+="Constructorr{" + "identifier=" + identifier;
        if(constructorrHeader!=null)
            for (int i=0;i<constructorrHeader.size();i++)
                s+="constructureHeader" + String.valueOf(i+1) + "=" + constructorrHeader.get(i) + "\n";
        s+=", constructorrBody=" + constructorrBody +
                '}';
        return s;
    }
}
