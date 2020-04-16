package com.myPack;

/**
 * This is the main superclass
 * for all kind of shapes.
 *
 */
public class Shape {
    /**
     * To calculate the perimeter.
     *
     * @return the perimeter
     */
    public double calculatePerimeter(){
        return 0;
    }

    /**
     * To calculate the area.
     *
     * @return the area.
     */
    public double calculateArea(){
        return 0;
    }

    /**
     * This method is to show the
     * area and the perimeter of a shape.
     *
     */
    public void draw(){
        System.out.print("With The Area Of " + calculateArea() + " And The Perimeter Of " + calculatePerimeter());
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
