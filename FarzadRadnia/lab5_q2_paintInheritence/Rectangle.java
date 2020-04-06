import java.util.ArrayList;

/**
 * shape of rectangle.
 */
public class Rectangle extends Polygon{

    /**
     * makes a valid rectangle . if the sides are not valid, the construction would be ignored.
     * @param side sides of this rectangle
     */
    public Rectangle(double... side) {
        super(side);
        if(side.length != 0) {
            if (side[0] != side[2] || side[1] != side[3]) {
                System.out.println("this is not a Rectangle.");
                sides.clear();
            }
        }
        else
                System.out.println("this is not a Rectangle.");


    }


    /**
     * calculate the area of this rectangle
     * @return area of this rectangle
     */
    public double calculateArea()
    {
        if(sides.size() == 0)
            return 0;
        return sides.get(0) * sides.get(1);
    }

    /**
     * prints the kind , perimeter and area of this rectangle
     */
    public void draw()
    {
        System.out.println("Rectangle "+ (isSquare()?" (Square) ":"") +":  Perimeter: " + calculatePerimeter() + "  Area: " + calculateArea());
    }



    /**
     * prints kind  and sizes of this rectangle.
     * @return make a string that contains kind  and sizes of this rectangle
     */
    @Override
    public String toString() {
        return "Rectangle " + (isSquare()?" (Square) ":"") + " sides:   " + sides.get(0) + "    " + sides.get(1) + "    " + sides.get(2) + "    " + sides.get(3);
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
        return sides.get(0).equals(sides.get(1));
    }


    /**
     * compare this object with this shape depends on sides .
     * @param o object to be checked
     * @return true if are equal else false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        return super.equals(o);
    }

    /**
     * make a hash code
     * @return hash code
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
