public class QuantityComparison {

    double value;
    LengthConversion.MeasurementUnit unit;

    public QuantityComparison(LengthConversion.MeasurementUnit unit, double value) {
        this.value = Math.round(value);
        this.unit = unit;
    }

    public QuantityComparison() {    }

    public void get(QuantityComparison a, QuantityComparison b){
        b.value = a.unit.getUnitsSame(b.unit.getConvertedToInch(b.value));
        b.unit = a.unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityComparison that = (QuantityComparison) o;
        return (Double.compare(that.value, value) == 0 &&
                (unit == that.unit || (that.value == 0 && value == 0)));
    }
}