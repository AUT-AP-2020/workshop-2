import java.util.ArrayList;

public abstract class Polygon extends Shape {

    private ArrayList<Integer> sides = new ArrayList<>();

    public Polygon(Integer... args) {
        for (Integer i : args) {
            sides.add(i);
        }
    }

    public ArrayList<Integer> getSides() {
        return sides;
    }

    @Override
    public double calculatePerimeter(Shape shape) {
        Polygon polygon = (Polygon) shape;
        int sum = 0;
        for (Integer side : polygon.getSides()) {
            sum += side;
        }
        return sum;
    }
}
