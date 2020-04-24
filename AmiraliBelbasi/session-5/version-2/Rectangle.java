import java.util.ArrayList;

/**
 * Rectangle
 */
public class Rectangle extends Polygon {
    public Rectangle(double... givenSides) {
        super(givenSides);
    }

    /**
     * @return the sides
     */
    public ArrayList<Double> getSides() {
        return sides;
    }

    public boolean isSquare() {
        if (sides.get(0).compareTo(sides.get(1)) == 0 && sides.get(0).compareTo(sides.get(2)) == 0 && sides.get(0).compareTo(sides.get(3)) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public double calculatePerimeter() {
        return (sides.get(0) + sides.get(1) + sides.get(2) + sides.get(3));
    }

    @Override
    public double calculateArea() {
        if (sides.get(0) == sides.get(1)) {
            return (sides.get(0) * sides.get(2));
        } else {
            return (sides.get(0) * sides.get(1));
        }
    }

    @Override
    public void draw() {
        System.out.println("a rectangle with perimeter of " + calculatePerimeter() + " and area of " + calculateArea());
    }

    @Override
    public boolean equals(Shape shapeToBeCompared) {
        if (sides.contains(rectangleToBeCompared.sides.get(0)) && sides.contains(rectangleToBeCompared.sides.get(1))
                && sides.contains(rectangleToBeCompared.sides.get(2))
                && sides.contains(rectangleToBeCompared.sides.get(3))) {
            return true;
        }
        return false;
    }
}
