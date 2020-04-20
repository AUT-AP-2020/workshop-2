/**
 * The Circle class implement a circle.
 *
 * @author Amirreza Hashemi
 * @version 2.0
 * @since 4/19/2020
 */
public class Circle extends Shape {

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
     * Gets radius of circle.
     *
     * @return the radius
     */
    public int getRadius() {
        return radius;
    }

    @Override
    public double calculatePerimeter() {
        return (radius * 2 * 3.14);
    }

    @Override
    public double calculateArea() {
        return (radius * radius * 3.14);
    }

    @Override
    public String toString() {
        return "Circle : " +
                "radius=" + radius;
    }
}
