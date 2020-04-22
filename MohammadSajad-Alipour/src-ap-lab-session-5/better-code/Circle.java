/**
 * This is a class for circle shapes and inherits from Shape
 */
public class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }


    public int getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle:: radius:" + radius;
    }
}
