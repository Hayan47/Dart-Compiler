package classes;

public class Parameter {
    public final String class_name = "Parameter";

    String parameter;

    public Parameter() {
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    @Override
    public String toString() {
        return "Parameter{" +
                "parameter='" + parameter + '\'' +
                '}';
    }
}
