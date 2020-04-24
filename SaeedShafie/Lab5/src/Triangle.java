public class Triangle extends Polygon {

    public Triangle(Integer... sides) {
        super(sides);
    }
    public boolean isEquilateral() {
        if (sides.get(0) == sides.get(1) && sides.get(1) == sides.get(2)) {
            return true;
        }
        return false;
    }
    public double calculateArea() {
        double p = calculatePerimeter() / 2;
        double area = p;
        for (Integer side : sides) {
            area *= (p - side);
        }
        return Math.sqrt(area);
    }
    public String toString() {
        return "Triangle:: " + super.toString();
    }
}