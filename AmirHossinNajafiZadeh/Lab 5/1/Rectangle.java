package com.myPack;

import java.util.ArrayList;
import java.util.Objects;

/**
 * This class keeps the information about a rectangle.
 * It keeps all 4 sides and will calculate the area
 * and the perimeter.
 *
 */
public class Rectangle {
    //The list of sides
    private ArrayList<Double> sides;

    /**
     * The constructor of the rectangle class.
     *
     * @param v the sides
     */
    public Rectangle(double ... v){
        sides = new ArrayList<>();
        //Add to list
        for(int index = 0; index < v.length; index++)
            sides.add(v[index]);
    }

    /**
     * A getter method for getting the 4 sides.
     *
     * @return the list of sides
     */
    public ArrayList<Double> getSides() {
        return sides;
    }

    /**
     * This method will check if all of the four
     * sides are equal.
     *
     * @return true or false
     */
    public boolean isSquare(){
        return sides.get(0).equals(sides.get(1)) && sides.get(1).equals(sides.get(2)) && sides.get(2).equals(sides.get(3));
    }

    /**
     * This method will calculate the perimeter
     * by adding all 4 sides.
     *
     * @return the perimeter
     */
    public double calculatePerimeter(){
        return sides.get(0) + sides.get(1) + sides.get(2) + sides.get(3);
    }

    /**
     * This method will calculate the area.
     *
     * @return the area
     */
    public double calculateArea(){
        return sides.get(0) * sides.get(1);
    }

    /**
     * This method will show the information about
     * a rectangle and will show the area and the perimeter.
     *
     */
    public void draw(){
        System.out.print("This Shape Is A Rectangle With The Area Of " + calculateArea() + " And The Perimeter Of " + calculatePerimeter());
        if(isSquare())
            System.out.print(". This Shape Is A Square.\n" );
        else
            System.out.print(".\n");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Objects.equals(sides, rectangle.sides);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sides);
    }

    @Override
    public String toString() {
        return "Rectangle { " +
                "side 1 = " + sides.get(0) + ", side 2 = " + sides.get(1) + ", side 3 = " + sides.get(2) + ", side 4 = " + sides.get(3) +
                " }";
    }
}
