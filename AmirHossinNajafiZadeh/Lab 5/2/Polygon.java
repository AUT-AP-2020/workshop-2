package com.myPack;

import java.util.ArrayList;
import java.util.Objects;

/**
 * This class is the superclass for the
 * rectangle and triangle.
 *
 */
public abstract class Polygon extends Shape {
    //The list of sides
    protected ArrayList<Double> sides;

    /**
     * The constructor of the class.
     *
     * @param v the sides of this shape
     */
    public Polygon(double ...v){
        //Creating the list
        sides = new ArrayList<>();
        for(int index = 0; index < v.length; index++){
            sides.add(v[index]);
        }
    }

    /**
     * A method for getting the sides.
     *
     * @return the list of sides
     */
    public ArrayList<Double> getSides() {
        return sides;
    }

    /**
     * The perimeter in every polygon is the
     * sum of all sides.
     *
     * @return the perimeter
     */
    @Override
    public double calculatePerimeter() {
        double perimeter = 0;
        for(Double i : sides)
            perimeter += i;
        return perimeter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Polygon polygon = (Polygon) o;
        return Objects.equals(sides, polygon.sides);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sides);
    }
}
