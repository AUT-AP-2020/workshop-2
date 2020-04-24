/**
 * The type Rectangle.
 */
public class Rectangle extends Polygon {
    /**
     * Instantiates a new Rectangle.
     *
     * @param a the a
     */
    public Rectangle(double... a) {
        super(a);
    }

    /**
     * Is square boolean.
     *
     * @return the boolean
     */
    public boolean isSquare() {
        return sides.get(0).equals(sides.get(1));
    }

    @Override
    public double calculateArea() {
        return sides.get(0) * sides.get(1);
    }

    public double calculatePerimeter() {
        return 2 * (sides.get(0) + sides.get(1));
    }

    public void draw() {
        System.out.format("Rectangle, perimeter: %f, area: %f\n",
                calculatePerimeter(), calculateArea());
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Rectangle, side1: " + sides.get(0) +
                ", side2: " + sides.get(1) +
                ", side3: " + sides.get(2) + ", side4: " + sides.get(3);
    }
}
