package classes;

public class Identifier {
    public final String class_name = "Identifier";

    String parameter;

    public Identifier() {
    }

    public Identifier(String parameter) {
        this.parameter = parameter;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    @Override
    public String toString() {
        return "Identifier{" +
                "parameter='" + parameter + '\'' +
                '}';
    }
    public String toHtml() {
        String html = "<span class='identifier'>" + parameter + "</span>";
        return html;
    }
    public String toPhp() {
        String php = "$" + parameter;
        return php;
    }
}