import java.util.ArrayList;
import java.util.Objects;

public class Triangle {
    ArrayList<Integer> sides;

    public Triangle(int side1, int side2, int side3) {
        sides = new ArrayList<>();
        sides.add(side1);
        sides.add(side2);
        sides.add(side3);
    }

    public ArrayList<Integer> getSides() {
        return sides;
    }

    public void isEquilateral() {
        if (sides.get(0) == sides.get(1) && sides.get(0) == sides.get(2) && sides.get(1) == sides.get(2))
            System.out.println("it's equilateral");
        else
            System.out.println("it's not equilateral");
    }

    public double calculatePerimeter() {
        return sides.get(0) + sides.get(1) + sides.get(2);
    }

    public double calculateArea() {
        double s = sides.get(0) + sides.get(1) + sides.get(2);
        s = s / 2;
        double area = Math.sqrt(s * (s - sides.get(0)) * (s - sides.get(1)) * (s - sides.get(2)));
        return area;
    }

    public void draw() {
        System.out.println("triangle : " + "area = " + calculateArea() + " , " + "primeter = " + calculatePerimeter());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Objects.equals(sides, triangle.sides);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sides);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sides=" + sides.get(0) + " , " + sides.get(1) + " , " + sides.get(2) +
                '}';
    }
}
