import java.util.Objects;

public class QuantityMeasurement {

    double value;
    MeasurementUnit unit;

    public enum MeasurementUnit{
        FEET, INCH
    }

    public QuantityMeasurement(double value, MeasurementUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Double.compare(that.value, value) == 0 &&
                (unit == that.unit || (that.value == 0 && value == 0));
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }
}
