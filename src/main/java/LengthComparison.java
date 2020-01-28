public class LengthComparison {

    double value;
    QuantityMeasurement.MeasurementUnit unit;

    public LengthComparison(double value, QuantityMeasurement.MeasurementUnit unit) {
        this.value = unit.getConvertedValue(value);
        this.unit = QuantityMeasurement.MeasurementUnit.FEET;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LengthComparison that = (LengthComparison) o;
        return Double.compare(that.value, value) == 0 &&
                (unit == that.unit || (that.value == 0 && value == 0));
    }
}