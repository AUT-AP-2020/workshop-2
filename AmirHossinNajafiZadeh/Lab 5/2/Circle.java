package com.myPack;

import java.util.Objects;

/**
 * A circle is a subclass of the shape.
 * It has different ways of calculating area
 * and perimeter so we needed to override them.
 *
 */
public class Circle extends Shape {
    //The PI number
    private final double PI = 3.14d;
    //The radius of the circle
    private int radius;

    /**
     * The constructor of the circle class.
     *
     * @param radius the radius of the circle
     */
    public Circle(int radius){
        this.radius = radius;
    }

    /**
     * A getter method for getting the radius.
     *
     * @return the radius
     */
    public int getRadius() {
        return radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * (double) getRadius();
    }

    @Override
    public double calculateArea() {
        return PI * (double) getRadius() * (double) getRadius();
    }

    @Override
    public void draw() {
        System.out.printf("This Shape Is A Circle With The Area Of %.2f And Perimeter Of %.2f", calculateArea(), calculatePerimeter());
        System.out.print("\n");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    @Override
    public String toString() {
        return "Circle { " +
                " Radius = " + radius +
                " }";
    }
}
