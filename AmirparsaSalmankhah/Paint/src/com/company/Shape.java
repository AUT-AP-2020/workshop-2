package com.company;

/**
 * Represents a shape.
 * @author Amirparsa Salmankhah
 * @version 1.0.0
 */
abstract public class Shape {
    /**
     * Calculates area of the shape.
     * @return Area of the shape
     */
    abstract public double calculateArea();

    /**
     * Calculates perimeter of the shape.
     * @return Perimeter of the shape
     */
    abstract public double calculatePerimeter();

    /**
     * Draws the shape
     */
    public void draw(){
        System.out.println("Area: " + calculateArea() + "    Perimeter: " + calculatePerimeter());
    }

    /**
     * Checks equality between the shape and another object
     * @param o Another object
     * @return true if they are equal and false if not
     */
    abstract public boolean equals(Object o);

    /**
     * returns an string containing shape details.
     * @return shape details
     */
    @Override
    public String toString() {
        if(this instanceof Triangle)
            return "Triangle";
        else if(this instanceof Rectangle)
            return "Rectangle";
        return "Circle:    Radius:" + ((Circle)this).getRadius();
    }
}
