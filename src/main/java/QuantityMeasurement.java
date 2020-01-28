import java.util.Objects;

public class QuantityMeasurement {

    double value;
    MeasurementUnit unit;

    public enum MeasurementUnit{
        FEET(1,1), INCH(12,1), YARD(1,3);

        private final double i;
        private final double j;

        MeasurementUnit(double i, double j) {
            this.i = i;
            this.j = j;
        }

        public double getConvertedValue(double value) {
            return (value*j)/i;
        }
    }

    public QuantityMeasurement(double value, MeasurementUnit unit) {
        this.value = unit.getConvertedValue(value);
        this.unit = MeasurementUnit.FEET;
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
