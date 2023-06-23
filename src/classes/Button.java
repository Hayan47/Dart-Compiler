package classes;

import java.util.List;

public class Button {
    String Button;
    String Label;
    List<Identifier> identifiers;
    String onPressed;
    String Navigator;

    Program program;
    public Button() {
    }

    public Button(String button, String label, List<Identifier> identifiers, String onPressed, String navigator, Program program) {
        Button = button;
        Label = label;
        this.identifiers = identifiers;
        this.onPressed = onPressed;
        Navigator = navigator;
        this.program = program;
    }

    public String getButton() {
        return Button;
    }

    public void setButton(String button) {
        Button = button;
    }

    public String getOnPressed() {
        return onPressed;
    }

    public void setOnPressed(String onPressed) {
        this.onPressed = onPressed;
    }

    public String getNavigator() {
        return Navigator;
    }

    public void setNavigator(String navigator) {
        Navigator = navigator;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
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

    @Override
    public String toString() {
        String s="";
        s+= "Button{" + "Button= " + Button  + '\'' +
                ", onPressed='" + onPressed + '\'' +
                ", Navigator='" + Navigator + '\'';
        if (Label!=null) {
            s += ", Label= " + Label;
        }
        if (identifiers!=null)
            for (int i=0;i<identifiers.size();i++)
                s+="identifier" + String.valueOf(i+1) + "=" + identifiers.get(i) + "\n";
        if (program!=null)
            s+=", program=" + program;
        return s;
    }

    public String toHtml() {
        String html = "";
        html+="<button type=\"submit\"";
        if (identifiers!=null) {
            html+= " name=\"" + identifiers.get(0).getParameter() + "\"";
        }
        html+=">";
        if (identifiers!=null) {
            html+= identifiers.get(0).getParameter();
        }
        html+="</button>";
        return html;
    }
    public String toPhp() {
        String php = "";
        php+="if (isset($_POST[";
        php+= "\'" + identifiers.get(0).getParameter() + "'";
        php+="])) {\n";
        if (onPressed!=null){
            php+="header('Location: " + identifiers.get(1).getParameter() +
                "\');\n"+
                "  exit;";
        }
//        php+="\n}\n";


        return php;
    }
}
