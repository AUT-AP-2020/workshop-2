/**
 * Circle Object
 * @author Keivan Ipchi Hagh
 * @since 2020/5/4
 * @override 1.0.1
 */
public class Circle extends Shape {

    /**
     * Does what it says
     */
    double radius;

    /**
     * Circle constructor
     * @param radius Radius
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Returns the area of object, Handles users side orders as well
     * @return Area
     */
    public double calculateArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    /**
     * Returns the perimeter of object
     * @return Perimeter
     */
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * Getter: Get radius
     * @return Radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Draws the object
     */
    public void draw() {
        System.out.println("Circle) Perimeter: " + calculatePerimeter() + "\tArea: " + calculateArea());
    }

    /**
     * Checks whether two objects are equal or not
     * @override Object.equals()
     * @param circle Triangle obj
     * @return Equality Indicator
     */
    public boolean equals(Circle circle) {
        return this.radius == circle.radius;
    }

    /**
     * Returns total status of the object
     * @override Object.toString()
     * @return String
     */
    public String toString() {
        return "Rectangle) Radius: " +  radius;
    }
}
