package classes;

import java.util.List;

public class ConstructorrBody {
    public final String class_name = "Constructor Body";

    List<Keyword> keywords;
    List<Init> inits;

    public ConstructorrBody() {
    }

    public List<Keyword> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<Keyword> keywords) {
        this.keywords = keywords;
    }

    public List<Init> getInits() {
        return inits;
    }

    public void setInits(List<Init> inits) {
        this.inits = inits;
    }

    @Override
    public String toString() {
        String s="";
        s+="ConstructorrBody{";
        if (keywords!=null)
            for (int i=0;i<keywords.size();i++)
                s+="keywords" + String.valueOf(i+1) + "=" + keywords.get(i) + "\n";
        for (int i=0;i<inits.size();i++)
            s+="inits" + String.valueOf(i+1) + "=" + inits.get(i) + "\n";
        s+='}';
        return s;
    }
}
