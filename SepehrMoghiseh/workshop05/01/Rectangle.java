import java.util.ArrayList;
import java.util.Objects;

public class Rectangle {
    ArrayList<Integer> sides;

    public Rectangle(int side1, int side2, int side3, int side4) {
        sides = new ArrayList<>();
        sides.add(side1);
        sides.add(side2);
        sides.add(side3);
        sides.add(side4);
    }

    public ArrayList<Integer> getSides() {
        return sides;
    }

    public void isSquare() {
        if (sides.get(0) == sides.get(1) && sides.get(0) == sides.get(2) && sides.get(0) == sides.get(3) && sides.get(1) == sides.get(2) && sides.get(1) == sides.get(3) && sides.get(2) == sides.get(3))
            System.out.println("it's square");
        else
            System.out.println("it's not square");
    }

    public double calculatePerimeter() {
        return sides.get(0) + sides.get(1) + sides.get(2) + sides.get(3);
    }

    public double calculateArea() {
        return sides.get(0) * sides.get(1);
    }

    public void draw() {
        System.out.println("rectangle : " + "area =  " + calculateArea() + " , " + "primeter = " + calculatePerimeter());
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

    @Override
    public String toString() {
        return "Rectangle{" +
                "sides=" + sides.get(0) + " , " + sides.get(1) + " , " + sides.get(2) + " , " + sides.get(3) +
                '}';
    }
}
