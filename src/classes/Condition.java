package classes;

import java.util.List;

public class Condition {
    public final String class_name = "Condition";

    If _if;
    List<ElseIf> _elseif;
    Else _else;

    public Condition() {
    }

    public If get_if() {
        return _if;
    }

    public void set_if(If _if) {
        this._if = _if;
    }

    public List<ElseIf> get_elseif() {
        return _elseif;
    }

    public void set_elseif(List<ElseIf> _elseif) {
        this._elseif = _elseif;
    }

    public Else get_else() {
        return _else;
    }

    public void set_else(Else _else) {
        this._else = _else;
    }

    @Override
    public String toString() {
        String s="";
        s+="Condition{" + "_if=" + _if;
        if(_elseif!=null)
            s+=", _elseif=" + _elseif;
        if (_else!=null)
            s+=", _else=" + _else;
        s+='}';
        return s;

        }
}
