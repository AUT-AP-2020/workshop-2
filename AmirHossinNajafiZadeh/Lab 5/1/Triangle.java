package com.myPack;

import java.util.ArrayList;
import java.util.Objects;

/**
 * This class keeps the information
 * about a triangle.
 * It will get the sides and will
 * calculate the area and the perimeter.
 *
 */
public class Triangle {
    //The list of sides
    private ArrayList<Double> sides;

    /**
     * The constructor of the triangle class.
     *
     * @param v the sides
     */
    public Triangle(double ... v){
        sides = new ArrayList<>();
        //Add to list
        for(int index = 0; index < v.length; index++)
            sides.add(v[index]);
    }

    /**
     * A getter method for getting the 3 sides.
     *
     * @return the list of sides
     */
    public ArrayList<Double> getSides() {
        return sides;
    }

    /**
     * This method will check if all of the three
     * sides are equal.
     *
     * @return true or false
     */
    public boolean isEquilateral(){
        return sides.get(0).equals(sides.get(1)) && sides.get(1).equals(sides.get(2));
    }

    /**
     * This method will calculate the perimeter
     * by adding all 3 sides.
     *
     * @return the perimeter
     */
    public double calculatePerimeter(){
        return sides.get(0) + sides.get(1) + sides.get(2);
    }

    /**
     * This method will calculate the area by
     * using the Heron Equality.
     *
     * @return the area
     */
    public double calculateArea(){
        //The half of the perimeter
        double p = calculatePerimeter() / 2;
        double area = p * (p - sides.get(0)) * (p - sides.get(1)) * (p - sides.get(2));
        return Math.sqrt(area);
    }

    /**
     * This method will show the information about
     * a triangle and will show the area and the perimeter.
     *
     */
    public void draw(){
        System.out.print("This Shape Is A Triangle With The Area Of " + calculateArea() + " And The Perimeter Of " + calculatePerimeter());
        if(isEquilateral())
            System.out.print(". This Shape Is A Equilateral Triangle.\n" );
        else
            System.out.print(".\n");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return sides.equals(triangle.sides);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sides);
    }

    @Override
    public String toString() {
        return "Triangle { " +
                " side 1 = " + sides.get(0) + ", side 2 = " + sides.get(1) + ", side 3 = " + sides.get(2) +
                " }";
    }
}
