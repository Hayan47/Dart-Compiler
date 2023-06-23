package classes;
import java.util.List;

public class If {
    public final String class_name = "If";

    Ifw iff;
    List <Identifier> identifiers;
    List <Operation> operation;
    IfBody ifBody;

    public If() {
    }

    public Ifw get_if() {
        return iff;
    }

    public void set_if(Ifw iff) {
        this.iff = iff;
    }

    public List<Identifier> getParameter() {
        return identifiers;
    }

    public void setIdentifiers(List<Identifier> identifiers) {
        this.identifiers = identifiers;
    }

    public List<Operation> getOperation() {
        return operation;
    }

    public void setOperation(List<Operation> operation) {
        this.operation = operation;
    }

    public IfBody getIfBody() {
        return ifBody;
    }

    public void setIfBody(IfBody ifBody) {
        this.ifBody = ifBody;
    }

    @Override
    public String toString() {
        String s ="";
        s+="If{" +
                "_if=" + iff;
        if(identifiers!=null)
            for (int i=0;i<identifiers.size();i++)
                s+="identifier" + String.valueOf(i+1) + "=" + identifiers.get(i) + "\n";
        if(operation!=null)
            for (int i=0;i<operation.size();i++)
                s+="operation" + String.valueOf(i+1) + "=" + operation.get(i) + "\n";
        s+=", ifBody=" + ifBody +
                        '}';
        return  s;

    }
    public String toHtml() {
        String html = "";
//        html+="if(isset($_POST['" +
//                identifiers.get(0).getParameter()  + "']) " +
//                "&& " +
//                "isset($_POST[" +
//                "'" +
//                identifiers.get(2).getParameter() +
//                "']))";
        return html;
    }

    public  String toPhp(){
        String php = "";
        php+="if(isset($_POST['" +
             identifiers.get(0).getParameter()  + "']) " +
                "&& " +
                "isset($_POST[" +
                "'" +
                identifiers.get(2).getParameter() +
                "']))";
        if (ifBody!=null){
            php+=ifBody.toPhp();
        }
        return php;
    }
}
