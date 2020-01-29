public class LengthComparison {

    double value;
    double[] value1;
    QuantityMeasurement.MeasurementUnit unit;
    QuantityMeasurement.MeasurementUnit[] unit1;

    public LengthComparison(QuantityMeasurement.MeasurementUnit unit, double value) {
        this.value = Math.round(value);
        this.unit = unit;
    }

    public LengthComparison() {    }

    public void get(LengthComparison a, LengthComparison b){
        b.value = a.unit.getUnitsSame(b.unit.getConvertedToInch(b.value));
        b.unit = a.unit;
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