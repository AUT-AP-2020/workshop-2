import java.util.ArrayList;

/**
 * polygon class are extended of shape class
 * this class is for shapes that are polygon
 * and has list of sides for this shape
 *
 * @author Mohammad Javad Rajabi
 * @version 1.0.0
 * @since 2020-04-10
 */
public class Polygon extends Shape {


    //fields

    /**
     * list of sides of polygon
     */
    protected ArrayList<Double> sides;


    //constructors

    /**
     * Constructor for create polygon object
     * @param sides this parameter is list of sides of polygon
     */
    public Polygon(Double... sides) {
        this.sides = new ArrayList<Double>();
        for (Double side : sides) {
            this.sides.add(side);
        }
    }


    // methods

    /**
     *  This method is used to be able to access list of sides.
     * @return ArrayList This returns list of sides.
     */
    public ArrayList<Double> getSides() {
        return sides;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }

    @Override
    public double calculateArea() {
        return 0;
    }


    /**
     * This method is used to create a string that declare type and sides of this shape.
     * @return String This returns a string that declare type and sides of this shape.
     */
    @Override
    public String toString() {
        String string = " ";
        for (Double side : sides) {
            string += "side" + (sides.indexOf(side) + 1) + ":" + side + " ";
        }
        return string;
    }
}
