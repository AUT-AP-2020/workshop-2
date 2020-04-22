import java.util.ArrayList;
import java.util.Objects;

/**
 * This is a class for triangle
 */
public class Triangle {
    private ArrayList<Integer> sides = new ArrayList<>();

    public Triangle(int a, int b, int c) {
        sides.add(a);
        sides.add(b);
        sides.add(c);
    }

    /**
     * This is a method to calculate Perimeter
     *
     * @return
     */
    public double calculatePerimeter() {
        double sum = 0;
        for (Integer side : sides) {
            sum += side;
        }
        return sum;
    }

    /**
     * This is a method to calculate Area
     *
     * @return
     */
    public double calculateArea() {
        double p = calculatePerimeter() / 2;
        double area = p;
        for (Integer side : sides) {
            area *= (p - side);
        }
        return Math.sqrt(area);
    }

    /**
     * This is a method to draw a shape
     *
     * @return
     */
    public void draw() {
        System.out.println(this.getClass().getName());
        System.out.println("Perimeter = " + calculatePerimeter());
        System.out.println("Area = " + calculateArea());
    }


    public ArrayList<Integer> getSides() {
        return sides;
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
    public String toString() {
        return "Triangle{" +
                "sides=" + sides +
                '}';
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
}
