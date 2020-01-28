import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void givenFeetAndFeet_shouldReturnEqual(){
            Feet first = new Feet(0.0);
            Feet second = new Feet(0.0 );
            Assert.assertEquals(first, second);
    }
}