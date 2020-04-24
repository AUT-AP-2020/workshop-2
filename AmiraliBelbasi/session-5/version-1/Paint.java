import java.util.ArrayList;

/**
 * Paint
 */
public class Paint {

    private ArrayList<Triangle> triangles = new ArrayList<>();
    private ArrayList<Circle> circles = new ArrayList<>();
    private ArrayList<Rectangle> rectangles = new ArrayList<>();

    public void addTriangle(Triangle triangleToBeAdded) {
        triangles.add(triangleToBeAdded);
    }

    public void addCircle(Circle circleToBeAdded) {
        circles.add(circleToBeAdded);
    }

    public void addRectangle(Rectangle rectangleToBeAdded) {
        rectangles.add(rectangleToBeAdded);
    }

    public void drawAll() {
        for (Triangle i : triangles) {
            i.draw();
        }
        for (Circle i : circles) {
            i.draw();
        }
        for (Rectangle i : rectangles) {
            i.draw();
        }
    }

    public void printAll() {
        for (Triangle i : triangles) {
            System.out.println(i);
        }
        for (Circle i : circles) {
            System.out.println(i);
        }
        for (Rectangle i : rectangles) {
            System.out.println(i);
        }
    }
}