import java.util.Objects;

public class Triangle extends Polygon {

    Triangle(double side1, double side2, double side3) {
        super(side1, side2, side3);
    }

    @Override
    public double calculatePerimeter() {
        double sum = 0;
        for (double side : getSides()) {
            sum += side;
        }
        return sum;
    }

    public double calculateArea() {
        double p = (calculatePerimeter()/2);
        return Math.sqrt(p * (p - sides.get(0)) * (p - sides.get(1)) * (p - sides.get(2)));
    }

    public void draw() {
        System.out.println(toString());
        System.out.println("Perimeter = " + calculatePerimeter());
        System.out.println("Area = " + calculateArea());
        System.out.println();
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("Triangle : ");
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
        Triangle triangle = (Triangle) o;
        return Objects.equals(sides, triangle.sides);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sides);
    }

    public boolean isEquilateral() {
        return sides.get(0).equals(sides.get(1)) && sides.get(0).equals(sides.get(2));
    }
}
