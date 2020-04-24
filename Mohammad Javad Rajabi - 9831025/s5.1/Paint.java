import java.util.ArrayList;

/**
 * this class is for all shapes
 * and can add three type of shape with addTriangle,addCircle and addRectangle method
 * also has methods that can draw and print all shape
 *
 * @author Mohammad Javad Rajabi
 * @version 1.0.0
 * @since 2020-04-10
 */
public class Paint {


    //fields

    /**
     * list of circles
     */
    private ArrayList<Circle> circles;
    /**
     * list of triangles
     */
    private ArrayList<Triangle> triangles;
    /**
     * list of rectangles
     */
    private ArrayList<Rectangle> rectangles;


    //constructors

    /**
     * Constructor for create paint object
     */
    public Paint() {
        circles = new ArrayList<>();
        triangles = new ArrayList<>();
        rectangles = new ArrayList<>();
    }

    // methods

    /**
     *  This method is used to add a new shape to list.
     * @param triangle This is object that add to list of shapes.
     */
    public void addTriangle(Triangle triangle) {
        triangles.add(triangle);
    }

    /**
     *  This method is used to add a new shape to list.
     * @param circle This is object that add to list of shapes.
     */
    public void addCircle(Circle circle) {
        circles.add(circle);
    }

    /**
     *  This method is used to add a new shape to list.
     * @param rectangle This is object that add to list of shapes.
     */
    public void addRectangle(Rectangle rectangle) {
        rectangles.add(rectangle);
    }

    /**
     * This method is used to draw type of all shapes
     * and their perimeter and area are printed
     */
    public void drawAll() {
        System.out.println("----------------------");
        System.out.println("draw list of shapes");
        for (Circle circle :
                circles) {
            circle.draw();
        }
        for (Triangle triangle :
                triangles) {
            triangle.draw();
        }
        for (Rectangle rectangle :
                rectangles) {
            rectangle.draw();
        }
    }

    /**
     * This method is used to draw type of all shapes
     * and their sides or radius.
     */
    public void printAll() {
        System.out.println("----------------------");
        System.out.println("print list of shapes");
        for (Circle circle :
                circles) {
            System.out.println(circle.toString());
        }
        for (Triangle triangle :
                triangles) {
            System.out.println(triangle.toString());
        }
        for (Rectangle rectangle :
                rectangles) {
            System.out.println(rectangle.toString());
        }
    }
}
