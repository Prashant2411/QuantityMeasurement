public class QuantityMeasurement {

    public enum MeasurementUnit {
        FEET(12, 1), INCH(1, 1), YARD(36, 1), CENTIMETER(1, 2.54);

        private final double i;
        private final double j;

        MeasurementUnit(double i, double j) {
            this.i = i;
            this.j = j;
        }

        public double getConvertedToInch(double value) {
            return Math.round(value * i / j);
        }

        public double getUnitsSame(double value){
            return Math.round(value * j / i);
        }
    }
}
