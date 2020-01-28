public class QuantityMeasurement {

    public enum MeasurementUnit{
        FEET(30.48), INCH(2.5), YARD(91.44), CENTIMETER(1);

        private final double i;

        MeasurementUnit(double i) {
            this.i = i;
        }

        public double getConvertedValue(double value) {
            return value*i;
        }
    }
}
