/**
 * <h1>Shape class</h1>
 * abstrac class have have 4 methods<br>
 * calculatePerimeter method to calculate perimeter and returen double
 * calculateArea method to calculatea area and returen double
 * equals method to check equal shape or not
 * toString method to describe shape
 */
public abstract class Shape {

    public abstract double calculatePerimeter(Shape shape);

    public abstract double calculateArea(Shape shape);

    public abstract boolean equals(Object o);

    public abstract String toString();
}
