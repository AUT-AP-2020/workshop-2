package com.myPack;

/**
 * This is the main superclass
 * for all kind of shapes.
 *
 */
public abstract class Shape {
    /**
     * To calculate the perimeter.
     *
     * @return the perimeter
     */
    public abstract double calculatePerimeter();

    /**
     * To calculate the area.
     *
     * @return the area.
     */
    public abstract double calculateArea();

    /**
     * This method is to show the
     * area and the perimeter of a shape.
     *
     */
    public abstract void draw();

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
