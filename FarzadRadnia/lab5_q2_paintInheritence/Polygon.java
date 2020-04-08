import java.util.ArrayList;
import java.util.Objects;

/**
 * Polygon shapes.
 */
public abstract class Polygon  extends  Shape{

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
     * prints the kind , perimeter and area of this polygon
     */
    public  void draw(){
        boolean isEquilateral = false;
        boolean isSquare = false;

        if(this instanceof Rectangle)
            isSquare = ((Rectangle) this).isSquare();
        if(this instanceof Triangle)
            isEquilateral = ((Triangle) this).isEquilateral();

        System.out.println(this.getClass().getName()  + (isEquilateral ?" (Equilateral) :":isSquare?" (Square) :":" :") +
                "  Area: " + calculateArea() + "  perimeter: " + calculatePerimeter());
    }

    /**
     * prints kind  and sizes of this shape.
     * @return make a string that contains kind  and sizes of this shape
     */
    @Override
    public  String toString(){
        boolean isEquilateral = false;
        boolean isSquare = false;

        if(this instanceof Rectangle)
            isSquare = ((Rectangle) this).isSquare();
        if(this instanceof Triangle)
            isEquilateral = ((Triangle) this).isEquilateral();

        StringBuilder sSides = new StringBuilder();
        int counter = 1;
        for(double side : sides) {
            sSides.append("   side").append(counter).append(":").append(side);
            counter ++;
        }


        return (this.getClass().getName()  + (isEquilateral ?" (Equilateral) ...":isSquare?" (Square) ...":" ...") +
                "  sides: " + sSides);
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
