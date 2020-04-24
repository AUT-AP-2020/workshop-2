public class Rectangle extends Polygon {

    public Rectangle(Integer... sides) {
        super(sides);
    }
    public double calculateArea() {
        return sides.get(0) * sides.get(1);
    }
    public boolean isSquare() {
        if (sides.get(0) == sides.get(1) && sides.get(1) == sides.get(2) && sides.get(2) == sides.get(3)) {
            return true;
        }
        return false;
    }
    public String toString() {
        return "Rectangle:: " + super.toString();
    }
}