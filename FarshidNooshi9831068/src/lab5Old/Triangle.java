//In The Name Of GOD

package lab5Old;

import java.util.ArrayList;
import java.util.Objects;

public class Triangle {
    private ArrayList<Double> sides;

    /**
     * its a constructor for our class
     *
     * @param s1 is a side of our Triangle
     * @param s2 is a side of our Triangle
     * @param s3 is a side of our Triangle
     */
    public Triangle(double s1, double s2, double s3) {
        sides = new ArrayList<>();
        sides.add(s1);
        sides.add(s2);
        sides.add(s3);
    }

    public ArrayList<Double> getSides() {
        return sides;
    }

    /**
     * @return true if the triangle is equilateral
     */
    public boolean isEquilateral() {
        return sides.get(0) == sides.get(1) && sides.get(1) == sides.get(2);
    }

    /**
     * @return the arena of the shape with the heron formula
     */
    public double calculateArena() {
        double p = calculatePerimeter() / 2;
        return Math.sqrt(p * (p - sides.get(0)) * (p - sides.get(1)) * (p - sides.get(2)));
    }

    /**
     * @return the perimeter of the shape
     */
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
        System.out.print("Triangle with " + calculateArena() + " arena and " + calculatePerimeter() + " perimeter");
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
        Rectangle tmp = (Rectangle) obj;
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
        return "Triangle and sides equal to " + sides.get(0) + " " + sides.get(1) + " " + sides.get(2);
    }
}
