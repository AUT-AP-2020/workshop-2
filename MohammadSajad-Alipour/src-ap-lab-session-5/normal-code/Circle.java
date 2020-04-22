import java.util.Objects;

/**
 * This is a class for circle
 */
public class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    /**
     * This is a method to calculate Perimeter
     *
     * @return
     */
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * This is a method to calculate Area
     *
     * @return
     */
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    /**
     * This is a method to draw a shape
     *
     * @return
     */
    public void draw() {
        System.out.println(this.getClass().getName());
        System.out.println("Perimeter = " + calculatePerimeter());
        System.out.println("Area = " + calculateArea());
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
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
