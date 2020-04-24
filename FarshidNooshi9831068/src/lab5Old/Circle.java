//In The Name Of GOD

package lab5Old;

import java.util.Objects;

public class Circle {
    private static final double PI = 3.14159265;
    private final double radius;

    /**
     * a constructor for our class
     *
     * @param radius is the radius of the circle
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * this method just draws our shape in the console
     */
    public void draw() {
        System.out.println("Circle with " + calculateArena() + " arena and " + calculatePerimeter() + " perimeter.");
    }

    public double getRadius() {
        return radius;
    }

    /**
     * @return the arena of the shape
     */
    public double calculateArena() {
        return PI * radius * radius;
    }

    /**
     * @return the perimeter of the shape
     */
    public double calculatePerimeter() {
        return 2 * PI * radius;
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
        Circle tmp = (Circle) obj;
        return tmp.getRadius() == radius;
    }

    /**
     * @return the hash value of the shape depending on its properties
     */
    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    /**
     * @return an string showing the properties of the shape
     */
    @Override
    public String toString() {
        return "Circle and radius equals to " + radius;
    }
}
