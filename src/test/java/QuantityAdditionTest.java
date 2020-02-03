import org.junit.Assert;
import org.junit.Test;

public class QuantityAdditionTest {

    //Length

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
        Assert.assertEquals(3.0, addition, 0.1);
    }

    //Volume

    @Test
    public void given1LitreAnd1000ML_shouldReturnAddition() {
        QuantityAddition values = new QuantityAddition(1.0,1000);
        QuantityAddition units = new QuantityAddition(QuantityConversion.MeasurementUnit.LITRE, QuantityConversion.MeasurementUnit.MILLI_LITRE);
        double addition = new QuantityAddition().getAddition(values, units);
        Assert.assertEquals(2.0, addition, 0);
    }

    @Test
    public void given1GallonAnd3point78Litre_shouldReturnAddition() {
        QuantityAddition values = new QuantityAddition(1.0,3.78);
        QuantityAddition units = new QuantityAddition(QuantityConversion.MeasurementUnit.GALLON, QuantityConversion.MeasurementUnit.LITRE);
        double addition = new QuantityAddition().getAddition(values, units);
        Assert.assertEquals(7.56, addition, 0.1);
    }

    //Weight

    @Test
    public void given1000TonAnd1000GM_shouldReturnAddition() {
        QuantityAddition values = new QuantityAddition(1.0,1000.0);
        QuantityAddition units = new QuantityAddition(QuantityConversion.MeasurementUnit.TON, QuantityConversion.MeasurementUnit.GRAMS);
        double addition = new QuantityAddition().getAddition(values, units);
        Assert.assertEquals(1001, addition, 0.1);
    }
}