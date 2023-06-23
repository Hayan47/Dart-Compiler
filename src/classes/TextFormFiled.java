package classes;

import java.util.List;

public class TextFormFiled {
    public final String class_name = "TextFormFiled";

    String textFormField;
    String Label;
    List<Identifier> identifiers;
    String Controller;
    Program program;

    public TextFormFiled() {
    }

    public TextFormFiled(String textFormField, String label, List<Identifier> identifiers, String controller, Program program) {
        this.textFormField = textFormField;
        Label = label;
        this.identifiers = identifiers;
        Controller = controller;
        this.program = program;
    }

    public String getTextFormField() {
        return textFormField;
    }

    public void setTextFormField(String textFormField) {
        this.textFormField = textFormField;
    }

    public String getLabel() {
        return Label;
    }

    public void setLabel(String label) {
        Label = label;
    }

    public List<Identifier> getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(List<Identifier> identifiers) {
        this.identifiers = identifiers;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public String getController() {
        return Controller;
    }

    public void setController(String controller) {
        Controller = controller;
    }

    @Override
    public String toString() {
        String s="";
        s+= "TextFormFiled{" + "textFormField= " + textFormField;
        if (Label!=null) {
            s += ", Label= " + Label;
        }
        if (identifiers!=null) {
            for (int i = 0; i < identifiers.size(); i++) {
                s += "identifier" + String.valueOf(i + 1) + "=" + identifiers.get(i) + "\n";
            }
        }
        if (Controller!=null) {
            s += ", controller=" + Controller;
        }
        if (program!=null) {
            s += ", program=" + program;
        }
        return s;
    }
    public String toHtml() {
        String html = "";
        if (Label!=null) {
            html+= "<p>" + identifiers.get(0).toHtml() + ":";
        }
        html+="<input type=\"text\"";
        if (Controller!=null){
            html+=" name=\"" + identifiers.get(1).getParameter();
            html+="\"/>";
        }
        if (Label!=null) {
            html+= "</p>";
        }
        return html;
    }
    public  String toPhp(){
        String php = "";
//        php+="echo $_POST['";
//        php+= identifiers.get(1).getParameter();
//        php+="'] . '<br>';\n  ";
        return php;
    }

}
