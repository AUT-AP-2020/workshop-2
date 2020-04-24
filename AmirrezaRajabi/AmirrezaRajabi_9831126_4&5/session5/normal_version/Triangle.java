/**
 * Triangle class represent triangle
 */
import java.util.Objects;
import java.util.ArrayList;

public class Triangle
{
    private ArrayList<Integer> sides = new ArrayList<>();

    public Triangle(int a, int b, int c) {
        sides.add(a);
        sides.add(b);
        sides.add(c);
    }

    /**
     * get sides
     * @return sides
     */
    public ArrayList<Integer> getSides() {
        return sides;
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
     * calculate perimeter of triangle: sum of side
     * @return perimeter
     */
    public double calculatePerimeter() {
        double perimeter = 0;
        for (int i = 0;i < sides.size();i++)
        {
            perimeter = perimeter + sides.get(i);
        }
        return perimeter;
    }

    /**
     * calculate area of rectangle: (p*(p-a)*(p-b)*(p-c))**0.5
     * @return area
     */
    public double calculateArea()
    {
        double p = calculatePerimeter() / 2;
        double area = p;
        for (int i = 0;i < sides.size();i++) {
            area *= (p - sides.get(i));
        }
        return Math.sqrt(p);
    }

    /**
     * draw with print type and perimeter and area
     */
    public void draw() {
        System.out.println("triangle");
        System.out.println("perimeter: " + calculatePerimeter());
        System.out.println("area: " + calculateArea());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Objects.equals(sides, triangle.sides);
    }

    /**
     * triangle to string
     * @return triangle to string
     */
    @Override
    public String toString() {
        return "triangle (sides = [" +sides.get(0) + "," +sides.get(1)+","+ sides.get(2) +"])";
    }

}
