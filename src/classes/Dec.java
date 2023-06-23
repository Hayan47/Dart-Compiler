package classes;

public class Dec {

    public final String class_name = "Dec";

    DataType dataType;
    Identifier identifier1;

    Operation operation;
    Identifier identifier2;

    public Dec() {
    }

    public DataType getDataType() {
        return dataType;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

    public Identifier getIdentifier1() {
        return identifier1;
    }

    public void setIdentifier1(Identifier identifier1) {
        this.identifier1 = identifier1;
    }


    public Identifier getIdentifier2() {
        return identifier2;
    }

    public void setIdentifier2(Identifier identifier2) {
        this.identifier2 = identifier2;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }



    @Override
    public String toString() {
        String s="";
        s+="Dec{" + "dataType=" + dataType + ", identifier=" + identifier1;
        if (operation!=null)
            s+=", operation=" + operation ;
        s+='}';

        return s;
    }

    public String toHtml() {
        String html = "<div class='dec'><span class='data-type'>" + dataType.toHtml() + "</span> " + identifier1.toHtml();

        if (operation != null) {
            html += " <span class='operator'>" + operation.toHtml() + "</span> " + identifier2.toHtml();
        }

        html += ";</div>";
        return html;
    }

    public String toPhp() {
        String php = dataType.toPhp() + " $" + identifier1.getParameter();

        if (operation != null) {
            php += " " + operation.toPhp() + " $" + identifier2.getParameter();
        }

        php += ";";
        return php;
    }
}

