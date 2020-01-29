import java.util.Arrays;

public class Addition {

    double value[];
    QuantityMeasurement.MeasurementUnit unit[];
//
//    public Addition(double value, QuantityMeasurement.MeasurementUnit unit) {
//        this.value = unit.getConvertedValue(value);
//        this.unit = unit;
//    }

    public Addition(double... value) {
        this.value = value;
    }

    public Addition(QuantityMeasurement.MeasurementUnit... unit) {
        this.unit = unit;
    }

    public Addition() {}

    public double getAddition(Addition values, Addition units) {
        double sum = 0;
        for (int i =0; i<values.value.length; i++)
            sum += units.unit[i].getConvertedToInch(values.value[i]);
        return sum;
    }
}
