import java.util.ArrayList;
import java.util.Arrays;

public class Shape {

    ArrayList<Double> sides;

    public Shape(Double... sides) {
        this.sides = new ArrayList<>();
        this.sides.addAll(Arrays.asList(sides));
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
