import org.junit.Assert;
import org.junit.Test;

public class WeightComparisonTest {

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
