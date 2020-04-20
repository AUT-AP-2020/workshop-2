/**
 * The Rectangle class implement a rectangle.
 *
 * @author Amirreza Hashemi
 * @version 2.0
 * @since 4/19/2020
 */
public class Rectangle extends Polygon {

    /**
     * Instantiates a new Rectangle.
     *
     * @param sidesArg the sides arg
     */
    public Rectangle(Double... sidesArg) {
        super(sidesArg);
    }

    @Override
    public double calculateArea() {
        if (!(sides.get(0).equals(sides.get(1))))
            return sides.get(0) * sides.get(1);
        else
            return sides.get(0) * sides.get(2);

    }

    /**
     * Checks if the rectangle is square.
     *
     * @return the boolean true if it's square and false otherwise
     */
    public boolean isSquare‬‬() {
        return (sides.get(0).equals(sides.get(1)) && sides.get(1).equals(sides.get(2))
                && sides.get(2).equals(sides.get(3)));
    }
}
