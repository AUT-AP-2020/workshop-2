package com.company;

/**
 * Represents a circle.
 * @author Amirparsa Salmnakhah
 * @version 1.0.0
 */
public class Circle extends Shape{
    //radius
    private double radius;

    /**
     * Constructor with a paramter.
     * @param radius Radius of the circle
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Gets radius of the circle
     * @return Radius of the circle
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Calculates area of the shape
     * @return Area of the shape
     */
    @Override
    public double calculateArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    /**
     * Calculates perimeter of the shape.
     * @return Perimeter of the shape
     */
    @Override
    public double calculatePerimeter() {
        return 2 * radius * Math.PI;
    }

    /**
     * Draws the circle
     */
    @Override
    public void draw() {
        System.out.println("Circle    ");
        super.draw();
    }

    /**
     * Checks the equality between the circle and another object.
     * @param o Another object
     * @return true if they are equal and false if not.
     */
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle)  o;
        return radius == circle.radius;
    }
}
