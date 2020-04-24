import java.util.Objects;

/**
 * triangle class are extended of polygon class
 * this class is for polygon shapes that are triangle
 * and has methods that can calculate perimeter and area of shape
 * also method that check this shape is equilateral or not
 *
 * @author Mohammad Javad Rajabi
 * @version 1.0.0
 * @since 2020-04-10
 */
public class Triangle extends Polygon {

    // constructor

    /**
     * Constructor for create triangle object
     * @param sides this parameter is list of sides of triangle
     */
    public Triangle(Double... sides) {
        super(sides);
    }

    /**
     * This method is used to check this shape is equilateral or not
     * @return boolean This returns true if this shape is equilateral.
     */
    public boolean isEquilateral() {
        if (sides.get(0).equals(sides.get(1)) && sides.get(1).equals(sides.get(2))){
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
        perimeter = sides.get(0) + sides.get(1) +sides.get(2);
        return perimeter;
    }

    /**
     * This method is used to calculate area.
     * @return double This returns value of area.
     */
    public double calculateArea() {
        double area;
        double p= (calculatePerimeter())/2;
        area = Math.sqrt(p*(p-sides.get(0))*(p-sides.get(1))*(p-sides.get(2)));
        return area;
    }

    /**
     * This method is used to draw type of shape
     * and its perimeter and area are printed via super class
     */
    public void draw() {
        System.out.printf("Triangle");
        super.draw();
    }

    /**
     * This method is used to create a string that declare type and sides of this shape.
     * @return String This returns a string that declare type and sides of this shape.
     */
    @Override
    public String toString() {
        String string = "Triangle::";
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
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return getSides().equals(triangle.getSides());
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
