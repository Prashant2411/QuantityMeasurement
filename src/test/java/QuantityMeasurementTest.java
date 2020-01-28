import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void givenFeetAndFeet_shouldReturnEqual() {
        QuantityMeasurement first = new QuantityMeasurement(0.0, QuantityMeasurement.MeasurementUnit.FEET);
        QuantityMeasurement second = new QuantityMeasurement(0.0, QuantityMeasurement.MeasurementUnit.FEET);
        Assert.assertEquals(first, second);
    }

    @Test
    public void givenSameReferenceOfFeet_shouldReturnEqual() {
        QuantityMeasurement first = new QuantityMeasurement(0.0, QuantityMeasurement.MeasurementUnit.FEET);
        Assert.assertTrue(first.equals(new QuantityMeasurement(0.0, QuantityMeasurement.MeasurementUnit.FEET)));
    }

    @Test
    public void givenSameClassOfFeet_shouldReturnEqual() {
        QuantityMeasurement first = new QuantityMeasurement(0.0, QuantityMeasurement.MeasurementUnit.FEET);
        Assert.assertTrue(first.getClass().equals(new QuantityMeasurement(0.0, QuantityMeasurement.MeasurementUnit.FEET).getClass()));
    }

    @Test
    public void givenInchAndInch_shouldReturnEqual() {
        QuantityMeasurement first = new QuantityMeasurement(0.0, QuantityMeasurement.MeasurementUnit.INCH);
        QuantityMeasurement second = new QuantityMeasurement(0.0, QuantityMeasurement.MeasurementUnit.INCH);
        Assert.assertTrue(first.equals(second));
    }

    @Test
    public void givenSameReferenceOfInch_shouldReturnTrue() {
        QuantityMeasurement first = new QuantityMeasurement(0.0, QuantityMeasurement.MeasurementUnit.INCH);
        Assert.assertTrue(first.equals(new QuantityMeasurement(0.0, QuantityMeasurement.MeasurementUnit.INCH)));
    }

    @Test
    public void givenSameClassOfInch_shouldReturnTrue() {
        QuantityMeasurement first = new QuantityMeasurement(0.0, QuantityMeasurement.MeasurementUnit.INCH);
        Assert.assertTrue(first.getClass().equals(new QuantityMeasurement(0.0, QuantityMeasurement.MeasurementUnit.INCH).getClass()));
    }

    @Test
    public void givenFeetAndInch_shouldReturnEqual() {
        QuantityMeasurement first = new QuantityMeasurement(0.0, QuantityMeasurement.MeasurementUnit.FEET);
        QuantityMeasurement second = new QuantityMeasurement(0.0, QuantityMeasurement.MeasurementUnit.INCH);
        Assert.assertEquals(first,second);
    }

    @Test
    public void given1FeetAnd1Inch_shouldReturnFalse() {
        QuantityMeasurement first = new QuantityMeasurement(1.0, QuantityMeasurement.MeasurementUnit.FEET);
        QuantityMeasurement second = new QuantityMeasurement(1.0, QuantityMeasurement.MeasurementUnit.INCH);
        Assert.assertFalse(first.equals(second));
    }

    @Test
    public void given1InchAnd1Feet_shouldReturnFalse() {
        QuantityMeasurement first = new QuantityMeasurement(1.0, QuantityMeasurement.MeasurementUnit.INCH);
        QuantityMeasurement second = new QuantityMeasurement(1.0, QuantityMeasurement.MeasurementUnit.FEET);
        Assert.assertFalse(first.equals(second));
    }

    @Test
    public void given1FeetAnd12Inch_shouldReturnTrue() {
        QuantityMeasurement first = new QuantityMeasurement(1.0, QuantityMeasurement.MeasurementUnit.FEET);
        QuantityMeasurement second = new QuantityMeasurement(12.0, QuantityMeasurement.MeasurementUnit.INCH);
        Assert.assertTrue(first.equals(second));
    }

    @Test
    public void given12InchAnd1Feet_shouldReturnTrue() {
        QuantityMeasurement first = new QuantityMeasurement(12.0, QuantityMeasurement.MeasurementUnit.INCH);
        QuantityMeasurement second = new QuantityMeasurement(1.0, QuantityMeasurement.MeasurementUnit.FEET);
        Assert.assertTrue(first.equals(second));
    }
}