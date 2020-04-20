import java.util.Objects;

/**
 * The Circle class implement a circle.
 *
 * @author Amirreza Hashemi
 * @version 1.0
 * @since 4/19/2020
 */
public class Circle {
    private int radius;

    /**
     * Instantiates a new Circle with given radius.
     *
     * @param radius the radius of circle
     */
    public Circle(int radius) {
        this.radius = radius;
    }

    /**
     * Calculates perimeter of circle.
     *
     * @return the double perimeter of circle
     */
    public double calculatePerimeter() {
        return (radius * 2 * 3.14);

    }

    /**
     * Calculates area of circle.
     *
     * @return the double area of circle
     */
    public double calculateArea() {
        return (radius * radius * 3.14);
    }

    /**
     * Prints circle's perimeter and area.
     */
    public void draw() {
        System.out.println("Circle : perimeter : " + calculatePerimeter() + " area : " + calculateArea());
    }

    @Override
    public String toString() {
        return "Circle : " +
                "radius=" + radius;
    }

    /**
     * Gets radius of circle.
     *
     * @return the radius
     */
    public int getRadius() {
        return radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}
