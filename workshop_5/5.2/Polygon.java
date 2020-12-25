import java.util.ArrayList;
import java.util.Objects;
/**
 * subclass of shapes
 * @author Setayesh
 * @version 0.1
 */
public abstract class Polygon  extends  Shape{

    protected ArrayList<Double> sides;

    /**
     *Polygon constructor.
     * @param side sides of this polygon.
     */
    public Polygon(double... side) {
        sides = new ArrayList<>();
        for(Double s : side)
            sides.add(s);
    }

    /**
     * perimeter and area of this polygon
     */
    public  void draw(){
        boolean isEquilateral = false;
        boolean isSquare = false;

        if(this instanceof Rectangle)
            isSquare = ((Rectangle) this).isSquare();
        if(this instanceof Triangle)
            isEquilateral = ((Triangle) this).isEquilateral();

        System.out.println(this.getClass().getName()  + (isEquilateral ?" Equilateral :":isSquare?"\n Square :":" :") +
                " \n Area:\n " + calculateArea() + "\nperimeter:\n " + calculatePerimeter());
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
        for(double side : getSides()) {
            sSides.append("\nside").append(counter).append(" : ").append(side);
            counter ++;
        }


        return (this.getClass().getName()  + (isEquilateral ?"Equilateral : ":isSquare?"\nSquare":" ") +
                "  sides: \n" + sSides);
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

}