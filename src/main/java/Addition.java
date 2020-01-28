import java.lang.reflect.Array;
import java.util.Arrays;

import static java.lang.Integer.sum;

public class Addition {

    double value;
    QuantityMeasurement.MeasurementUnit unit;

    public Addition(double value, QuantityMeasurement.MeasurementUnit unit) {
        this.value = unit.getConvertedValue(value);
        this.unit = unit;
    }

    public Addition() {}

    public double getAddition(Addition... first) {
        return Arrays.stream(first).map(a -> a.value).reduce(0.0, Double::sum);
    }
}
