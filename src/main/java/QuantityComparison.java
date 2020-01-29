public class QuantityComparison {

    double value;
    QuantityConversion.MeasurementUnit unit;

    public QuantityComparison(QuantityConversion.MeasurementUnit unit, double value) {
        this.value = value;
        this.unit = unit;
    }

    public QuantityComparison() {    }

    public void getValueConverted(QuantityComparison a, QuantityComparison b){
        if (a.unit.getUnitType().equals(b.unit.getUnitType())) {
            b.value = a.unit.getUnitsSame(b.unit.getConverted(b.value));
            b.unit = a.unit;
        }
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