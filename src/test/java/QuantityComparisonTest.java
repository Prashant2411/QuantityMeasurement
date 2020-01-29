import org.junit.Assert;
import org.junit.Test;

public class QuantityComparisonTest {

    //Length

    @Test
    public void givenFeetAndFeet_shouldReturnEqual() {
        QuantityComparison first = new QuantityComparison(QuantityConversion.MeasurementUnit.FEET, 0.0);
        QuantityComparison second = new QuantityComparison(QuantityConversion.MeasurementUnit.FEET, 0.0);
        new QuantityComparison().getValueConverted(first, second);
        Assert.assertEquals(first, second);
    }

    @Test
    public void givenSameReferenceOfFeet_shouldReturnEqual() {
        QuantityComparison first = new QuantityComparison(QuantityConversion.MeasurementUnit.FEET, 0.0);
        Assert.assertTrue(first.equals(new QuantityComparison(QuantityConversion.MeasurementUnit.FEET, 0.0)));
    }

    @Test
    public void givenSameClassOfFeet_shouldReturnEqual() {
        QuantityComparison first = new QuantityComparison(QuantityConversion.MeasurementUnit.FEET, 0.0);
        Assert.assertTrue(first.getClass().equals(new QuantityComparison(QuantityConversion.MeasurementUnit.FEET, 0.0).getClass()));
    }

    @Test
    public void givenInchAndInch_shouldReturnEqual() {
        QuantityComparison first = new QuantityComparison(QuantityConversion.MeasurementUnit.INCH, 0.0);
        QuantityComparison second = new QuantityComparison(QuantityConversion.MeasurementUnit.INCH, 0.0);
        new QuantityComparison().getValueConverted(first, second);
        Assert.assertTrue(first.equals(second));
    }

    @Test
    public void givenSameReferenceOfInch_shouldReturnTrue() {
        QuantityComparison first = new QuantityComparison(QuantityConversion.MeasurementUnit.INCH, 0.0);
        Assert.assertTrue(first.equals(new QuantityComparison(QuantityConversion.MeasurementUnit.INCH, 0.0)));
    }

    @Test
    public void givenSameClassOfInch_shouldReturnTrue() {
        QuantityComparison first = new QuantityComparison(QuantityConversion.MeasurementUnit.INCH, 0.0);
        Assert.assertTrue(first.getClass().equals(new QuantityComparison(QuantityConversion.MeasurementUnit.INCH, 0.0).getClass()));
    }

    @Test
    public void givenFeetAndInch_shouldReturnEqual() {
        QuantityComparison first = new QuantityComparison(QuantityConversion.MeasurementUnit.FEET, 0.0);
        QuantityComparison second = new QuantityComparison(QuantityConversion.MeasurementUnit.INCH, 0.0);
        new QuantityComparison().getValueConverted(first, second);
        Assert.assertTrue(first.equals(second));
    }@Test
    public void given1FeetAnd1Inch_shouldReturnFalse() {
        QuantityComparison first = new QuantityComparison(QuantityConversion.MeasurementUnit.FEET, 1.0);
        QuantityComparison second = new QuantityComparison(QuantityConversion.MeasurementUnit.INCH, 1.0);
        new QuantityComparison().getValueConverted(first, second);
        Assert.assertFalse(first.equals(second));
    }

    @Test
    public void given1InchAnd1Feet_shouldReturnFalse() {
        QuantityComparison first = new QuantityComparison(QuantityConversion.MeasurementUnit.INCH, 1.0);
        QuantityComparison second = new QuantityComparison(QuantityConversion.MeasurementUnit.FEET, 1.0);
        new QuantityComparison().getValueConverted(first, second);
        Assert.assertFalse(first.equals(second));
    }

    @Test
    public void given1FeetAnd12Inch_shouldReturnTrue() {
        QuantityComparison first = new QuantityComparison(QuantityConversion.MeasurementUnit.FEET, 1.0);
        QuantityComparison second = new QuantityComparison(QuantityConversion.MeasurementUnit.INCH, 12.0);
        new QuantityComparison().getValueConverted(first, second);
        Assert.assertTrue(first.equals(second));
    }

    @Test
    public void given12InchAnd1Feet_shouldReturnTrue() {
        QuantityComparison first = new QuantityComparison(QuantityConversion.MeasurementUnit.INCH, 12.0);
        QuantityComparison second = new QuantityComparison(QuantityConversion.MeasurementUnit.FEET, 1.0);
        new QuantityComparison().getValueConverted(first, second);
        Assert.assertTrue(first.equals(second));
    }

