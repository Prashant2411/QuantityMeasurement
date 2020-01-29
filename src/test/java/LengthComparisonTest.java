import org.junit.Assert;
import org.junit.Test;

public class LengthComparisonTest {

    @Test
    public void givenFeetAndFeet_shouldReturnEqual() {
        LengthComparison first = new LengthComparison(QuantityMeasurement.MeasurementUnit.FEET, 0.0);
        LengthComparison second = new LengthComparison(QuantityMeasurement.MeasurementUnit.FEET, 0.0);
        new LengthComparison().get(first, second);
        Assert.assertEquals(first, second);
    }

    @Test
    public void givenSameReferenceOfFeet_shouldReturnEqual() {
        LengthComparison first = new LengthComparison(QuantityMeasurement.MeasurementUnit.FEET, 0.0);
        Assert.assertTrue(first.equals(new LengthComparison(QuantityMeasurement.MeasurementUnit.FEET, 0.0)));
    }

    @Test
    public void givenSameClassOfFeet_shouldReturnEqual() {
        LengthComparison first = new LengthComparison(QuantityMeasurement.MeasurementUnit.FEET, 0.0);
        Assert.assertTrue(first.getClass().equals(new LengthComparison(QuantityMeasurement.MeasurementUnit.FEET, 0.0).getClass()));
    }

    @Test
    public void givenInchAndInch_shouldReturnEqual() {
        LengthComparison first = new LengthComparison(QuantityMeasurement.MeasurementUnit.INCH, 0.0);
        LengthComparison second = new LengthComparison(QuantityMeasurement.MeasurementUnit.INCH, 0.0);
        new LengthComparison().get(first, second);
        Assert.assertTrue(first.equals(second));
    }

    @Test
    public void givenSameReferenceOfInch_shouldReturnTrue() {
        LengthComparison first = new LengthComparison(QuantityMeasurement.MeasurementUnit.INCH, 0.0);
        Assert.assertTrue(first.equals(new LengthComparison(QuantityMeasurement.MeasurementUnit.INCH, 0.0)));
    }

    @Test
    public void givenSameClassOfInch_shouldReturnTrue() {
        LengthComparison first = new LengthComparison(QuantityMeasurement.MeasurementUnit.INCH, 0.0);
        Assert.assertTrue(first.getClass().equals(new LengthComparison(QuantityMeasurement.MeasurementUnit.INCH, 0.0).getClass()));
    }

    @Test
    public void givenFeetAndInch_shouldReturnEqual() {
        LengthComparison first = new LengthComparison(QuantityMeasurement.MeasurementUnit.FEET, 0.0);
        LengthComparison second = new LengthComparison(QuantityMeasurement.MeasurementUnit.INCH, 0.0);
        new LengthComparison().get(first, second);
        Assert.assertTrue(first.equals(second));
    }@Test
    public void given1FeetAnd1Inch_shouldReturnFalse() {
        LengthComparison first = new LengthComparison(QuantityMeasurement.MeasurementUnit.FEET, 1.0);
        LengthComparison second = new LengthComparison(QuantityMeasurement.MeasurementUnit.INCH, 1.0);
        new LengthComparison().get(first, second);
        Assert.assertFalse(first.equals(second));
    }

    @Test
    public void given1InchAnd1Feet_shouldReturnFalse() {
        LengthComparison first = new LengthComparison(QuantityMeasurement.MeasurementUnit.INCH, 1.0);
        LengthComparison second = new LengthComparison(QuantityMeasurement.MeasurementUnit.FEET, 1.0);
        new LengthComparison().get(first, second);
        Assert.assertFalse(first.equals(second));
    }

    @Test
    public void given1FeetAnd12Inch_shouldReturnTrue() {
        LengthComparison first = new LengthComparison(QuantityMeasurement.MeasurementUnit.FEET, 1.0);
        LengthComparison second = new LengthComparison(QuantityMeasurement.MeasurementUnit.INCH, 12.0);
        new LengthComparison().get(first, second);
        Assert.assertTrue(first.equals(second));
    }

    @Test
    public void given12InchAnd1Feet_shouldReturnTrue() {
        LengthComparison first = new LengthComparison(QuantityMeasurement.MeasurementUnit.INCH, 12.0);
        LengthComparison second = new LengthComparison(QuantityMeasurement.MeasurementUnit.FEET, 1.0);
        new LengthComparison().get(first, second);
        Assert.assertTrue(first.equals(second));
    }

    @Test
    public void given3FeetAnd1Yard_shouldReturnTrue() {
        LengthComparison first = new LengthComparison(QuantityMeasurement.MeasurementUnit.FEET, 3.0);
        LengthComparison second = new LengthComparison(QuantityMeasurement.MeasurementUnit.YARD, 1.0);
        new LengthComparison().get(first, second);
        Assert.assertTrue(first.equals(second));
    }

    @Test
    public void given1FeetAnd1Yard_shouldReturnTrue() {
        LengthComparison first = new LengthComparison(QuantityMeasurement.MeasurementUnit.FEET, 1.0);
        LengthComparison second = new LengthComparison(QuantityMeasurement.MeasurementUnit.YARD, 1.0);
        new LengthComparison().get(first, second);
        Assert.assertFalse(first.equals(second));
    }

    @Test
    public void given1InchAnd1Yard_shouldReturnTrue() {
        LengthComparison first = new LengthComparison(QuantityMeasurement.MeasurementUnit.INCH, 1.0);
        LengthComparison second = new LengthComparison(QuantityMeasurement.MeasurementUnit.YARD, 1.0);
        new LengthComparison().get(first, second);
        Assert.assertFalse(first.equals(second));
    }

    @Test
    public void given1YardAnd36Inch_shouldReturnTrue() {
        LengthComparison first = new LengthComparison(QuantityMeasurement.MeasurementUnit.YARD, 1.0);
        LengthComparison second = new LengthComparison(QuantityMeasurement.MeasurementUnit.INCH, 36.0);
        new LengthComparison().get(first, second);
        Assert.assertTrue(first.equals(second));
    }

    @Test
    public void given36InchAnd1Yard_shouldReturnTrue() {
        LengthComparison first = new LengthComparison(QuantityMeasurement.MeasurementUnit.INCH, 36.0);
        LengthComparison second = new LengthComparison(QuantityMeasurement.MeasurementUnit.YARD, 1.0);
        new LengthComparison().get(first, second);
        Assert.assertEquals(first,second);
    }

    @Test
    public void given1YardAnd3Feet_shouldReturnTrue() {
        LengthComparison first = new LengthComparison(QuantityMeasurement.MeasurementUnit.YARD, 1.0);
        LengthComparison second = new LengthComparison(QuantityMeasurement.MeasurementUnit.FEET, 3.0);
        new LengthComparison().get(first, second);
        Assert.assertTrue(first.equals(second));
    }

    @Test
    public void given2InchAnd5CM_shouldReturnTrue() {
        LengthComparison first = new LengthComparison(QuantityMeasurement.MeasurementUnit.INCH, 2.0);
        LengthComparison second = new LengthComparison(QuantityMeasurement.MeasurementUnit.CENTIMETER, 5.0);
        new LengthComparison().get(first, second);
        Assert.assertTrue(first.equals(second));
    }
}