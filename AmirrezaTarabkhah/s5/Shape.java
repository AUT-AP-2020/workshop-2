import java.util.*;

public abstract class Shape {

    protected final static double pi = 3.1415926535;

    public Shape() {}

    public abstract double calculateArea(int... nums);

    public abstract double calculatePerimeter(int... nums);

    public abstract void draw();

    public abstract boolean equals(Shape shape);

    public abstract String toString();

    public abstract ArrayList<Integer> getSides();
}
