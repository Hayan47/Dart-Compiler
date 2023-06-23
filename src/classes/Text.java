package classes;

import java.util.List;

public class Text {
    public final String class_name = "Text";

    String text;
    List<Identifier> identifiers;
    Program program;


    public Text() {
    }

    public Text(String text) {
        this.text = text;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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
        s+="Text{" +
                "text='" + text + '\'';
        for (int i=0;i<identifiers.size();i++)
            s+="identifier" + String.valueOf(i+1) + "=" + identifiers.get(i) + "\n";
        if (program!=null)
            s+=", program=" + program;
        return s;
    }
    public String toHtml() {
        String html = "";
        if (identifiers.size() == 1){
            html+="<p>" +
                    identifiers.get(0).getParameter() +
                    "</p>";
        }
        return html;
    }

    public String toPhp() {
        String php = "";
        if (identifiers.size()>1){
            php+=   "?>\n" +
                    "    <html>\n" +
                    "     <span> " +
                    identifiers.get(0).getParameter() +
                    " : </span><?php echo $_POST['" +
                    identifiers.get(1).getParameter() +
                    "']; ?>\n" +
                    "     </html>\n" +
                    "<?php";
        }
        return php;
    }
}
