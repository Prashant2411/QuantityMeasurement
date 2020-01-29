public class QuantityConversion {

    public enum MeasurementUnit {
        FEET(12, 1, "Length"), INCH(1, 1, "Length"), YARD(36, 1, "Length"), CENTIMETER(1, 2.54, "Length"),
        LITRE(1, 1, "Volume"), MILLI_LITRE(1, 1000, "Volume"), GALLON(3.78, 1, "Volume");

        private final double i;
        private final double j;
        private final String unitType;

        MeasurementUnit(double i, double j, String unitType) {
            this.i = i;
            this.j = j;
            this.unitType = unitType;
        }

        public double getConverted(double value) {
            return Math.round(value * i / j);
        }

        public double getUnitsSame(double value){
            return Math.round(value * j / i);
        }

        public String getUnitType() { return unitType; }
    }
}