package ErrorHandling;

public class VARIBALE_ERROR extends DartError {

    public VARIBALE_ERROR(String name) {
        message="Variable " + name + " is not defined";
    }
}
