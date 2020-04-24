import java.util.Objects;

public class Rectangle extends Polygon {

    Rectangle(double side1, double side2, double side3, double side4) {
        super(side1, side2, side3, side4);
    }

    public double calculatePerimeter() {
        double sum = 0;
        for (double side : getSides()) {
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
        StringBuilder str = new StringBuilder("Rectangle : ");
        int count = 1;
        for (double a: getSides()) {
            str.append("side").append(count++).append(" : ").append(a).append("  ");
        }
        return str.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Objects.equals(sides, rectangle.sides);
    }


    public boolean isSquare() {
        return sides.get(0).equals(sides.get(1)) && sides.get(2).equals(sides.get(3)) && sides.get(0).equals(sides.get(2));
    }
}
