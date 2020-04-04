package com.myPack;

import java.util.ArrayList;

/**
 * This class keeps all the information
 * about the shapes.
 *
 */
public class Paint {
    //List of circles
    private ArrayList<Circle> circles;
    //List of triangles
    private ArrayList<Triangle> triangles;
    //List of rectangles
    private ArrayList<Rectangle> rectangles;

    /**
     * The constructor of the Paint
     * class.
     *
     */
    public Paint(){
        circles = new ArrayList<>();
        triangles = new ArrayList<>();
        rectangles = new ArrayList<>();
    }

    /**
     * To add a new triangle to the list.
     *
     * @param triangle the new triangle
     */
    public void addTriangle(Triangle triangle){
        triangles.add(triangle);
    }

    /**
     * To add a new circle to the list.
     *
     * @param circle the new circle
     */
    public void addCircle(Circle circle){
        circles.add(circle);
    }

    /**
     * To add a new rectangle to the list.
     *
     * @param rectangle the new rectangle
     */
    public void addRectanle(Rectangle rectangle){
        rectangles.add(rectangle);
    }

    /**
     * This method is for calculating all
     * shapes areas and perimeters.
     *
     */
    public void drawAll(){
        for(Triangle i : triangles)
            i.draw();
        for(Circle i : circles)
            i.draw();
        for(Rectangle i : rectangles)
            i.draw();
    }

    /**
     * This method is for showing the shapes
     * information.
     *
     */
    public void printAll(){
        for(Triangle i : triangles)
            System.out.println(i.toString());
        for(Circle i : circles)
            System.out.println(i.toString());
        for(Rectangle i : rectangles)
            System.out.println(i.toString());
    }
}
