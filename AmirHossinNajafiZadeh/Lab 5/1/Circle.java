package com.myPack;

import java.util.Objects;

/**
 * The circle class is build for keeping the
 * information about a circle.
 * It gets the radius of the circle and will
 * calculate the area and the perimeter.
 *
 */
public class Circle {
    //The const PI number
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
     * A getter method for getting the circles radius.
     *
     * @return the radius
     */
    public int getRadius() {
        return radius;
    }

    /**
     * This method uses 2 * PI * R to calculate the perimeter.
     *
     * @return the perimeter
     */
    public double calculatePerimeter(){
        return 2 * PI * (double) getRadius();
    }

    /**
     * This method will use PI * R * R to calculate the area.
     *
     * @return the area
     */
    public double calculateArea(){
        return PI * (double) getRadius() * (double) getRadius();
    }

    /**
     * This method will print the information about a circle.
     *
     */
    public void draw(){
        System.out.println("The Shape Is A Circle With Area Of " + calculateArea() + " And The Perimeter " + calculatePerimeter());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
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
