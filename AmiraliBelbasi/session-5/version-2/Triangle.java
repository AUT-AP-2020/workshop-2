import java.util.ArrayList;

/**
 * Triangle
 */
public class Triangle extends Polygon {
    public Triangle(double... givenSides) {
        super(givenSides);
    }

    /**
     * @return the sides
     */
    public ArrayList<Double> getSides() {
        return sides;
    }

    public boolean isEquilateral() {
        if (sides.get(0).compareTo(sides.get(1)) == 0 && sides.get(0).compareTo(sides.get(2)) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public double calculatePerimeter() {
        return (sides.get(0) + sides.get(1) + sides.get(2));
    }

    @Override
    public double calculateArea() {
        return (((double) 1 / 4)
                * Math.sqrt((sides.get(0) + sides.get(1) + sides.get(2)) * (sides.get(1) + sides.get(2) - sides.get(0))
                        * (sides.get(0) - sides.get(1) + sides.get(2)) * (sides.get(0) + sides.get(1) - sides.get(2))));
    }

    @Override
    public void draw() {
        System.out.println("a triangle with perimeter of " + calculatePerimeter() + " and area of " + calculateArea());
    }

    @Override
    public boolean equals(Shape shapeToBeCompared) {
        if (sides.contains(triangleToBeCompared.sides.get(0)) && sides.contains(triangleToBeCompared.sides.get(1))
                && sides.contains(triangleToBeCompared.sides.get(2))) {
            return true;
        }
        return false;
    }
}