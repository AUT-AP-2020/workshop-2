/**
 * Rectangle Object
 * @author Keivan Ipchi Hagh
 * @since 2020/5/4
 * @override 1.0.1
 */

public class Rectangle extends Polygon {

    /**
     * Rectangle Constructor, Initializes fields
     * @param sides Sides
     */
    public Rectangle(Double... sides) {
        super(sides);
    }

    /**
     * Checks whether rectangle is square of some type or not
     * @return Indicator
     */
    public boolean isSquare() {
        return sides.get(0).equals(sides.get((1))) && sides.get(1).equals(sides.get(2)) && sides.get(2).equals(sides.get(3));
    }

    /**
     * Returns the perimeter of object
     * @return Perimeter
     */
    public double calculatePerimeter() {
        return sides.get(0) + sides.get(1) + sides.get(2);
    }

    /**
     * Returns the area of object
     * @return Area
     */
    public double calculateArea() {
        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * (s - sides.get(0)) * (s - sides.get(1)) * (s - sides.get(2)));
    }

    /**
     * Draws the object
     */
    public void draw() {
        System.out.println("Rectangle) Perimeter: " + this.calculatePerimeter() + "\tArea: " + this.calculateArea());
    }

    /**
     * Returns total status of the object
     * @override Object.toString()
     * @return String
     */
    public String toString() {
        String result = "Rectangle) Sides: ";
        for (int i = 0; i < sides.size(); i++)
            if (i != sides.size() - 1)
                result += sides.get(i) + ", ";
            else
                result += sides.get(i);

        return result;
    }
}
