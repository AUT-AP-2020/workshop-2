import java.util.ArrayList;

/**
 * Triangle
 */
public class Triangle {

    private ArrayList<Double> sides = new ArrayList<>();

    public Triangle(double a, double b, double c) {
        sides.add(a);
        sides.add(b);
        sides.add(c);
    }

    /**
     * @return the sides
     */
    public ArrayList<Double> getSides() {
        return sides;
    }

    public boolean isEquilateral() {
        if (sides.get(0) == sides.get(1) && sides.get(0) == sides.get(2)) {
            return true;
        }
        return false;
    }

    public double calculatePerimeter() {
        return (sides.get(0) + sides.get(1) + sides.get(2));
    }

    public double calculateArea() {
        return (((double)1 / 4)
                * Math.sqrt((sides.get(0) + sides.get(1) + sides.get(2)) * (sides.get(1) + sides.get(2) - sides.get(0))
                        * (sides.get(0) - sides.get(1) + sides.get(2)) * (sides.get(0) + sides.get(1) - sides.get(2))));
    }

    public void draw() {
        System.out.println("a triangle with perimeter of " + calculatePerimeter() + " and area of " + calculateArea());
    }

    @Override
    public boolean equals(Triangle triangleToBeCompared) {
        if (sides.contains(triangleToBeCompared.sides.get(0)) && sides.contains(triangleToBeCompared.sides.get(1))
                && sides.contains(triangleToBeCompared.sides.get(2))) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return ("a triangle with sides of " + sides.get(0) + " & " + sides.get(1) + " & " + sides.get(2));
    }
}