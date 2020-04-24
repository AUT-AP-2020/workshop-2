// In The Name Of GOD

package lab5New;

import java.util.ArrayList;
import java.util.Objects;

/**
 * like circle and rectangle this is triangle class that represents a triangle in our class
 */
public class Triangle extends Polygon {
    /**
     * its a constructor for our class
     * @param s is the sides of the triangle
     **/
    public Triangle(double... s) {
        super(s);
    }

    /**
     * @return true if the triangle is equilateral
     */
    public boolean isEquilateral() {
        return sides.get(0).equals(sides.get(1)) && sides.get(1).equals(sides.get(2));
    }

    /**
     * @return the arena of the shape with the heron formula
     */
    @Override
    public double calculateArea() {
        double p = calculatePerimeter() / 2;
        return Math.sqrt(p * (p - sides.get(0)) * (p - sides.get(1)) * (p - sides.get(2)));
    }

    /**
     * @return the perimeter of the shape
     */
    @Override
    public double calculatePerimeter() {
        double ret = 0;
        for (Double it : sides)
            ret += it;
        return ret;
    }

    /**
     * this method draws our shape
     */
    public void draw() {
        System.out.print("Triangle ");
        super.draw();
        if (isEquilateral())
            System.out.println(" its equilateral.");
        else
            System.out.println(".");
    }

    /**
     * @param obj is the object to be checked
     * @return true if the shapes are equal
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj == null || obj.getClass() != getClass())
            return false;
        Triangle tmp = (Triangle) obj;
        for (int i = 0; i < 3; i++)
            if (!sides.get(i).equals(tmp.getSides().get(i)))
                return false;
        return true;
    }

    /**
     * @return the hash value of the shape depending on its properties
     */
    @Override
    public int hashCode() {
        return Objects.hash(sides);
    }

    /**
     * @return an string showing the properties of the shape
     */
    @Override
    public String toString() {
        return "Triangle and sides equal to " + "side 1 = " + sides.get(0) + " side 2 = " + sides.get(1) + " side 3 = " + sides.get(2);
    }

}
