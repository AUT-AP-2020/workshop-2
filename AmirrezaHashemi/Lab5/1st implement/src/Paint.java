import java.util.ArrayList;

public class Paint {
    private ArrayList<Circle> circles;
    private ArrayList<Rectangle> rectangles;
    private ArrayList<Triangle> triangles;

    public Paint() {
        circles = new ArrayList<>();
        triangles = new ArrayList<>();
        rectangles = new ArrayList<>();
    }

    public void addTriangle(Triangle triangle) {
        triangles.add(triangle);
    }

    public void addCircle(Circle circle) {
        circles.add(circle);
    }

    public void addRectangle(Rectangle rectangle) {
        rectangles.add(rectangle);
    }

    public void printAll()
    {
        for (Rectangle rectangle:rectangles)
            System.out.println(rectangle.toString());
        for (Triangle triangle : triangles)
            System.out.println(triangle.toString());

        for (Circle circle : circles)
            System.out.println(circle.toString());
    }
    public void drawAll()
    {
        for (Rectangle rectangle:rectangles)
            rectangle.draw();
       for (Triangle triangle : triangles)
           triangle.draw();
        for (Circle circle : circles)
           circle.draw();
    }

}


