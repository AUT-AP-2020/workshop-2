package MohammadSafari.Lab_S05.Version_1;

import java.util.*;

public class Paint {
    private ArrayList<Circle> circles;
    private ArrayList<Rectangle> rectangles;
    private ArrayList<Triangle> triangles;

    public Paint() {
        circles = new ArrayList<Circle>();
        rectangles = new ArrayList<Rectangle>();
        triangles = new ArrayList<Triangle>();
    }

    public void addCircle(Circle circle) {
        circles.add(circle);
    }

    public void addRectangle(Rectangle rectangle) {
        rectangles.add(rectangle);
    }

    public void addTriangle(Triangle triangle) {
        triangles.add(triangle);
    }

    public void drawAll() {
        for (Circle each : circles) {
            each.draw();
        }
        for (Rectangle each : rectangles) {
            each.draw();
        }
        for (Triangle each : triangles) {
            each.draw();
        }
    }

    public void printAll() {
        for (Circle each : circles) {
            System.out.println(each.toString());
        }
        for (Rectangle each : rectangles) {
            System.out.println(each.toString());
        }
        for (Triangle each : triangles) {
            System.out.println(each.toString());
        }
    }
}