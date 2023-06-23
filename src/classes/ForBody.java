package classes;

import java.util.List;

public class ForBody {
    public final String class_name = "For Body";

    List<Program> program;

    public ForBody() {
    }

    public List<Program> getProgram() {
        return program;
    }

    public void setProgram(List<Program> program) {
        this.program = program;
    }

    @Override
    public String toString() {
        String s="";
         s+="ForBody{";
            for (int i=0;i<program.size();i++)
                s+="program" + String.valueOf(i+1) + "=" + program.get(i) + "\n";
         s+= '}';
        return s;
    }
    public String toHtml() {
        String html = "<div class='for-body'>";

        if (program != null) {
            for (Program p : program) {
                html += p.toHtml();
            }
        }

        html += "</div>";
        return html;
    }
    public String toPhp() {
        String php = "";

        if (program != null) {
            for (Program p : program) {
                php += p.toPhp() + ";\n";
            }
        }

        return php;
    }
}
