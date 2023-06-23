package classes;

public class Elsew {
    public final String class_name = "Elsew";

    String elsew;

    public Elsew() {
    }

    public Elsew(String elsew) {
        this.elsew = elsew;
    }

    public String getElsew() {
        return elsew;
    }

    public void setElsew(String elsew) {
        this.elsew = elsew;
    }

    @Override
    public String toString() {
        String s="";
        if(elsew!=null)
            s+="Elsew{" +
                    "elsew='" + elsew + '\n' +
                    '}';
        return s;
    }
}
