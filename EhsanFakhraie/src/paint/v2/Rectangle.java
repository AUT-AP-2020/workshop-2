package paint.v2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Rectangle extends Polygon {

    public Rectangle(double a, double b) {
        super(a, b);
    }

    public boolean isSquare(Object o) {
        return getSides().get(0).equals(getSides().get(1));
    }

    @Override
    public double calculateArea(Shape shape) {
        return this.getSides().get(0) * this.getSides().get(1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return ((Rectangle) o).getSides().equals(this.getSides());
    }

    @Override
    public String toString() {
        return "Rectangle{"+ Arrays.toString(getSides().toArray()) +"}";
    }
}