package classes;

public class Init {
    public final String class_name = "Init";

    Dec dec;
    Exp exp;

    public Init() {
    }

    public Dec getDec() {
        return dec;
    }

    public void setDec(Dec dec) {
        this.dec = dec;
    }

    public Exp getExp() {
        return exp;
    }

    public void setExp(Exp exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        String s="";
        s+="Init{";
        if (dec!=null)
            s+="dec=" + dec;
        if (exp!=null)
            s+=", exp=" + exp;
        s+='}';
        return s;
    }
}
