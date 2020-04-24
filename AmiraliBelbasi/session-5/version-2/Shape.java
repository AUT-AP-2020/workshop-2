/**
 * Shape
 */
public abstract class Shape {

    public abstract double calculatePerimeter();

    public abstract double calculateArea();

    public abstract void draw();

    public abstract boolean equals(Shape shapeToBeCompared);

    public abstract String toString();
}