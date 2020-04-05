/**
 * Rectangle Object
 * @author Keivan Ipchi Hagh
 * @since 2020/5/4
 * @version 1.0.1
 */
import java.util.ArrayList;

public class Rectangle {

    /**
     * A list of object sides
     */
    private ArrayList<Double> sides;

    /**
     * Rectangle Constructor, Initializes fields
     * @param side1 Side1
     * @param side2 Side2
     * @param side3 Side3
     * @param side4 Side4
     */
    public Rectangle(double side1, double side2, double side3, double side4) {
        sides = new ArrayList<>();
        sides.add(side1);
        sides.add(side2);
        sides.add(side3);
        sides.add(side4);
    }

    /**
     * Getter: Get sides
     * @return Sides
     */
    public ArrayList<Double> getSides() {
        return sides;
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
        return sides.get(0) + sides.get(1) + sides.get(2) + sides.get(3);
    }

    /**
     * Returns the area of object, Handles users side orders as well
     * @return Area
     */
    public double calculateArea() {
        if (!sides.get(0).equals(sides.get(1)))
            return sides.get(0) * sides.get(1);
        else if (!sides.get(0).equals(sides.get(2)))
            return sides.get(0) * sides.get(2);
        else
            return sides.get(0) * sides.get(3);
    }

    /**
     * Draws the object
     */
    public void draw() {
        System.out.println("Rectangle) Perimeter: " + calculatePerimeter() + "\tArea: " + calculateArea());
    }

    /**
     * Checks whether two objects are equal or not
     * @override Object.equals()
     * @param rectangle Triangle obj
     * @return Equality Indicator
     */
    public boolean equals(Rectangle rectangle) {
        for (int i = 0; i < sides.size(); i++)
            if (sides.get(i).equals(rectangle.getSides().get(i)))
                return true;
        return false;
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
