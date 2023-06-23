package classes;

import java.util.List;

public class Function {
    public final String class_name = "Function";

    DataType dataType;
    Identifier identifier;
    List<Dec> dec;
    FunctionBody funBody;

    public Function() {
    }

    public DataType getDataType() {
        return dataType;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public List<Dec> getDec() {
        return dec;
    }

    public void setDec(List<Dec> dec) {
        this.dec = dec;
    }

    public FunctionBody getFunBody() {
        return funBody;
    }

    public void setFunBody(FunctionBody funBody) {
        this.funBody = funBody;
    }

    @Override
    public String toString() {
        String s="";
        s+="Function{" +
                "dataType=" + dataType +
                ", identifier=" + identifier ;
        if(dec!=null)
            for (int i=0;i<dec.size();i++)
                s+="dec" + String.valueOf(i+1) + "=" + dec.get(i) + "\n";
        s+=", funBody=" + funBody +
                '}';
        return s;

    }

    public String toHtml() {
        StringBuilder sb = new StringBuilder();
        sb.append("<div>");
        sb.append("<h2>").append(identifier.getParameter()).append("</h2>");
        sb.append("<p>").append(dataType.toHtml()).append("</p>");
        sb.append("<ul>");
        for (Dec d : dec) {
            sb.append("<li>").append(d.toHtml()).append("</li>");
        }
        sb.append("</ul>");
        sb.append(funBody.toHtml());
        sb.append("</div>");
        return sb.toString();
    }

    public String toPhp() {
        StringBuilder sb = new StringBuilder();
        sb.append(dataType.toPhp()).append(" ");
        sb.append(identifier.toPhp()).append("(");
        boolean first = true;
        for (Dec d : dec) {
            if (!first) {
                sb.append(", ");
            }
            sb.append(d.toPhp());
            first = false;
        }
        sb.append(") {\n");
        sb.append(funBody.toPhp());
        sb.append("}\n");
        return sb.toString();
    }
}
