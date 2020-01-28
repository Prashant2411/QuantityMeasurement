import java.util.Objects;

public class Inch {
    Double value;
    public Inch(Double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inch inch = (Inch) o;
        return Objects.equals(value, inch.value);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
