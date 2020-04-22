package paint;

public class Rectangle extends Polygon {
    public Rectangle(Integer... args) {
        super(args);
    }

    @Override
    public double calculateArea() {
        return sides.get(0)*sides.get(1);
    }
}
