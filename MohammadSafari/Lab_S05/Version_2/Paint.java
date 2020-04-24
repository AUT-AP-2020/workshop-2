package MohammadSafari.Lab_S05.Version_2;

import java.util.*;

public class Paint {
    private ArrayList<Shape> shapes;

    public Paint() {
        shapes = new ArrayList<Shape>();
    }

    public void addTriangle(Shape shape) {
        shapes.add(shape);
    }

    public void drawAll() {
        for (Shape each : shapes)
            each.draw();

    }

    public void printAll() {
        for (Shape each : shapes)
            each.toString();
    }

}