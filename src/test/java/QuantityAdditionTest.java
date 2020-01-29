import org.junit.Assert;
import org.junit.Test;

public class QuantityAdditionTest {

    @Test
    public void given2InchAnd2Inch_shouldReturnAddition() {
        QuantityAddition values = new QuantityAddition(2.0,2.0);
        QuantityAddition units = new QuantityAddition(QuantityConversion.MeasurementUnit.INCH, QuantityConversion.MeasurementUnit.INCH);
        double addition = new QuantityAddition().getAddition(values, units);
        Assert.assertEquals(4.0, addition, 0);
    }

    @Test
    public void given1FeetAnd2Inch_shouldReturnAddition() {
        QuantityAddition values = new QuantityAddition(1.0,2.0);
        QuantityAddition units = new QuantityAddition(QuantityConversion.MeasurementUnit.FEET, QuantityConversion.MeasurementUnit.INCH);
        double addition = new QuantityAddition().getAddition(values, units);
        Assert.assertEquals(14.0, addition, 0);
    }

    @Test
    public void given1FeetAnd1Feet_shouldReturnAddition() {
        QuantityAddition values = new QuantityAddition(1.0,1.0);
        QuantityAddition units = new QuantityAddition(QuantityConversion.MeasurementUnit.FEET, QuantityConversion.MeasurementUnit.FEET);
        double addition = new QuantityAddition().getAddition(values, units);
        Assert.assertEquals(24.0, addition, 0);
    }

    @Test
    public void given2InchAnd2point5CM_shouldReturnAddition() {
        QuantityAddition values = new QuantityAddition(2.0,2.5);
        QuantityAddition units = new QuantityAddition(QuantityConversion.MeasurementUnit.INCH, QuantityConversion.MeasurementUnit.CENTIMETER);
        double addition = new QuantityAddition().getAddition(values, units);
        Assert.assertEquals(3.0, addition, 0);
    }
}