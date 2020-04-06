import java.util.ArrayList;
import java.util.Objects;

/**
 * Polygon shapes.
 */
public class Polygon  extends  Shape{

    protected ArrayList<Double> sides;

    /**
     * simple constructor.
     * @param side sides of this polygon.
     */
    public Polygon(double... side) {
        sides = new ArrayList<>();
        for(Double tempSide : side)
            sides.add(tempSide);
    }

    /**
     * calculate the perimeter of this polygon
     * @return perimeter of this polygon
     */
    public double calculatePerimeter()
    {
        double sum = 0;
        for(Double side : sides)
            sum += side;
        return sum;
    }


    /**
     * prints the kind , perimeter and area of this polygon
     */
    public void draw()
    {
        System.out.println("unknown polygon");
    }



    /**
     * prints kind  and sizes of this polygon.
     * @return make a string that contains kind  and sizes of this polygon
     */
    @Override
    public String toString() {
        return "unknown polygon";
    }

    /**
     * get the sides of this polygon
     * @return sides of this polygon
     */
    public ArrayList<Double> getSides() {
        return sides;
    }

    /**
     * compare this object with this shape depends on sides .
     * @param o object to be checked
     * @return true if are equal else false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Polygon)) return false;
        if (!super.equals(o)) return false;
        Polygon polygon = (Polygon) o;
        return getSides().equals(polygon.getSides());
    }


    /**
     * make a hash code
     * @return hash code
     */

    @Override
    public int hashCode() {
        return Objects.hash(getSides());
    }
}
