import java.util.ArrayList;

/**
 * The Paint class holds shapes information.
 *
 * @author Amirreza Hashemi
 * @version 2.0
 * @since 4/19/2020
 */
public class Paint {
    private ArrayList<Shape> shapes;

    /**
     * Instantiates a new Paint.
     */
    public Paint() {
        shapes = new ArrayList<>();
    }

    /**
     * Adds shape.
     *
     * @param shape the shape
     */
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    /**
     * Draws all shapes.
     */
    public void drawAll() {
        for (Shape shape : shapes)
            shape.draw();

    }

    /**
     * Prints all shapes.
     */
    public void printAll() {
        for (Shape shape : shapes)
            System.out.println(shape.toString());
    }

    /**
     * Describes and prints equal sides.
     */
    public void describeEqualSides() {
        for (Shape shape : shapes) {
            if ((shape instanceof Triangle && ((Triangle) shape).isEquilateral‬‬())
                    || shape instanceof Rectangle && ((Rectangle) shape).isSquare‬‬())
                System.out.println(shape.toString());
        }
    }


}
