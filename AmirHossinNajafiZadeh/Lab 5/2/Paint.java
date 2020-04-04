package com.myPack;

import java.util.ArrayList;

/**
 * This class keeps all the shapes for us and
 * their informations.
 *
 */
public class Paint {
    //The list of shapes
    private ArrayList<Shape> shapes;

    /**
     * The constructor of the Pain class.
     *
     */
    public Paint(){
        shapes = new ArrayList<>();
    }

    /**
     * This method is for adding a new shape
     * to the list.
     *
     * @param shape the new shape
     */
    public void addShape(Shape shape){
        shapes.add(shape);
    }

    /**
     * This is for drawing all of the shapes.
     *
     */
    public void drawAll(){
        for(Shape i : shapes)
            i.draw();
    }

    /**
     * This is for printing all of the shapes
     * information.
     *
     */
    public void printAll(){
        for(Shape i : shapes)
            System.out.println(i.toString());
    }

    /**
     * This method is to check if a triangle is
     * a equilateral or a triangle is a square.
     *
     */
    public void describeEqualSides(){
        for(Shape i : shapes){
            if(i instanceof Rectangle){
                if(((Rectangle) i).isSquare())
                    System.out.println(i.toString());
            } else if(i instanceof Triangle)
                if(((Triangle) i).isEquilateral())
                    System.out.println(i.toString());
        }
    }
}
