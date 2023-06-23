package classes;

public class Exp {
    public final String class_name = "Exp";

    Identifier identifier;
    Exp1 exp1;

    public Exp() {
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public Exp1 getExp1() {
        return exp1;
    }

    public void setExp1(Exp1 exp1) {
        this.exp1 = exp1;
    }

    @Override
    public String toString() {
        String s="";
        s+="Exp{" +
                "identifier=" + identifier +
                ", exp1=" + exp1 +
                '}';
        return s;
    }
}
