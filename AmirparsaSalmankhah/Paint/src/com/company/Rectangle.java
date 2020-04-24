package com.company;

/**
 * Represents a rectangle.
 * @author Amirparsa Salmankhah
 * @version 1.0.0
 */
public class Rectangle extends Polygon {

    /**
     * Constructor with 4 parameters.
     * @param side1 first side
     * @param side2 second side
     * @param side3 third side
     * @param side4 forth side
     */
    public Rectangle(double side1, double side2, double side3, double side4) {
        super(side1, side2, side3, side4);
    }

    /**
     * Checks if the rectangle is an square.
     * @return true if it is and false if not.
     */
    public boolean isSquare() {
        boolean check = true;
        for (int i = 0; i < 4; i++)
            for (int j = i + 1; j < 4; j++)
                if (!getSides().get(i).equals(getSides().get(j))) {
                    check = false;
                    break;
                }
        return check;
    }

    /**
     * Calculates area of the shape
     * @return Area of the shape
     */
    @Override
    public double calculateArea() {
        return getSides().get(0) * getSides().get(2);
    }

    /**
     * Calculates perimeter of the shape.
     * @return Perimeter of the shape
     */
    @Override
    public double calculatePerimeter() {
        return 2 * (getSides().get(0) + getSides().get(2));
    }

    /**
     * Draws the rectangle
     */
    @Override
    public void draw() {
        System.out.println("Rectangle    ");
        super.draw();
    }

    /**
     * Checks equality between the rectangle and another object.
     * @param o Another object
     * @return true if they are equal and false if not.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return rectangle.getSides().get(0).equals(getSides().get(0)) && rectangle.getSides().get(2).equals(getSides().get(2));
    }
}