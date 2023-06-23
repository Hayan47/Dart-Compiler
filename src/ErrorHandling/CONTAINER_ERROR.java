package ErrorHandling;

public class CONTAINER_ERROR extends DartError{
    public CONTAINER_ERROR(String name) {
        message="Duplicate declaration of Container Property: " + name;
    }
}
