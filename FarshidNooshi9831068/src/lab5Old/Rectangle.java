//In The Name Of GOD

package lab5Old;

import java.util.ArrayList;
import java.util.Objects;

public class Rectangle extends Paint {
    private ArrayList<Double> sides;

    /**
     * is a constructor for our class
     *
     * @param s1 is a side of our shape
     * @param s2 is a side of our shape
     * @param s3 is a side of our shape
     * @param s4 is a side of our shape
     */
    public Rectangle(double s1, double s2, double s3, double s4) {
        sides = new ArrayList<>();
        sides.add(s1);
        sides.add(s2);
        sides.add(s3);
        sides.add(s4);
    }

    public ArrayList<Double> getSides() {
        return sides;
    }

    /**
     * @return true if the rectangle is square
     */
    public boolean isSquare() {
        return sides.get(0) == sides.get(1) && sides.get(1) == sides.get(2) && sides.get(1) == sides.get(3);
    }

    /**
     * @return the arena of the shape
     */
    public double calculateArena() {
        for (Double it : sides)
            if (!it.equals(sides.get(0)))
                return it * sides.get(0);
        return sides.get(0) * sides.get(0);
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
        System.out.print("Rectangle with " + calculateArena() + " arena and " + calculatePerimeter() + " perimeter");
        if (isSquare())
            System.out.println(" its square.");
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
        for (int i = 0; i < 4; i++)
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

    /**
     * @return an string showing the properties of the shape
     */
    @Override
    public String toString() {
        return "Rectangle and sides equal to " + sides.get(0) + " " + sides.get(1) + " " + sides.get(2) + " " + sides.get(3);
    }
}
