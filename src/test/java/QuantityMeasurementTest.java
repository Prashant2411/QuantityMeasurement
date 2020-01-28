import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void givenFeetAndFeet_shouldReturnEqual() {
        LengthComparison first = new LengthComparison(0.0, QuantityMeasurement.MeasurementUnit.FEET);
        LengthComparison second = new LengthComparison(0.0, QuantityMeasurement.MeasurementUnit.FEET);
        Assert.assertEquals(first, second);
    }

    @Test
    public void givenSameReferenceOfFeet_shouldReturnEqual() {
        LengthComparison first = new LengthComparison(0.0, QuantityMeasurement.MeasurementUnit.FEET);
        Assert.assertTrue(first.equals(new LengthComparison(0.0, QuantityMeasurement.MeasurementUnit.FEET)));
    }

    @Test
    public void givenSameClassOfFeet_shouldReturnEqual() {
        LengthComparison first = new LengthComparison(0.0, QuantityMeasurement.MeasurementUnit.FEET);
        Assert.assertTrue(first.getClass().equals(new LengthComparison(0.0, QuantityMeasurement.MeasurementUnit.FEET).getClass()));
    }

    @Test
    public void givenInchAndInch_shouldReturnEqual() {
        LengthComparison first = new LengthComparison(0.0, QuantityMeasurement.MeasurementUnit.INCH);
        LengthComparison second = new LengthComparison(0.0, QuantityMeasurement.MeasurementUnit.INCH);
        Assert.assertTrue(first.equals(second));
    }

    @Test
    public void givenSameReferenceOfInch_shouldReturnTrue() {
        LengthComparison first = new LengthComparison(0.0, QuantityMeasurement.MeasurementUnit.INCH);
        Assert.assertTrue(first.equals(new LengthComparison(0.0, QuantityMeasurement.MeasurementUnit.INCH)));
    }

    @Test
    public void givenSameClassOfInch_shouldReturnTrue() {
        LengthComparison first = new LengthComparison(0.0, QuantityMeasurement.MeasurementUnit.INCH);
        Assert.assertTrue(first.getClass().equals(new LengthComparison(0.0, QuantityMeasurement.MeasurementUnit.INCH).getClass()));
    }

    @Test
    public void givenFeetAndInch_shouldReturnEqual() {
        LengthComparison first = new LengthComparison(0.0, QuantityMeasurement.MeasurementUnit.FEET);
        LengthComparison second = new LengthComparison(0.0, QuantityMeasurement.MeasurementUnit.INCH);
        Assert.assertEquals(first,second);
    }@Test
    public void given1FeetAnd1Inch_shouldReturnFalse() {
        LengthComparison first = new LengthComparison(1.0, QuantityMeasurement.MeasurementUnit.FEET);
        LengthComparison second = new LengthComparison(1.0, QuantityMeasurement.MeasurementUnit.INCH);
        Assert.assertFalse(first.equals(second));
    }

    @Test
    public void given1InchAnd1Feet_shouldReturnFalse() {
        LengthComparison first = new LengthComparison(1.0, QuantityMeasurement.MeasurementUnit.INCH);
        LengthComparison second = new LengthComparison(1.0, QuantityMeasurement.MeasurementUnit.FEET);
        Assert.assertFalse(first.equals(second));
    }

    @Test
    public void given1FeetAnd12Inch_shouldReturnTrue() {
        LengthComparison first = new LengthComparison(1.0, QuantityMeasurement.MeasurementUnit.FEET);
        LengthComparison second = new LengthComparison(12.0, QuantityMeasurement.MeasurementUnit.INCH);
        Assert.assertTrue(first.equals(second));
    }

    @Test
    public void given12InchAnd1Feet_shouldReturnTrue() {
        LengthComparison first = new LengthComparison(12.0, QuantityMeasurement.MeasurementUnit.INCH);
        LengthComparison second = new LengthComparison(1.0, QuantityMeasurement.MeasurementUnit.FEET);
        Assert.assertTrue(first.equals(second));
    }

    @Test
    public void given3FeetAnd1Yard_shouldReturnTrue() {
        LengthComparison first = new LengthComparison(3.0, QuantityMeasurement.MeasurementUnit.FEET);
        LengthComparison second = new LengthComparison(1.0, QuantityMeasurement.MeasurementUnit.YARD);
        Assert.assertTrue(first.equals(second));
    }

    @Test
    public void given1FeetAnd1Yard_shouldReturnTrue() {
        LengthComparison first = new LengthComparison(1.0, QuantityMeasurement.MeasurementUnit.FEET);
        LengthComparison second = new LengthComparison(1.0, QuantityMeasurement.MeasurementUnit.YARD);
        Assert.assertFalse(first.equals(second));
    }

    @Test
    public void given1InchAnd1Yard_shouldReturnTrue() {
        LengthComparison first = new LengthComparison(1.0, QuantityMeasurement.MeasurementUnit.INCH);
        LengthComparison second = new LengthComparison(1.0, QuantityMeasurement.MeasurementUnit.YARD);
        Assert.assertFalse(first.equals(second));
    }

    @Test
    public void given1YardAnd36Inch_shouldReturnTrue() {
        LengthComparison first = new LengthComparison(1.0, QuantityMeasurement.MeasurementUnit.YARD);
        LengthComparison second = new LengthComparison(36.0, QuantityMeasurement.MeasurementUnit.INCH);
        Assert.assertTrue(first.equals(second));
    }

    @Test
    public void given36InchAnd1Yard_shouldReturnTrue() {
        LengthComparison first = new LengthComparison(36.0, QuantityMeasurement.MeasurementUnit.INCH);
        LengthComparison second = new LengthComparison(1.0, QuantityMeasurement.MeasurementUnit.YARD);
        Assert.assertTrue(first.equals(second));
    }

    @Test
    public void given1YardAnd3Feet_shouldReturnTrue() {
        LengthComparison first = new LengthComparison(1.0, QuantityMeasurement.MeasurementUnit.YARD);
        LengthComparison second = new LengthComparison(3.0, QuantityMeasurement.MeasurementUnit.FEET);
        Assert.assertTrue(first.equals(second));
    }
}