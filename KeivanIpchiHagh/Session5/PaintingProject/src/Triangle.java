/**
 * Triangle Object
 * @author Keivan Ipchi Hagh
 * @since 2020/5/4
 * @version 1.0.1
 */
import java.util.ArrayList;

public class Triangle {

    /**
     * A list of object sides
     */
    private ArrayList<Double> sides;

    /**
     * Triangle Constructor, Initializes fields
     * @param side1 Side1
     * @param side2 Side2
     * @param side3 Side3
     */
    public Triangle(double side1, double side2, double side3) {
        sides = new ArrayList<Double>();
        sides.add(side1);
        sides.add(side2);
        sides.add(side3);
    }

    /**
     * Checks whether object is Equilateral or not
     * @return Equilateral Indicator
     */
    public Boolean isEquilateral() {
        return sides.get(0).equals(sides.get(1)) && sides.get(0).equals(sides.get(2));

    }

    /**
     * Getter: Get sides
     * @return Sides
     */
    public ArrayList<Double> getSides() {
        return sides;
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
        System.out.println("Triangle) Perimeter: " + calculatePerimeter() + "\tArea: " + calculateArea());
    }

    /**
     * Checks whether two objects are equal or not
     * @override Object.equals()
     * @param triangle Triangle obj
     * @return Equality Indicator
     */
    public boolean equals(Triangle triangle) {
        for (int i = 0; i < sides.size(); i++)
            if (sides.get(i).equals(triangle.getSides().get(i)))
                return true;
        return false;
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
