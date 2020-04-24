import java.util.Objects;

/**
 * circle class are extended of shape class
 * this class is for circle shapes
 * and has methods that can calculate perimeter and area of shape
 *
 * @author Mohammad Javad Rajabi
 * @version 1.0.0
 * @since 2020-04-10
 */
public class Circle extends Shape {

    //fields

    /**
     * variable that store value of radius
     */
    private double radius;

    // constructor

    /**
     * Constructor for create circle object
     * @param radius this parameter is value of radius.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    // methods

    /**
     *  This method is used to be able to access value of radius.
     * @return ArrayList This returns value of radius.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * This method is used to calculate perimeter.
     * @return double This returns value of perimeter.
     */
    @Override
    public double calculatePerimeter() {
        double perimeter;
        perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    /**
     * This method is used to calculate area.
     * @return double This returns value of area.
     */
    @Override
    public double calculateArea() {
        double area;
        area = Math.PI * radius * radius;
        return area;
    }

    /**
     * This method is used to draw type of shape
     * and its perimeter and area are printed via super class
     */
    @Override
    public void draw() {
        System.out.printf("Circle");
        super.draw();
    }

    /**
     * This method is used to create a string that declare type and radius of this shape.
     * @return String This returns a string that declare type and radius of this shape.
     */
    @Override
    public String toString() {
        return "Circle:: " +
                "radius:" + radius;
    }

    /**
     * This method is used to check equality of this shape and o obj
     * @param o This is a object that we want check the equality
     * @return boolean this returns true if input object is equal
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.getRadius(), getRadius()) == 0;
    }

    /**
     * This method is used to create hash code
     * @return int this return hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getRadius());
    }
}
