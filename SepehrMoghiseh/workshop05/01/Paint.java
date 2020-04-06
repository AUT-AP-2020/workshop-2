import java.util.ArrayList;

public class Paint {
    private ArrayList<Circle> circles;
    private ArrayList<Triangle> triangles;
    private ArrayList<Rectangle> rectangles;

    public Paint() {
        circles = new ArrayList<>();
        triangles = new ArrayList<>();
        rectangles = new ArrayList<>();
    }

    public void addCircle(Circle circle) {
        circles.add(circle);
    }

    public void addTriangle(Triangle triangle) {
        triangles.add(triangle);
    }

    public void addRectangle(Rectangle rectangle) {
        rectangles.add(rectangle);
    }

    public void drawAll() {
        for (Circle circle : circles) {
            circle.draw();
            System.out.println();
        }
        for (Rectangle rectangle : rectangles) {
            rectangle.draw();
            System.out.println();
        }
        for (Triangle triangle : triangles) {
            triangle.draw();
            System.out.println();
        }
    }

    public void printAll() {
        for (Circle circle : circles) {
            System.out.println(circle.toString());
        }
        for (Rectangle rectangle : rectangles) {

            System.out.println(rectangle.toString());
        }
        for (Triangle triangle : triangles) {
            System.out.println(triangle.toString());
        }
    }
}
