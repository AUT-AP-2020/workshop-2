import java.util.ArrayList;
import java.util.Arrays;

/**
 * The Polygon class implement polygon shapes.
 *
 * @author Amirreza Hashemi
 * @version 1.0
 * @since 4/19/2020
 */
public abstract class Polygon extends Shape {

    /**
     * The Sides of polygon.
     */
    protected ArrayList<Double> sides;

    /**
     * Instantiates a new Polygon with given sides.
     *
     * @param sidesArg the sides
     */
    public Polygon(Double... sidesArg) {
        sides = new ArrayList<>();
        sides.addAll(Arrays.asList(sidesArg));
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
    public double calculatePerimeter() {
        double p = 0;
        for (Double side : sides)
            p += side;
        return p;
    }

    @Override
    public abstract double calculateArea();

    @Override
    public String toString() {
        return getClass().getName() + " : " +
                "sides=" + sides;
    }
}
