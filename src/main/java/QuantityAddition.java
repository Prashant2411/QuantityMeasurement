public class QuantityAddition {

    double value[];
    QuantityConversion.MeasurementUnit unit[];
//
//    public Addition(double value, QuantityMeasurement.MeasurementUnit unit) {
//        this.value = unit.getConvertedValue(value);
//        this.unit = unit;
//    }

    public QuantityAddition(double... value) {
        this.value = value;
    }

    public QuantityAddition(QuantityConversion.MeasurementUnit... unit) {
        this.unit = unit;
    }

    public QuantityAddition() {}

    public double getAddition(QuantityAddition values, QuantityAddition units) {
        double sum = 0;
        for (int i =0; i<values.value.length; i++)
            sum += units.unit[i].getConverted(values.value[i]);
        return sum;
    }
}
