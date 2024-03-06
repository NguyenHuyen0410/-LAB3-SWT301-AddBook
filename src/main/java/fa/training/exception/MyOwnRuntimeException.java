package fa.training.exception;

public class MyOwnRuntimeException extends java.lang.RuntimeException {
    public MyOwnRuntimeException() {
    }

    public MyOwnRuntimeException(String message) {
        super(message);
    }
}
