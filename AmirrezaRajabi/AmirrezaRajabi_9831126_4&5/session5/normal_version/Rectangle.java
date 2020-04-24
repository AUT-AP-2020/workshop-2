/**
 * Rectangle class represent rectangle
 */
import java.util.ArrayList;
import java.util.Objects;
public class Rectangle
{
    private ArrayList<Integer> sides = new ArrayList<>();

    public Rectangle(int a, int b, int c, int d) {
        sides.add(a);
        sides.add(b);
        sides.add(c);
        sides.add(d);
    }
    /**
     * get sides of rectangle
     * @return sides
     */
    public ArrayList<Integer> getSides() {
        return sides;
    }

    /**
     * rectangle is square
     * @return 1 is 0 not
     */
    public int isSquare() {
        if (sides.get(0) == sides.get(1) && sides.get(1) == sides.get(2) && sides.get(2) == sides.get(3)) {
            return 1;
        }
        return 0;
    }

    /**
     * calculate perimeter of rectangle: sum of side
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
     * calculate area of rectangle: h * l
     * @return area
     */
    public double calculateArea()
    {
        double area = 1;
        if (sides.get(0) == sides.get(1))
        {
            area = sides.get(0) * sides.get(2);
        }
        if (sides.get(0) != sides.get(1))
        {
            area = sides.get(0) * sides.get(1);
        }
        return area;
    }

    /**
     * draw with print type and perimeter and area
     */
    public void draw() {
        System.out.println(this.getClass().getName());
        System.out.println("perimeter: " + calculatePerimeter());
        System.out.println("area: " + calculateArea());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Objects.equals(sides, rectangle.sides);
    }

    /**
     * rectangle to string
     * @return rectangle to string
     */
    @Override
    public String toString()
    {
        if (sides.get(0) == sides.get(1))
        {
            return "rectangle (sides = [" +sides.get(0) + "," + sides.get(2) +"])";
        }
        return "rectangle (sides = [" +sides.get(0) + "," + sides.get(1) +"])";
    }

}
