import org.junit.Assert;
import org.junit.Test;

public class MeasurementAdditionTest {

    @Test
    public void given2InchAnd2Inch_shouldReturnAddition() {
        Addition values = new Addition(2.0,2.0);
        Addition units = new Addition(QuantityMeasurement.MeasurementUnit.INCH, QuantityMeasurement.MeasurementUnit.INCH);
        double addition = new Addition().getAddition(values, units);
        Assert.assertEquals(4.0, addition, 0);
    }

    @Test
    public void given1FeetAnd2Inch_shouldReturnAddition() {
        Addition values = new Addition(1.0,2.0);
        Addition units = new Addition(QuantityMeasurement.MeasurementUnit.FEET, QuantityMeasurement.MeasurementUnit.INCH);
        double addition = new Addition().getAddition(values, units);
        Assert.assertEquals(14.0, addition, 0);
    }

    @Test
    public void given1FeetAnd1Feet_shouldReturnAddition() {
        Addition values = new Addition(1.0,1.0);
        Addition units = new Addition(QuantityMeasurement.MeasurementUnit.FEET, QuantityMeasurement.MeasurementUnit.FEET);
        double addition = new Addition().getAddition(values, units);
        Assert.assertEquals(24.0, addition, 0);
    }

    @Test
    public void given2InchAnd2point5CM_shouldReturnAddition() {
        Addition values = new Addition(2.0,2.5);
        Addition units = new Addition(QuantityMeasurement.MeasurementUnit.INCH, QuantityMeasurement.MeasurementUnit.CENTIMETER);
        double addition = new Addition().getAddition(values, units);
        Assert.assertEquals(3.0, addition, 0);
    }
}