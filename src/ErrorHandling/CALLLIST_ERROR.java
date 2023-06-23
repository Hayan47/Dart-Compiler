package ErrorHandling;

public class CALLLIST_ERROR extends DartError{
    public CALLLIST_ERROR(String name) {
        message="list " +name+ " is not defined";
    }
}
