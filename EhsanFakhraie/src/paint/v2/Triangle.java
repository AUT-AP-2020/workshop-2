package paint.v2;

import java.util.ArrayList;
import java.util.Arrays;

public class Triangle extends Polygon {
    public Triangle(double a, double b, double c) {
        super(a, b, c);
    }

    @Override
    public double calculateArea() {
        Triangle triangle = (Triangle) this;
        double p = this.calculatePerimeter();
        ArrayList<Double> sides = getSides();
        return Math.sqrt(p * (p - sides.get(0)) * (p - sides.get(1)) * (p - sides.get(2)));
    }

    @Override
    public boolean equals(Object o) {
        Triangle t = (Triangle) o;
        return this.getSides() == t.getSides();
    }


    @Override
    public String toString() {
        return "Triangle{" + Arrays.toString(getSides().toArray()) + "}";
    }

    @Override
    public String type() {
        return "Triangle";
    }
}
