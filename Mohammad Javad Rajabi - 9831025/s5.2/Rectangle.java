import java.util.Objects;

/**
 * rectangle class are extended of polygon class
 * this class is for polygon shapes that are rectangle
 * and has methods that can calculate perimeter and area of shape
 * also method that check this shape is square or not
 *
 * @author Mohammad Javad Rajabi
 * @version 1.0.0
 * @since 2020-04-10
 */
public class Rectangle extends Polygon {

    // constructor

    /**
     * Constructor for create rectangle object
     * @param sides this parameter is list of sides of rectangle
     */
    public Rectangle(Double... sides) {
        super(sides);
    }

    /**
     * This method is used to check this shape is square or not
     * @return boolean This returns true if this shape is square.
     */
    public boolean isSquare() {
        if (sides.get(0).equals(sides.get(1))) {
            return true;
        }
        return false;
    }

    /**
     * This method is used to calculate perimeter.
     * @return double This returns value of perimeter.
     */
    public double calculatePerimeter() {
        double perimeter;
        perimeter = (sides.get(0) + sides.get(1)) * 2;
        return perimeter;
    }

    /**
     * This method is used to calculate area.
     * @return double This returns value of area.
     */
    public double calculateArea() {
        double area;
        area = sides.get(0) * sides.get(1);
        return area;
    }

    /**
     * This method is used to draw type of shape
     * and its perimeter and area are printed via super class
     */
    public void draw() {
        System.out.printf("Rectangle");
        super.draw();
    }

    /**
     * This method is used to create a string that declare type and sides of this shape.
     * @return String This returns a string that declare type and sides of this shape.
     */
    @Override
    public String toString() {
        String string = "Rectangle::";
        return string += super.toString();
    }

    /**
     * This method is used to check equality of this shape and o obj
     * @param o This is a object that we want check the equality
     * @return boolean this returns true if input object is equal
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) o;
        return getSides().equals(rectangle.getSides());
    }

    /**
     * This method is used to create hash code
     * @return int this return hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getSides());
    }
}
