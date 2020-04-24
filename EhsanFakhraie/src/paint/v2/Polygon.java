package paint.v2;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Polygon extends Shape {
    public ArrayList<Double> getSides() {
        return sides;
    }

    private ArrayList<Double> sides = new ArrayList<>();

    public Polygon(Double... args) {
        sides.addAll(Arrays.asList(args));
    }

    @Override
    public double calculatePerimeter(Shape shape) {
        Polygon p=(Polygon) shape;
        double perimeter=0;
        for(Double d:sides)
            perimeter+=d;
        return perimeter;
    }
}
