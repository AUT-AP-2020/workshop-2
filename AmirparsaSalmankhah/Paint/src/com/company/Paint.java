package com.company;

import java.util.ArrayList;

public class Paint {
    //list of shapes
    private ArrayList<Shape> shapes;

    public Paint() {
        shapes = new ArrayList<>();
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }


    public void drawAll() {
        for(Shape shape : shapes)
            shape.draw();
    }

    public void printAll() {
        for(Shape shape : shapes)
            System.out.println(shape);
    }
}
