/**
 * Triangle class inherits from Polygon
 */
public class Triangle extends Polygon
{
    /**
     * crate rectangle
     * @param sides
     */
    public Triangle(Integer... sides) {
        super(sides);
    }

    /**
     * triangle is Equilateral
     * @return 1 is 0 not
     */
    public int isEquilateral() {
        if (sides.get(0) == sides.get(1) && sides.get(1) == sides.get(2)) {
            return 1;
        }
        return 0;
    }

    /**
     * calculate area of rectangle: (p*(p-a)*(p-b)*(p-c))**0.5
     * @return area
     */
    @Override
    public double calculateArea() {
        double p = calculatePerimeter() / 2;
        double area = p;
        for (Integer side : sides) {
            area *= (p - side);
        }
        return Math.sqrt(area);
    }

    /**
     * triangle to string
     * @return triangle to string
     */
    @Override
    public String toString() {
        return "Triangle; " + super.toString();
    }
}