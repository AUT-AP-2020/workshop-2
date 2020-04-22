import java.util.ArrayList;

/**
 * This is the paint class which includes three list of different kind shapes
 */
public class Paint {
    private ArrayList<Triangle> triangles = new ArrayList<>();
    private ArrayList<Circle> circles = new ArrayList<>();
    private ArrayList<Rectangle> rectangles = new ArrayList<>();

    /**
     * This is a method to add a triangle in triangles list
     *
     * @param triangleToAdd
     */
    public void addTriangle(Triangle triangleToAdd) {
        triangles.add(triangleToAdd);
    }

    /**
     * This is a method to add a circle in circles list
     *
     * @param circleToAdd
     */
    public void addCircle(Circle circleToAdd) {
        circles.add(circleToAdd);
    }

    /**
     * This is a method to add a rectangle in rectangles list
     *
     * @param rectangleToAdd
     */
    public void addRectangle(Rectangle rectangleToAdd) {
        rectangles.add(rectangleToAdd);
    }

    /**
     * This is a method to draw all the shapes
     */
    public void drawAll() {
        for (Triangle triangle : triangles) {
            triangle.draw();
        }
        for (Circle circle : circles) {
            circle.draw();
        }
        for (Rectangle rectangle : rectangles) {
            rectangle.draw();
        }
    }

    /**
     * This is a method to print all the shapes
     */
    public void printAll() {
        for (Triangle triangle : triangles) {
            System.out.println(triangle);
        }
        for (Circle circle : circles) {
            System.out.println(circle);
        }
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }
    }
}
