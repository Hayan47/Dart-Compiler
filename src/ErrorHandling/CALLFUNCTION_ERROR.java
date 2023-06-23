package ErrorHandling;

public class CALLFUNCTION_ERROR extends DartError{
    public CALLFUNCTION_ERROR(String name) {
        message="function " + name + " is not defined";
    }
}
