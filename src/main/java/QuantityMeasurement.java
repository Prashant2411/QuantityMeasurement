public class QuantityMeasurement {

    public enum MeasurementUnit{
        FEET(1,1), INCH(12,1), YARD(1,3);

        private final double i;
        private final double j;

        MeasurementUnit(double i, double j) {
            this.i = i;
            this.j = j;
        }

        public double getConvertedValue(double value) {
            return (value*j)/i;
        }
    }
}
