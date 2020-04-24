package com.company;

/**
 * Represents a triangle.
 * @author Amirparsa Salmankhah
 * @version 1.0.0
 */
public class Triangle extends Polygon{

    /**
     * Constructor with 3 parameters.
     * @param side1 first side
     * @param side2 second side
     * @param side3 third side
     */
    public Triangle(double side1, double side2, double side3) {
        super(side1,side2,side3);
    }

    /**
     * Checks if the triangle is equilateral.
     * @return true if it is and false if not.
     */
    public boolean isEquilateral() {
        return getSides().get(0).equals(getSides().get(1)) && getSides().get(0).equals(getSides().get(2)) && getSides().get(1).equals(getSides().get(2));
    }

    /**
     * Calculates area of the shape
     * @return Area of the shape
     */
    @Override
    public double calculateArea(){
        double p = calculatePerimeter() / 2;
        return Math.sqrt(p * (p - getSides().get(0)) * (p - getSides().get(1)) * (p - getSides().get(2)));
    }

    /**
     * Calculates perimeter of the shape.
     * @return Perimeter of the shape
     */
    @Override
    public double calculatePerimeter() {
        return getSides().get(0) + getSides().get(1) + getSides().get(2);
    }

    /**
     * Draws the triangle.
     */
    @Override
    public void draw() {
        System.out.println("Triangle    ");
        super.draw();
    }

    /**
     * Checks the equality between the triangle and another object.
     * @param o Another object
     * @return true if they are equal and false if not.
     */
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return triangle.getSides().get(0).equals(getSides().get(0)) && triangle.getSides().get(1).equals(getSides().get(1)) && triangle.getSides().get(2).equals(getSides().get(2));
    }
}