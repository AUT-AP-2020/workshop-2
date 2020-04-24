// In The Name Of GOD

package lab5New;

import java.util.ArrayList;
import java.util.Objects;

/**
 * it's the polygon class that is a subClass of shape
 * it helps to better manage rectangle and triangle also helps to improve the quality of our code
 */
public class Polygon extends Shape {
    protected ArrayList<Double> sides;

    /**
     * its the constructor for our class
     *
     * @param s is the sides of our polygon
     */
    public Polygon(double... s) {
        sides = new ArrayList<>();
        for (int i = 0; i < s.length; i++)
            sides.add(s[i]);
    }

    public ArrayList<Double> getSides() {
        return sides;
    }

    /**
     * @return the perimeter of our polygon
     */
    @Override
    public double calculatePerimeter() {
        double ret = 0;
        for (Double it : sides)
            ret += it;
        return ret;
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
        Polygon tmp = (Polygon) obj;
        for (int i = 0; i < sides.size(); i++)
            if (!sides.get(i).equals(tmp.sides.get(i)))
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
}
