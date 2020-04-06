import java.util.ArrayList;
import java.util.Objects;

public abstract class Polygon extends Shape {
    ArrayList<Integer> sides;

    public Polygon(int... side) {
        sides = new ArrayList<>();
        for (int i = 0; i < side.length; i++) {
            sides.add(side[i]);
        }
    }

    public ArrayList<Integer> getSides() {
        return sides;
    }

    public double calculatePerimeter() {
        int perimeter = 0;
        for (int side : sides)
            perimeter += side;
        return perimeter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Polygon polygon = (Polygon) o;
        return Objects.equals(sides, polygon.sides);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sides);
    }
}
