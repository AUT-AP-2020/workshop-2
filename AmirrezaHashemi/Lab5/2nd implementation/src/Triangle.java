/**
 * The Triangle class implement a triangle.
 *
 * @author Amirreza Hashemi
 * @version 2.0
 * @since 4/19/2020
 */
public class Triangle extends Polygon {

    /**
     * Instantiates a new Triangle.
     *
     * @param sidesArg the sides
     */
    public Triangle(Double... sidesArg) {
        super(sidesArg);
    }

    @Override
    public double calculateArea() {
        double p = calculatePerimeter() / 2;
        return (Math.sqrt(Math.abs(p * (p - sides.get(0)) * (p - sides.get(1)) * (p - sides.get(2)))));
    }

    /**
     * Checks if the triangle is equilateral‬‬.
     *
     * @return the boolean true if it's equilateral‬‬ and false otherwise
     */
    public boolean isEquilateral‬‬() {
        return (sides.get(0).equals(sides.get(1)) && sides.get(1).equals(sides.get(2)));
    }
}
