package com.company;

import java.util.ArrayList;

/**
 * Represents a class for painting shapes.
 * @author Amirparsa Salmankhah
 * @version 1.0.0
 */
public class Paint {
    //list of shapes
    private ArrayList<Shape> shapes;

    /**
     * Constructor with no parameter.
     */
    public Paint() {
        shapes = new ArrayList<>();
    }

    /**
     * Adds a shape to list of the shapes.
     * @param shape The shape
     */
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    /**
     * Draws all of the shapes
     */
    public void drawAll() {
        for(Shape shape : shapes)
            shape.draw();
    }

    /**
     * Prints all of the shapes
     */
    public void printAll() {
        for(Shape shape : shapes)
            System.out.println(shape);
    }

    /**
     * Prints all of equal side shapes.
     */
    public void describeEqualSides(){
        for(Shape shape : shapes){
            if(shape instanceof Rectangle && ((Rectangle) shape).isSquare())
                System.out.println(shape);
            else if(shape instanceof Triangle && ((Triangle) shape).isEquilateral())
                System.out.println(shape);
        }
    }
}
