/**
 * circle Class inherits from Shape
 */
public class Circle extends Shape {
    private int radius;

    /**
     * create a circle
     * @param radius radius of circle
     */
    public Circle(int radius) {
        this.radius = radius;
    }

    /**
     * calculate perimeter of circle: 2 * π * radius
     * @return perimeter of circle
     */
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * calculate area of circle: π * radius * radius
     * @return area of circle
     */
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public int getRadius() {
        return radius;
    }

    /**
     * circle to string
     * @return circle to string
     */
    @Override
    public String toString() {
        return "circle (radius = " + radius +")";
    }
}