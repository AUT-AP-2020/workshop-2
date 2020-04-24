/**
 * This class designed to create circles.
 */

import java.util.Objects;

public class Circle extends Shape{
    //The radius of the circle
    private double radius;
    //The pi number which is constant
    private final double pi = 3.14192;

    public Circle(double r){
        this.radius = r;
    }

    /**
     * This method would return the radius of the circle
     * @return radius field
     */
    public double getRadius() {
        return radius;
    }

    @Override
    public double calculatePerimeter() {
        return this.getRadius() * 2 * pi;
    }

    @Override
    public double calculateArea() {
        return this.getRadius() * this.getRadius() * pi;
    }

    @Override
    public void draw() {
        System.out.println("The shape is: Circle\nWith the perimeter of: " + this.calculatePerimeter() + "\nAnd the area of: " + this.calculateArea() + '\n');
    }

    @Override
    public String toString() {
        System.out.print("Circle:: " + "radius:" + this.getRadius() + '\n');
        return ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return this.getRadius() == circle.getRadius();
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, pi);
    }
}