public class QuantityComparisonException extends Throwable {

    public enum ExceptionType {
        NULL_EXCEPTION
    }

    public ExceptionType type;

    public QuantityComparisonException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }
}

