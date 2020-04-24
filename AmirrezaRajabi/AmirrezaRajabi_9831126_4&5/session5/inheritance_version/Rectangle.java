/**
 * rectangle class inherits from Polygon
 */
public class Rectangle extends Polygon {

    /**
     * crate rectangle
     * @param sides
     */
    public Rectangle(Integer... sides) {
        super(sides);
    }
    /**
     * calculate area of rectangle: h * l
     * @return area
     */
    @Override
    public double calculateArea() {
        if (sides.get(0) == sides.get(1))
        {
            return sides.get(0) * sides.get(2);
        }
        return sides.get(0) * sides.get(1);
    }

    /**
     * rectangle is square
     * @return 1 is 0 not
     */
    public int isSquare() {
        if (sides.get(0) == sides.get(1) && sides.get(1) == sides.get(2) && sides.get(2) == sides.get(3)) {
            return 1;
        }
        return 0;
    }
    /**
     * rectangle to string
     * @return rectangle to string
     */
    @Override
    public String toString() {
        return "Rectangle; " + super.toString();
    }
}
