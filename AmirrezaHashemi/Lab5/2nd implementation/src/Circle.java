public class Circle extends Shape {

    private int radius;
    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double calculatePerimeter() {
        return (radius*2*3.14);
    }

    @Override
    public double calculateArea() {
        return (radius*radius*3.14);
    }

    @Override
    public String toString() {
        return "Circle : " +
                "radius=" + radius ;    }
}
