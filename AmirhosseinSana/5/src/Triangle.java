/**
 * The type Triangle.
 */
public class Triangle extends Polygon {
    /**
     * Instantiates a new Triangle.
     *
     * @param a the a
     */
    public Triangle(double... a) {
        super(a);
    }

    /**
     * Is equilateral boolean.
     *
     * @return the boolean
     */
    public boolean isEquilateral() {
        return sides.get(0).equals(sides.get(1)) && sides.get(1).equals(sides.get(2));
    }

    @Override
    public double calculatePerimeter() {
        return sides.get(0) + sides.get(1) + sides.get(2);
    }

    @Override
    public double calculateArea() {
        double x = sides.get(0), y = sides.get(1), z =sides.get(2);
        double p = (x + y + z) / 2;
        return Math.sqrt(p * (p - x) * (p - y) * (p - z));
    }

    public void draw() {
        System.out.format("Triangle, perimeter: %f, area: %f\n",
                calculatePerimeter(), calculateArea());
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Triangle, side1: " + sides.get(0) +
                ", side2: " + sides.get(1) + ", side3: " + sides.get(2);
    }
}