    @Test
    public void given3FeetAnd1Yard_shouldReturnTrue() {
        QuantityComparison first = new QuantityComparison(QuantityConversion.MeasurementUnit.FEET, 3.0);
        QuantityComparison second = new QuantityComparison(QuantityConversion.MeasurementUnit.YARD, 1.0);
        new QuantityComparison().getValueConverted(first, second);
        Assert.assertTrue(first.equals(second));
    }

    @Test
    public void given1FeetAnd1Yard_shouldReturnTrue() {
        QuantityComparison first = new QuantityComparison(QuantityConversion.MeasurementUnit.FEET, 1.0);
        QuantityComparison second = new QuantityComparison(QuantityConversion.MeasurementUnit.YARD, 1.0);
        new QuantityComparison().getValueConverted(first, second);
        Assert.assertFalse(first.equals(second));
    }

    @Test
    public void given1InchAnd1Yard_shouldReturnTrue() {
        QuantityComparison first = new QuantityComparison(QuantityConversion.MeasurementUnit.INCH, 1.0);
        QuantityComparison second = new QuantityComparison(QuantityConversion.MeasurementUnit.YARD, 1.0);
        new QuantityComparison().getValueConverted(first, second);
        Assert.assertFalse(first.equals(second));
    }

    @Test
    public void given1YardAnd36Inch_shouldReturnTrue() {
        QuantityComparison first = new QuantityComparison(QuantityConversion.MeasurementUnit.YARD, 1.0);
        QuantityComparison second = new QuantityComparison(QuantityConversion.MeasurementUnit.INCH, 36.0);
        new QuantityComparison().getValueConverted(first, second);
        Assert.assertTrue(first.equals(second));
    }

    @Test
    public void given36InchAnd1Yard_shouldReturnTrue() {
        QuantityComparison first = new QuantityComparison(QuantityConversion.MeasurementUnit.INCH, 36.0);
        QuantityComparison second = new QuantityComparison(QuantityConversion.MeasurementUnit.YARD, 1.0);
        new QuantityComparison().getValueConverted(first, second);
        Assert.assertEquals(first,second);
    }

    @Test
    public void given1YardAnd3Feet_shouldReturnTrue() {
        QuantityComparison first = new QuantityComparison(QuantityConversion.MeasurementUnit.YARD, 1.0);
        QuantityComparison second = new QuantityComparison(QuantityConversion.MeasurementUnit.FEET, 3.0);
        new QuantityComparison().getValueConverted(first, second);
        Assert.assertTrue(first.equals(second));
    }

    @Test
    public void given2InchAnd5CM_shouldReturnTrue() {
        QuantityComparison first = new QuantityComparison(QuantityConversion.MeasurementUnit.INCH, 2.0);
        QuantityComparison second = new QuantityComparison(QuantityConversion.MeasurementUnit.CENTIMETER, 5.08);
        new QuantityComparison().getValueConverted(first, second);
        Assert.assertTrue(first.equals(second));
    }

    //Volume

    @Test
    public void given1LiterAnd1000MilliLiter_shouldReturnTrue() {
        QuantityComparison first = new QuantityComparison(QuantityConversion.MeasurementUnit.LITRE, 1.0);
        QuantityComparison second = new QuantityComparison(QuantityConversion.MeasurementUnit.MILLI_LITRE, 1000.0);
        new QuantityComparison().getValueConverted(first, second);
        Assert.assertTrue(first.equals(second));
    }

    @Test
    public void given1GallonAnd3point78Liter_shouldReturnTrue() {
        QuantityComparison first = new QuantityComparison(QuantityConversion.MeasurementUnit.GALLON, 1.0);
        QuantityComparison second = new QuantityComparison(QuantityConversion.MeasurementUnit.LITRE, 3.78);
        new QuantityComparison().getValueConverted(first, second);
        Assert.assertTrue(first.equals(second));
    }

    //Weight

    @Test
    public void given1KiloGramAnd1000Gram_shouldReturnEqual() {
        QuantityComparison first = new QuantityComparison(QuantityConversion.MeasurementUnit.KILO_GRAMS, 1.0);
        QuantityComparison second = new QuantityComparison(QuantityConversion.MeasurementUnit.GRAMS, 1000.0);
        new QuantityComparison().getValueConverted(first, second);
        Assert.assertTrue(first.equals(second));
    }

    @Test
    public void given1TonAnd1000KG_shouldReturnEqual() {
        QuantityComparison first = new QuantityComparison(QuantityConversion.MeasurementUnit.TON, 1.0);
        QuantityComparison second = new QuantityComparison(QuantityConversion.MeasurementUnit.KILO_GRAMS, 1000.0);
        new QuantityComparison().getValueConverted(first, second);
        Assert.assertTrue(first.equals(second));
    }
}