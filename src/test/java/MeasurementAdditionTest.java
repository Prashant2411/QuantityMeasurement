import org.junit.Assert;
import org.junit.Test;

public class MeasurementAdditionTest {

    @Test
    public void given2InchAnd2Inch_shouldReturnAddition() {
        Addition first[] = { new Addition(2.0, QuantityMeasurement.MeasurementUnit.INCH), new Addition(2.0, QuantityMeasurement.MeasurementUnit.INCH)};
        double addition = new Addition().getAddition(first);
        Assert.assertEquals(4.0, addition, 0);
    }

    @Test
    public void given1FeetAnd2Inch_shouldReturnAddition() {
        Addition first[] = { new Addition(1.0, QuantityMeasurement.MeasurementUnit.FEET), new Addition(2.0, QuantityMeasurement.MeasurementUnit.INCH)};
        double addition = new Addition().getAddition(first);
        Assert.assertEquals(14.0, addition, 0);
    }

    @Test
    public void given1FeetAnd1Feet_shouldReturnAddition() {
        Addition first[] = { new Addition(1.0, QuantityMeasurement.MeasurementUnit.FEET), new Addition(1.0, QuantityMeasurement.MeasurementUnit.FEET)};
        double addition = new Addition().getAddition(first);
        Assert.assertEquals(24.0, addition, 0);
    }

    @Test
    public void given2InchAnd2point5CM_shouldReturnAddition() {
        Addition first[] = { new Addition(2.0, QuantityMeasurement.MeasurementUnit.INCH), new Addition(2.5, QuantityMeasurement.MeasurementUnit.CENTIMETER)};
        double addition = new Addition().getAddition(first);
        Assert.assertEquals(3.0, addition, 0);
    }
}
