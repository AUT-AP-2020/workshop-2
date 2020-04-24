// In The Name Of GOD

package lab5New;

import java.util.Objects;

/**
 * the rectangle class that represents a rectangle in our lab
 */
public class Rectangle extends Polygon {
    /**
     * is a constructor for our class
     * @param s is the sides of the rectangle
     */
    public Rectangle(double... s) {
        super(s);
    }


    /**
     * @return true if the rectangle is square
     */
    public boolean isSquare() {
        return sides.get(0).equals(sides.get(1)) && sides.get(1).equals(sides.get(2)) && sides.get(1).equals(sides.get(3));
    }

    /**
     * @return the arena of the shape
     */
    @Override
    public double calculateArea() {
        for (Double it : sides)
            if (!it.equals(sides.get(0)))
                return it * sides.get(0);
        return sides.get(0) * sides.get(0);
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
        System.out.print("Rectangle ");
        super.draw();
        if (isSquare())
            System.out.println(" its Square.");
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
        return "Rectangle and sides equal to " + "side 1 = " + sides.get(0) + " side 2 = " + sides.get(1) + " side 3 = " + sides.get(2) + " side 4 = " + sides.get(3);
    }
}
