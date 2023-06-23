package ErrorHandling;

public class DartError extends Exception{


    public DartError() {
    }

    protected String message;
    protected int line;

    public DartError(String message) {
        //this.type = type;
        this.message = message;
    }

    public DartError( String message, int line) {
        this.message = message;
        this.line = line;
    }



    public String getMessage() {
        return message;
    }

    public int getLine() {
        return line;
    }


}