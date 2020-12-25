import java.util.ArrayList;

/**
 * sub class of polygon
 * @author Setayesh
 * @version 0.1
 */
public class Rectangle extends Polygon{

    /**
     * constructor
     * @param side sides of this rectangle
     */
    public Rectangle(double... side) {
        super(side);
    }


    /**
     * calculate the area of this rectangle
     * @return area of this rectangle
     */
    public double calculateArea() {
        return getSides().get(0) * getSides().get(1);
    }



    /**
     * get the sides of this rectangle
     * @return sides of this rectangle
     */
    public ArrayList<Double> getSides() {
        return sides;
    }

    /**
     * checks if all sides are equal
     * @return true if equals else false.
     */
    public boolean isSquare()
    {
        return getSides().get(0).equals(getSides().get(1));
    }


    /**
     * compare this object with this shape depends on sides .
     * @param o object check
     * @return true if are equal
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        return super.equals(o);
    }
}