package classes;

public class WhileBody {
    public final String class_name = "While Body";

    ForBody forBody;

    public WhileBody() {
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
        s+="WhileBody{" + "forBody=" + forBody + '}';
        return s;
    }
}
