import java.util.ArrayList;

/**
 * Rectangle
 */
public class Rectangle {

    private ArrayList<Double> sides = new ArrayList<>();

    public Rectangle(double a, double b, double c, double d) {
        sides.add(a);
        sides.add(b);
        sides.add(c);
        sides.add(d);
    }

    /**
     * @return the sides
     */
    public ArrayList<Double> getSides() {
        return sides;
    }

    public boolean isSquare() {
        if (sides.get(0) == sides.get(1) && sides.get(0) == sides.get(2) && sides.get(0) == sides.get(3)) {
            return true;
        }
        return false;
    }

    public double calculatePerimeter() {
        return (sides.get(0) + sides.get(1) + sides.get(2) + sides.get(3));
    }

    public double calculateArea() {
        if (sides.get(0) == sides.get(1)) {
            return (sides.get(0) * sides.get(2));
        } else {
            return (sides.get(0) * sides.get(1));
        }
    }

    public void draw() {
        System.out.println("a rectangle with perimeter of " + calculatePerimeter() + " and area of " + calculateArea());
    }

    @Override
    public boolean equals(Rectangle rectangleToBeCompared) {
        if (sides.contains(rectangleToBeCompared.sides.get(0)) && sides.contains(rectangleToBeCompared.sides.get(1))
                && sides.contains(rectangleToBeCompared.sides.get(2))
                && sides.contains(rectangleToBeCompared.sides.get(3))) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return ("a rectangle with sides of " + sides.get(0) + " & " + sides.get(1) + " & " + sides.get(2) + " & "
                + sides.get(3));
    }
}