package classes;

public class Whilew {
    public final String class_name = "Whilew";

    String whilew;

    public Whilew() {
    }

    public Whilew(String whilew) {
        this.whilew = whilew;
    }

    public String getWhilew() {
        return whilew;
    }

    public void setWhilew(String whilew) {
        this.whilew = whilew;
    }

    @Override
    public String toString() {
        String s="";
        s+="Whilew{" +
                "whilew='" + whilew + '\n' +
                '}';;
        return s;
    }
}
