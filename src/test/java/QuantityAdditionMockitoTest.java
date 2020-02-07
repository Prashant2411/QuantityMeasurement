import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.Mockito.when;

public class QuantityAdditionMockitoTest {

    @Mock
    QuantityConversion quantityConversion;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    //Length

    @Test
    public void given2InchAnd2Inch_shouldReturnAddition() {
        QuantityAddition values = new QuantityAddition(2.0,3.0);
        QuantityAddition units = new QuantityAddition(QuantityConversion.MeasurementUnit.INCH, QuantityConversion.MeasurementUnit.INCH);
        QuantityAddition quantityAddition = new QuantityAddition(quantityConversion);
        when(quantityConversion.getConverted(values.value[0], units.unit[0])).thenReturn(2.0);
        when(quantityConversion.getConverted(values.value[1], units.unit[1])).thenReturn(1.0);
        double addition = quantityAddition.getAddition(values, units);
        Assert.assertEquals(3.0, addition, 0);
    }

    @Test
    public void given1FeetAnd2Inch_shouldReturnAddition() {
        QuantityAddition values = new QuantityAddition(1.0,3.0);
        QuantityAddition units = new QuantityAddition(QuantityConversion.MeasurementUnit.FEET, QuantityConversion.MeasurementUnit.INCH);
        QuantityAddition quantityAddition = new QuantityAddition(quantityConversion);
        when(quantityConversion.getConverted(values.value[0], units.unit[0])).thenReturn(12.0);
        when(quantityConversion.getConverted(values.value[1], units.unit[1])).thenReturn(1.0);
        double addition = quantityAddition.getAddition(values, units);
        Assert.assertEquals(13.0, addition, 0);
    }

    //Volume

    @Test
    public void given1LitreAnd1000ML_shouldReturnAddition() {
        QuantityAddition values = new QuantityAddition(1.0,7000);
        QuantityAddition units = new QuantityAddition(QuantityConversion.MeasurementUnit.LITRE, QuantityConversion.MeasurementUnit.MILLI_LITRE);
        QuantityAddition quantityAddition = new QuantityAddition(quantityConversion);
        when(quantityConversion.getConverted(values.value[0], units.unit[0])).thenReturn(1.0);
        when(quantityConversion.getConverted(values.value[1], units.unit[1])).thenReturn(2.0);
        double addition = quantityAddition.getAddition(values, units);
        Assert.assertEquals(3.0, addition, 0);
    }

    //Weight

    @Test
    public void given1000TonAnd1000GM_shouldReturnAddition() {
        QuantityAddition values = new QuantityAddition(1.0,8000.0);
        QuantityAddition units = new QuantityAddition(QuantityConversion.MeasurementUnit.TON, QuantityConversion.MeasurementUnit.GRAMS);
        QuantityAddition quantityAddition = new QuantityAddition(quantityConversion);
        when(quantityConversion.getConverted(values.value[0], units.unit[0])).thenReturn(1000.0);
        when(quantityConversion.getConverted(values.value[1], units.unit[1])).thenReturn(2.0);
        double addition = quantityAddition.getAddition(values, units);
        Assert.assertEquals(1002, addition, 0.1);
    }
}