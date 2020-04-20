import java.util.ArrayList;

/**
 * The Paint class holds shapes information.
 *
 * @author Amirreza Hashemi
 * @version 1.0
 * @since 4/19/2020
 */
public class Paint {
    private ArrayList<Circle> circles;
    private ArrayList<Rectangle> rectangles;
    private ArrayList<Triangle> triangles;

    /**
     * Instantiates a new Paint.
     */
    public Paint() {
        circles = new ArrayList<>();
        triangles = new ArrayList<>();
        rectangles = new ArrayList<>();
    }

    /**
     * Adds triangle.
     *
     * @param triangle the triangle
     */
    public void addTriangle(Triangle triangle) {
        triangles.add(triangle);
    }

    /**
     * Adds circle.
     *
     * @param circle the circle
     */
    public void addCircle(Circle circle) {
        circles.add(circle);
    }

    /**
     * Adds rectangle.
     *
     * @param rectangle the rectangle
     */
    public void addRectangle(Rectangle rectangle) {
        rectangles.add(rectangle);
    }

    /**
     * Prints all shapes.
     */
    public void printAll() {
        for (Rectangle rectangle : rectangles)
            System.out.println(rectangle.toString());
        for (Triangle triangle : triangles)
            System.out.println(triangle.toString());

        for (Circle circle : circles)
            System.out.println(circle.toString());
    }

    /**
     * Draws all shapes.
     */
    public void drawAll() {
        for (Rectangle rectangle : rectangles)
            rectangle.draw();
        for (Triangle triangle : triangles)
            triangle.draw();
        for (Circle circle : circles)
            circle.draw();
    }

}


