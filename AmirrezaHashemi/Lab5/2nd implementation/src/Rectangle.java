public class Rectangle extends Polygon {

    public Rectangle(Double... sidesArg) {
        super(sidesArg);
    }

    @Override
    public double calculateArea() {
        if (!(sides.get(0).equals(sides.get(1))))
            return sides.get(0)*sides.get(1);
        else
            return sides.get(0)*sides.get(2);

    }
    public boolean isSquare‬‬()
    {
        return (sides.get(0).equals(sides.get(1)) && sides.get(1).equals(sides.get(2))
                && sides.get(2).equals(sides.get(3)));
    }
}
