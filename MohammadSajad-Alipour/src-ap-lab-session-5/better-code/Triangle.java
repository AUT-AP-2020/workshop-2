/**
 * This is a class for triangle polygons and inherits from Polygon
 */
public class Triangle extends Polygon {

    public Triangle(Integer... sides) {
        super(sides);
    }

    /**
     * This is a method to check if it is equilateral
     *
     * @return
     */
    public boolean isEquilateral() {
        if (sides.get(0) == sides.get(1) && sides.get(1) == sides.get(2)) {
            return true;
        }
        return false;
    }

    @Override
    public double calculateArea() {
        double p = calculatePerimeter() / 2;
        double area = p;
        for (Integer side : sides) {
            area *= (p - side);
        }
        return Math.sqrt(area);
    }

    @Override
    public String toString() {
        return "Triangle:: " + super.toString();
    }
}
