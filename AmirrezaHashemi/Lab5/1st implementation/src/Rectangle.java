import java.util.ArrayList;
import java.util.Objects;

public class Rectangle {
    ArrayList<Double> sides;

    public Rectangle(double side1, double side2, double side3, double side4) {
        sides = new ArrayList<>();
        sides.add(side1);
        sides.add(side2);
        sides.add(side3);
        sides.add(side4);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return (calculateArea()==rectangle.calculateArea() && calculatePerimeter()==rectangle.calculatePerimeter());
    }

    @Override
    public int hashCode() {
        return Objects.hash(sides);
    }

    public boolean isSquare‬‬()
    {
        return (sides.get(0).equals(sides.get(1)) && sides.get(1).equals(sides.get(2))
                && sides.get(2).equals(sides.get(3)));
    }
    public double calculatePerimeter()
    {
        return (sides.get(0) + sides.get(1) + sides.get(2)+sides.get(3));

    }
    public double calculateArea()
    {
        if (!(sides.get(0).equals(sides.get(1))))
            return sides.get(0)*sides.get(1);
        else
            return sides.get(0)*sides.get(2);

    }
    public ArrayList<Double> getSides() {
        return sides;
    }

    @Override
    public String toString() {
        return "Rectangle : " +
                "sides=" + sides;
    }
    public void draw()
    {
        System.out.println("Rectangle : perimeter : "+calculatePerimeter()+" area : "+calculateArea());
    }
}
