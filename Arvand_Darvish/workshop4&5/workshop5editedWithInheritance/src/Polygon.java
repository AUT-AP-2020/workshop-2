import java.util.ArrayList;

abstract public class Polygon extends Shape {
    protected ArrayList<Double> sides;

    Polygon(double... varargs) {
        sides = new ArrayList<>();
        for (double vararg : varargs) {
            sides.add(vararg);
        }
    }

    public ArrayList<Double> getSides() {
        return sides;
    }
}
