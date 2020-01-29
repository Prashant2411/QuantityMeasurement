import org.junit.Assert;
import org.junit.Test;

public class VolumeComparisonTest {

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
}