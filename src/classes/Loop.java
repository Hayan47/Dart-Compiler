package classes;

public class Loop {
    public final String class_name = "Loop";

    For _for;
    While _while;

    public Loop() {
    }

    public For get_for() {
        return _for;
    }

    public void set_for(For _for) {
        this._for = _for;
    }

    public While get_while() {
        return _while;
    }

    public void set_while(While _while) {
        this._while = _while;
    }

    @Override
    public String toString() {
        String s="";
        s+="Loop{" ;
        if (_for!=null)
               s+= "_for=" + _for ;
        if (_while!=null)
            s+= ", _while=" + _while ;
        s+='}';
        return s;
    }

}
