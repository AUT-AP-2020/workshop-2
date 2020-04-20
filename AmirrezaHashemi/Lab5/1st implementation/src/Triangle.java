import java.util.ArrayList;
import java.util.Objects;

/**
 * The Triangle class implement a triangle.
 *
 * @author Amirreza Hashemi
 * @version 1.0
 * @since 4/19/2020
 */
public class Triangle {
    private ArrayList<Double> sides;

    /**
     * Instantiates a new Triangle.
     *
     * @param side1 one of the sides
     * @param side2 one of the sides
     * @param side3 one of the sides
     */
    public Triangle(double side1, double side2, double side3) {
        sides = new ArrayList<>();
        sides.add(side1);
        sides.add(side2);
        sides.add(side3);
    }

    /**
     * Checks if the triangle is equilateral‬‬.
     *
     * @return the boolean true if it's equilateral‬‬ and false otherwise
     */
    public boolean isEquilateral‬‬() {
        return (sides.get(0).equals(sides.get(1)) && sides.get(1).equals(sides.get(2)));
    }

    /**
     * Prints triangle perimeter and area.
     */
    public void draw() {
        System.out.println("Triangle : perimeter : " + calculatePerimeter() + " area : " + calculateArea());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return (calculateArea() == triangle.calculateArea() &&
                calculatePerimeter() == triangle.calculatePerimeter()) &&
                ( sides.get(0).equals(triangle.getSides().get(1)) || sides.get(0).equals(triangle.getSides().get(2)) ||
                        sides.get(0).equals(triangle.getSides().get(3)));
    }

    /**
     * Calculates perimeter of triangle.
     *
     * @return the double perimeter of triangle
     */
    public double calculatePerimeter() {

        return (sides.get(0) + sides.get(1) + sides.get(2));

    }

    /**
     * Calculates area of triangle.
     *
     * @return the double area of triangle
     */
    public double calculateArea() {
        double p = calculatePerimeter() / 2;
        return (Math.sqrt(Math.abs(p * (p - sides.get(0)) * (p - sides.get(1)) * (p - sides.get(2)))));

    }

    @Override
    public String toString() {
        return "Triangle : " +
                "sides=" + sides;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sides);
    }

    /**
     * Gets sides of triangle.
     *
     * @return the sides of triangle
     */

    public ArrayList<Double> getSides() {
        return sides;
    }
}
