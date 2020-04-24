import java.util.Objects;

/**
 * The type Circle.
 */
public class Circle extends Shape {
    private double radius;

    /**
     * Instantiates a new Circle.
     *
     * @param r the r
     */
    public Circle(double r) {
        radius = r;
    }

    /**
     * Gets radius.
     *
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.format("Circle, perimeter: %f, area: %f\n",
                calculatePerimeter(), calculateArea());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
