import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void givenFeetAndFeet_shouldReturnEqual() {
        Feet first = new Feet(0.0);
        Feet second = new Feet(0.0);
        Assert.assertEquals(first, second);
    }

    @Test
    public void givenSameReferenceOfFeet_shouldReturnEqual() {
        Feet first = new Feet(0.0);
        Assert.assertTrue(first.equals(new Feet(0.0)));
    }

    @Test
    public void givenSameClassOfFeet_shouldReturnEqual() {
        Feet first = new Feet(0.0);
        Assert.assertTrue(first.getClass().equals(new Feet(0.0).getClass()));
    }

    @Test
    public void givenInchAndInch_shouldReturnEqual() {
        Inch first = new Inch(0.0);
        Inch second = new Inch(0.0);
        Assert.assertTrue(first.equals(second));
    }
}