/**
 * @author Ali Ansari
 * @version 1.0.0
 * Circle class extend to Shape
 */
public class Circle extends Shape {
    private int radius;

    /**
     * Constructor for Circle
     * @param radius Radius
     */
    public Circle(int radius) {
        this.radius = radius;
    }

    /**
     * Getter for radius
     * @return Radius
     */
    public int getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return radius*radius*3.14;
    }

    @Override
    public double calculatePerimeter() {
        return 2*radius*3.14;
    }

    @Override
    public void draw() {
        System.out.println("Circle Area:"+calculateArea()+" Perimeter:"+calculatePerimeter());
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
