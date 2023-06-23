package classes;

public class FunctionBody {
    public final String class_name = "Function Body";

    ForBody forBody;

    public FunctionBody() {
    }

    public ForBody getForBody() {
        return forBody;
    }

    public void setForBody(ForBody forBody) {
        this.forBody = forBody;
    }

    @Override
    public String toString() {
        String s="";
        s+="FunctionBody{" + "forBody=" + forBody + '}';
        return s;
    }

    public String toHtml() {
        String html = "<div class='function-body'>";

        if (forBody != null) {
            html += forBody.toHtml();
        }

        // Add HTML code for other components of the function body

        html += "</div>";
        return html;
    }

    public String toPhp() {
        String php = "";

        if (forBody != null) {
            php += "for (" + forBody.toPhp() + ") {\n    // Code for loop body\n}\n";
        }

        // Add PHP code for other components of the function body

        return php;
    }

}
