package classes;

import java.util.List;

public class HeaderBody {
    public final String class_name = "Header Body";

    List<Identifier> identifiers;

    public HeaderBody() {
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
        s+="HeaderBody{";
        if (identifiers!=null)
            for (int i=0;i<identifiers.size();i++)
                s+="identifier" + String.valueOf(i+1) + "=" + identifiers.get(i) + "\n";
        s+='}';
        return s;
    }
}
