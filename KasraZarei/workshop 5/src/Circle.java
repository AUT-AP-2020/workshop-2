/**
 * <h1>Circle class</h1>
 *
 * @Override calculatePerimeter from shape class
 * @Override calculateArea from shape class
 * @Override equals from object class
 * @Override toString form object
 * this class calculate circle property
 */
public class Circle extends Shape {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return " " + String.valueOf(getRadius());
    }

    @Override
    public double calculatePerimeter(Shape shape) {
        Circle circle = (Circle) shape;
        return circle.getRadius() * 2 * Math.PI;
    }

    @Override
    public double calculateArea(Shape shape) {
        Circle circle = (Circle) shape;
        return Math.pow(circle.getRadius(), 2) * Math.PI;
    }

    @Override
    public boolean equals(Object o) {
        if (((Circle) o).getRadius() == this.getRadius()) {
            return true;
        }
        return false;
    }
}
