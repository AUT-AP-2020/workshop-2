import java.util.ArrayList;
import java.util.Objects;

/**
 * The type Polygon.
 */
public abstract class Polygon extends Shape {
    /**
     * The Sides.
     */
    protected ArrayList<Double> sides;

    /**
     * Instantiates a new Polygon.
     *
     * @param a the a
     */
    Polygon(double... a){
        sides = new ArrayList<>();
        for(double x : a) {
            sides.add(x);
        }
    }

    /**
     * Gets sides.
     *
     * @return the sides
     */
    public ArrayList<Double> getSides() {
        return sides;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Polygon polygon = (Polygon) o;
        return sides.equals(polygon.sides);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sides);
    }
}
