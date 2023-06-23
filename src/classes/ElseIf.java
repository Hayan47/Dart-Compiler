package classes;

public class ElseIf {
    public final String class_name = "Else If";

    Elsew _else;
    If _if;

    public ElseIf() {
    }

    public Elsew get_else() {
        return _else;
    }

    public void set_else(Elsew _else) {
        this._else = _else;
    }

    public If get_if() {
        return _if;
    }

    public void set_if(If _if) {
        this._if = _if;
    }

    @Override
    public String toString() {
        String s="";
        s+="ElseIf{" +
                "_else=" + _else +
                ", _if=" + _if +
                '}';
        return s;
    }
}
