import java.util.ArrayList;

public class Paint {
    private ArrayList<Triangle> triangles = new ArrayList<>();
    private ArrayList<Circle> circles = new ArrayList<>();
    private ArrayList<Rectangle> rectangles = new ArrayList<>();

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
        for (Triangle a: triangles) {
            a.draw();
        }
        System.out.println();
        for (Rectangle a: rectangles) {
            a.draw();
        }
        System.out.println();
        for (Circle a: circles) {
            a.draw();
        }
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    public void printAll() {
        for (Triangle a: triangles) {
            System.out.println(a.toString());
        }
        System.out.println();
        for (Rectangle a: rectangles) {
            System.out.println(a.toString());
        }
        System.out.println();
        for (Circle a: circles) {
            System.out.println(a.toString());
        }
        System.out.println("***********************");
    }
}
