import java.util.ArrayList;
import java.util.Objects;

public class Rectangle {
    private ArrayList<Double> sides;

    Rectangle(double side1, double side2, double side3, double side4) {
        sides = new ArrayList<>();
        sides.add(side1);
        sides.add(side2);
        sides.add(side3);
        sides.add(side4);
    }

    public double calculatePerimeter() {
        double sum = 0;
        for (double side : sides) {
            sum += side;
        }
        return sum;
    }

    public double calculateArea() {
        return sides.get(0) * sides.get(1);
    }

    public void draw() {
        System.out.println(toString());
        System.out.println("Perimeter = " + calculatePerimeter());
        System.out.println("Area = " + calculateArea());
        System.out.println();
    }

    @Override
    public String toString() {
        return "Rectangle{" + "sides=" + getSides() + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Objects.equals(sides, rectangle.sides);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sides);
    }

    public ArrayList<Double> getSides() {
        return sides;
    }

    public boolean isSquare() {
        return sides.get(0).equals(sides.get(1)) && sides.get(2).equals(sides.get(3)) && sides.get(0).equals(sides.get(2));
    }
}
