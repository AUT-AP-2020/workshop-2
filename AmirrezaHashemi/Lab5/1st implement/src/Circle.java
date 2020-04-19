import java.util.Objects;

public class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double calculatePerimeter()
    {
        return (radius*2*3.14);

    }
    public double calculateArea()
    {
        return (radius*radius*3.14);
    }
    public void draw()
    {
        System.out.println("Circle : perimeter : "+calculatePerimeter()+" area : "+calculateArea());
    }
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

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
