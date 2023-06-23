package classes;

public class Else {
    public final String class_name = "Else";

    Elsew elsew;
    IfBody ifBody;

    public Else() {
    }

    public Elsew get_elsew() {
        return elsew;
    }

    public void set_elsew(Elsew elsew) {
        this.elsew = elsew;
    }

    public IfBody getIfBody() {
        return ifBody;
    }

    public void setIfBody(IfBody ifBody) {
        this.ifBody = ifBody;
    }

    @Override
    public String toString() {
        String s="";
        s+="Else{" +
                "_elsew=" + elsew +
                ", ifBody=" + ifBody +
                '}';
        return s;
    }
}
