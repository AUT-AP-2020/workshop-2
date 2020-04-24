package paint.v2;

import paint.v2.Circle;
import paint.v2.Rectangle;
import paint.v2.Triangle;

import java.util.ArrayList;

public class Paint {
    public ArrayList<Rectangle> rectangles;
    public ArrayList<Triangle> triangles;
    public ArrayList<Circle> circles;

    public Paint() {
        rectangles=new ArrayList<>();
        circles=new ArrayList<>();
        triangles=new ArrayList<>();
    }

    public void drawAll(){
        for (Triangle t:triangles)
            t.draw();
        for (Rectangle t:rectangles)
            t.draw();
        for (Circle t:circles)
            t.draw();
    }

    public void printAll(){
        for (Triangle t:triangles)
            System.out.println(t);
        for (Rectangle t:rectangles)
            System.out.println(t);
        for (Circle t:circles)
            System.out.println(t);
    }

    public void addCircle(Circle c){
        circles.add(c);
    }

    public void addTriangle(Triangle c){
        triangles.add(c);
    }
    public void addRectangle(Rectangle c){
        rectangles.add(c);
    }
}
