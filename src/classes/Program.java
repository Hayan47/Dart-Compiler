package classes;

import java.util.List;

public class Program {

    public final String class_name = "Program";
    List<Dec> dec;
    List<Loop> loops;
    List<Condition> con;
    List<Function> fun;
    List<Classs> _class;
    List<Exp> exps;
    List<CallFunction> callFunctions;
    List<Listt> listts;
    List<ListAsParameter> listAsParameters;
    Container container;
    Text text;
    List<ListWedget> listtss;

    public Program() {
    }

    public Container getContainer() {
        return container;
    }

    public void setContainer(Container container) {
        this.container = container;
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public List<ListWedget> getListtss() {
        return listtss;
    }

    public void setListtss(List<ListWedget> listtss) {
        this.listtss = listtss;
    }

    public List<Dec> getDec() {
        return dec;
    }

    public void setDec(List<Dec> dec) {
        this.dec = dec;
    }

    public List<Loop> getLoops() {
        return loops;
    }

    public void setLoops(List<Loop> loops) {
        this.loops = loops;
    }

    public List<Condition> getCon() {
        return con;
    }

    public void setCon(List<Condition> con) {
        this.con = con;
    }

    public List<Function> getFun() {
        return fun;
    }

    public void setFun(List<Function> fun) {
        this.fun = fun;
    }

    public List<Classs> get_class() {
        return _class;
    }

    public void set_class(List<Classs> _class) {
        this._class = _class;
    }

    public List<Exp> getExps() {
        return exps;
    }

    public void setExps(List<Exp> exps) {
        this.exps = exps;
    }

    public List<CallFunction> getCallFunctions() {
        return callFunctions;
    }

    public void setCallFunctions(List<CallFunction> callFunctions) {
        this.callFunctions = callFunctions;
    }

    public List<Listt> getListts() {
        return listts;
    }

    public void setListts(List<Listt> listts) {
        this.listts = listts;
    }

    public List<ListAsParameter> getListAsParameters() {
        return listAsParameters;
    }

    public void setListAsParameters(List<ListAsParameter> listAsParameters) {
        this.listAsParameters = listAsParameters;
    }

    @Override
    public String toString() {
        String s="";
        s+="Program{";

        if (dec!=null)
            for (int i=0;i<dec.size();i++)
                s+="dec" + String.valueOf(i+1) + "=" + dec.get(i) + "\n";

        if (loops!=null)
            for (int i=0;i<loops.size();i++)
                s+="loop" + String.valueOf(i+1) + "=" + loops.get(i) + "\n";

        if (con!=null)
            for (int i=0;i<con.size();i++)
                s+="con" + String.valueOf(i+1) + "=" + con.get(i) + "\n";
        if (fun!=null)
            for (int i=0;i<fun.size();i++)
                s+="fun" + String.valueOf(i+1) + "=" + fun.get(i) + "\n";

        if (_class!=null)
            for (int i=0;i<_class.size();i++)
                s+="_class" + String.valueOf(i+1) + "=" + _class.get(i) + "\n";

        if (exps!=null)
            for (int i=0;i<exps.size();i++)
                s+="exp" + String.valueOf(i+1) + "=" + exps.get(i) + "\n";

        if (callFunctions!=null)
            for (int i=0;i<callFunctions.size();i++)
                s+="callFunction" + String.valueOf(i+1) + "=" + callFunctions.get(i) + "\n";

        if (listts!=null)
            for (int i=0;i<listts.size();i++)
                s+="listt" + String.valueOf(i+1) + "=" + listts.get(i) + "\n";

        if (listAsParameters!=null)
            for (int i=0;i<listAsParameters.size();i++)
                s+="listAsParameters" + String.valueOf(i+1) + "=" + listAsParameters.get(i) + "\n";

        if (container!=null)
            s+="Container" + container;
        if (text!=null)
            s+="Text"+ text;
        if (listts!=null)
            for (int i=0;i<listtss.size();i++)
                s+="listtss" + String.valueOf(i+1) + "=" + listtss.get(i) + "\n";
        s+='}';
        return s;
    }

    public String toHtml() {
        String html = "";
        // Add HTML code for each component of the program
        if (container != null) {
            html += container.toHtml();
        }
        if (text != null) {
            html += text.toHtml();
        }
        if (listtss != null) {
            for (int i=0;i<listtss.size();i++)
                html += listtss.get(i).toHtml();
        }
        if (dec != null) {
            for (Dec d : dec) {
                html += d.toHtml();
            }
        }
        if (loops != null) {
            for (Loop l : loops) {
              //  html += l.toHtml();
            }
        }
        // Add HTML code for other components of the program

        return html;
    }

    public String toPhp() {
        String php = "";

        // Add PHP code for each component of the program
        if (container != null) {
            //php += container.toPhp();
        }
        if (text != null) {
           // php += text.toPhp();
        }
        if (listtss != null) {
            for (int i=0;i<listtss.size();i++)
                php += listtss.get(i).toPhp();
        }
        if (dec != null) {
            for (Dec d : dec) {
                php += d.toPhp();
            }
        }
        if (loops != null) {
            for (Loop l : loops) {
                //php += l.toPhp();
            }
        }
        if (text != null) {
            php += text.toPhp();
        }
        // Add PHP code for other components of the program

        php += "";
        return php;
    }
   }
