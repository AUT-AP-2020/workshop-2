/**
 * Paint Object
 * @author Keivan Ipchi Hagh
 * @since 2020/5/4
 * @override 1.0.1
 */

import java.util.ArrayList;

public class Paint {

    /**
     * A list of Circles
     */
    private ArrayList<Circle> circles;
    /**
     * A list of Rectangles
     */
    private ArrayList<Rectangle> rectangles;
    /**
     * A list of Triangles
     */
    private ArrayList<Triangle> triangles;

    /**
     * Paint Constructor, Initializes all fields
     */
    public Paint() {
        circles = new ArrayList<>();
        rectangles = new ArrayList<>();
        triangles = new ArrayList<>();
    }

    /**
     * Adds a circle
     * @param circle Circle
     */
    public void addCircle(Circle circle) {
        this.circles.add(circle);
    }

    /**
     * Adds a rectangle
     * @param rectangle Rectangle
     */
    public void addRectangle(Rectangle rectangle) {
        this.rectangles.add(rectangle);
    }

    /**
     * Adds a triangle
     * @param triangle Triangle
     */
    public void addTriangle(Triangle triangle) {
        this.triangles.add(triangle);
    }

    /**
     * Draws all objects
     */
    public void drawAll() {
        encapsulate("drawAll");
    }

    /**
     * Prints all objects
     */
    public void printAll() {
        encapsulate("printAll");
    }

    /**
     * Encapsulates the duplicates functionality for 'drawAll' and 'printAll'
     * @param action
     */
    private void encapsulate(String action) {
        for (Circle circle: circles)
            if (action.equals("drawAll"))
                circle.draw();
            else
                System.out.println(circle.toString());

        System.out.println();

        for (Rectangle rectangle: rectangles)
            if (action.equals("drawAll"))
                rectangle.draw();
            else
                System.out.println(rectangle.toString());

        System.out.println();

        for (Triangle triangle: triangles)
            if (action.equals("drawAll"))
                triangle.draw();
            else
                System.out.println(triangle.toString());

        System.out.println();
    }
}
