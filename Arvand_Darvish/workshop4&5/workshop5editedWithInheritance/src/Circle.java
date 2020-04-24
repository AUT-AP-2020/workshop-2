import java.util.Objects;

public class Circle extends Shape {

    private int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    public double calculatePerimeter() {
        return 2*3.14*radius;
    }

    public double calculateArea() {
        return 3.14*radius*radius;
    }

    public void draw() {
        System.out.println(toString());
        System.out.println("Perimeter = " + calculatePerimeter());
        System.out.println("Area = " + calculateArea());
        System.out.println();
    }

    @Override
    public String toString() {
        return "Circle{" + " radius=" + radius + '}';
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
        return Objects.hash(getRadius());
    }

    public int getRadius() {
        return radius;
    }
}
