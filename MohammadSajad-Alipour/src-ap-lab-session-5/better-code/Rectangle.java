/**
 * This is a class for rectangle polygons and inherits from Polygon
 */
public class Rectangle extends Polygon {

    public Rectangle(Integer... sides) {
        super(sides);
    }

    @Override
    public double calculateArea() {
        if (sides.get(0) == sides.get(1)) {
            return sides.get(0) * sides.get(2);
        } else {
            return sides.get(0) * sides.get(1);
        }
    }

    /**
     * This is a method to check if it is square
     *
     * @return
     */
    public boolean isSquare() {
        if (sides.get(0) == sides.get(1) && sides.get(1) == sides.get(2) && sides.get(2) == sides.get(3)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Rectangle:: " + super.toString();
    }
}
