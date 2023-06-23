package classes;

public class CallFunction {

    public final String class_name = "Call Function";
    Identifier identifier;
    HeaderBody headerBody;

    public CallFunction() {
    }

    public CallFunction(String function) {
        this.identifier = identifier;
    }

    public String getClass_name() {
        return class_name;
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public HeaderBody getHeaderBody() {
        return headerBody;
    }

    public void setHeaderBody(HeaderBody headerBody) {
        this.headerBody = headerBody;
    }

    @Override
    public String toString() {
        String s="";
        s+="CallFunction{" +
                "identifier=" + identifier +
                ", headerBody=" + headerBody +
                '}';
        return s;
    }
}
