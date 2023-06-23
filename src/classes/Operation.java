package classes;

public class Operation {
    public final String class_name = "Operation";

    String operation;

    public Operation() {
    }

    public Operation(String operation) {
        this.operation = operation;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        String s="";
        if (operation!=null)
             s+="Operation{" + "operation='" + operation + '\n' + '}';;
        return s;
    }
    public String toHtml() {
        String html = "<span class='operation'>" + operation + "</span>";
        return html;
    }
    public String toPhp() {
        String php = "";

        switch (operation) {
            case "+":
                php = "+";
                break;
            case "-":
                php = "-";
                break;
            case "*":
                php = "*";
                break;
            case "/":
                php = "/";
                break;
            case "%":
                php = "%";
                break;
            case "=":
                php = "=";
                break;
            case "==":
                php = "==";
                break;
            case "!=":
                php = "!=";
                break;
            case "<":
                php = "<";
                break;
            case ">":
                php = ">";
                break;
            case "<=":
                php = "<=";
                break;
            case ">=":
                php = ">=";
                break;
            case "&&":
                php = "&&";
                break;
            case "||":
                php = "||";
                break;
            case "++":
                php = "++";
                break;
            case "--":
                php = "--";
                break;
            default:
                php = "";
                break;
        }

        return php;
    }
}
