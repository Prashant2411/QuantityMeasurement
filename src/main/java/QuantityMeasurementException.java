public class QuantityMeasurementException extends Throwable {

    public enum ExceptionType {
        NULL_EXCEPTION
    }

    public ExceptionType type;

    public QuantityMeasurementException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }
}

