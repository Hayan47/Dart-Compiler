package classes;

public class DataType {
    public final String class_name = "DataType";

    String dataType;

    public DataType() {
    }

    public DataType(String dataType) {
        this.dataType = dataType;
    }

    public String getString() {
        return dataType;
    }

    public void setString(String string) {
        this.dataType = string;
    }
    public boolean isValidValue(Object value) {
        try {
        switch (dataType) {
            case "int":
                Integer.parseInt(value.toString());
                return true;
            case "double":
                Double.parseDouble(value.toString());
                return true ;
            case "string":
                return true ;
            case "long":
                Long.parseLong(value.toString());
                return true ;
            default:
                throw new IllegalArgumentException("Unsupported data type: " + dataType);
        }}catch (Exception e){
            return false;
        }
    }

    @Override
    public String toString() {
        String s="";
        if (dataType!=null)
            s+="DataType{" +
                    "dataType='" + dataType + '\n' +
                    '}';
        return s;
    }
    public String toHtml() {
        return "<span class=\"data-type\">" + dataType + "</span>";
    }

    public String toPhp() {
        return dataType;
    }
}
