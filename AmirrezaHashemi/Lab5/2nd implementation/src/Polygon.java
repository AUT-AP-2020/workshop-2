import java.util.ArrayList;
import java.util.Arrays;

public abstract class Polygon extends Shape {

    protected ArrayList<Double> sides;
    public Polygon(Double... sidesArg)
    {
        sides = new ArrayList<>();
        sides.addAll(Arrays.asList(sidesArg));
    }

    public ArrayList<Double> getSides() {
        return sides;
    }

    @Override
    public double calculatePerimeter() {
        double p = 0;
        for (Double side:sides)
          p += side;
        return p ;
    }

    @Override
    public abstract double calculateArea() ;

    @Override
    public String toString() {
        return getClass().getName()+" : " +
                "sides=" + sides;
    }
}
