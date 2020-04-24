package com.company;

import java.util.ArrayList;

public class Paint {
    //list of triangles
    private ArrayList<Triangle> triangles;
    //list of rectangles
    private ArrayList<Rectangle> rectangles;
    //list of circles
    private ArrayList<Circle> circles;

    public Paint() {
        triangles = new ArrayList<>();
        circles = new ArrayList<>();
        rectangles = new ArrayList<>();
    }

    public void addTriangle(Triangle triangle) {
        triangles.add(triangle);
    }

    public void addRectangle(Rectangle rectangle) {
        rectangles.add(rectangle);
    }

    public void addCircle(Circle circle) {
        circles.add(circle);
    }

    public void drawAll() {
        System.out.println("Triangles:");
        for (Triangle triangle : triangles)
            triangle.draw();
        System.out.println("Rectangles:");
        for (Rectangle rectangle : rectangles)
            rectangle.draw();
        System.out.println("Circle:");
        for (Circle circle : circles)
            circle.draw();
    }

    public void printAll() {
        System.out.println("Triangles:");
        for (Triangle triangle : triangles)
            System.out.println(triangle);
        System.out.println("Rectangles:");
        for (Rectangle rectangle : rectangles)
            System.out.println(rectangle);
        System.out.println("Circle:");
        for (Circle circle : circles)
            System.out.println(circle);
    }

}
