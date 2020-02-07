public class QuantityAddition {

    private QuantityConversion quantityConversion = new QuantityConversion();
    double value[];
    QuantityConversion.MeasurementUnit unit[];

    public QuantityAddition(double... value) {
        this.value = value;
    }

    public QuantityAddition() {
    }

    public QuantityAddition(QuantityConversion.MeasurementUnit... unit) {
        this.unit = unit;
    }

    public QuantityAddition(QuantityConversion quantityConversion) {
        this.quantityConversion = quantityConversion;
    }

    public double getAddition(QuantityAddition values, QuantityAddition units) {
        double sum = 0;
        for (int i = 0; i < values.value.length; i++)
            sum += quantityConversion.getConverted(values.value[i], units.unit[i]);
        return sum;
    }
}