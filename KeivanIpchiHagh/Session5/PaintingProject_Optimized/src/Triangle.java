/**
 * Triangle Object
 * @author Keivan Ipchi Hagh
 * @since 2020/5/4
 * @override 1.0.1
 */
import java.util.ArrayList;

public class Triangle extends Polygon {

    /**
     * Triangle Constructor, Initializes sides
     * @param sides Sides
     */
    public Triangle(Double... sides) {
        super(sides);
    }

    /**
     * Checks whether object is Equilateral or not
     * @return Equilateral Indicator
     */
    public Boolean isEquilateral() {
        return sides.get(0).equals(sides.get(1)) && sides.get(0).equals(sides.get(2));
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
        System.out.println("Triangle) Perimeter: " + this.calculatePerimeter() + "\tArea: " + this.calculateArea());
    }

    /**
     * Returns total status of the object
     * @override Object.toString()
     * @return String
     */
    public String toString() {
        String result = "Triangle) Sides: ";
        for (int i = 0; i < sides.size(); i++)
            if (i != sides.size() - 1)
                result += sides.get(i) + ", ";
            else
                result += sides.get(i);

        return result;
    }
}
