package classes;

public class Ifw {
    public final String class_name = "Ifw";

    String ifw;

    public Ifw() {
    }

    public Ifw(String ifw) {
        this.ifw = ifw;
    }

    public String getIfw() {
        return ifw;
    }

    public void setIfw(String ifw) {
        this.ifw = ifw;
    }

    @Override
    public String toString() {
        String s="";
        if (ifw!=null)
            s+="Ifw{" + "ifw='" + ifw + '\n' + '}';
        return s;
    }
}
