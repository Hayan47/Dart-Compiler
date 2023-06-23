package classes;

//import gen.comParser;

public class For {
    public final String class_name = "For";

    String FOR;
    Init init;
    Exp exp;
    IncrementSection incSec;
    ForBody forBody;


    public For() {
    }

    public For(String FOR) {
        this.FOR = FOR;
    }

    public String getFOR() {
        return FOR;
    }

    public void setFOR(String FOR) {
        this.FOR = FOR;
    }

    public Init getInit() {
        return init;
    }

    public void setInit(Init init) {
        this.init = init;
    }

    public Exp getExp() {
        return exp;
    }

    public void setExp(Exp exp) {
        this.exp = exp;
    }

    public IncrementSection getIncSec() {
        return incSec;
    }

    public void setIncSec(IncrementSection incSec) {
        this.incSec = incSec;
    }

    public ForBody getForBody() {
        return forBody;
    }

    public void setForBody(ForBody forBody) {
        this.forBody = forBody;
    }

    @Override
    public String toString() {
        String s="";
        s+="For{" +
                "FOR='" + FOR + '\n';
        if(init!=null)
            s+= ", init=" + init;
        if(exp!=null)
            s+= ", exp=" + exp;
        if(incSec!=null)
            s+= ", incSec=" + incSec;
        s+=", forBody=" + forBody +
                '}';
        return s;


    }
}

