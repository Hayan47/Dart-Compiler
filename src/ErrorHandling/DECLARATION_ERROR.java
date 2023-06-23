package ErrorHandling;

public class DECLARATION_ERROR extends DartError{
    public DECLARATION_ERROR(String name) {
        message="Variable " + name + " is already defined";
    }
}
