import java.util.ArrayList;
import java.util.Objects;

/**
 * The Rectangle class implement a rectangle.
 *
 * @author Amirreza Hashemi
 * @version 1.0
 * @since 4/19/2020
 */
public class Rectangle {
    private ArrayList<Double> sides;

    /**
     * Instantiates a new Rectangle.
     *
     * @param side1 one of the sides
     * @param side2 one of the sides
     * @param side3 one of the sides
     * @param side4 one of the sides
     */
    public Rectangle(double side1, double side2, double side3, double side4) {
        sides = new ArrayList<>();
        sides.add(side1);
        sides.add(side2);
        sides.add(side3);
        sides.add(side4);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return (calculateArea() == rectangle.calculateArea() && calculatePerimeter() == rectangle.calculatePerimeter());
    }

    @Override
    public int hashCode() {
        return Objects.hash(sides);
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

    /**
     * Calculates perimeter of rectangle.
     *
     * @return the double perimeter of rectangle
     */
    public double calculatePerimeter() {
        return (sides.get(0) + sides.get(1) + sides.get(2) + sides.get(3));

    }

    /**
     * Calculates area of rectangle.
     *
     * @return the double area of rectangle
     */
    public double calculateArea() {
        if (!(sides.get(0).equals(sides.get(1))))
            return sides.get(0) * sides.get(1);
        else
            return sides.get(0) * sides.get(2);

    }

    /**
     * Gets sides of rectangle.
     *
     * @return the sides of rectangle
     */
    public ArrayList<Double> getSides() {
        return sides;
    }

    @Override
    public String toString() {
        return "Rectangle : " +
                "sides=" + sides;
    }

    /**
     * Prints rectangle perimeter and area.
     */
    public void draw() {
        System.out.println("Rectangle : perimeter : " + calculatePerimeter() + " area : " + calculateArea());
    }
}
