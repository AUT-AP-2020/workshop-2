/**
 * Paint Object
 * @author Keivan Ipchi Hagh
 * @since 2020/5/4
 * @override 1.0.1
 */

import java.util.ArrayList;

public class Paint {

    /**
     * A list of all shapes including circles, triangles, rectangles, ...
     */
    private ArrayList<Shape> shapes;

    /**
     * Paint Constructor, Initializes all fields
     */
    public Paint() {
        this.shapes = new ArrayList<>();
    }

    /**
     * Adds a new shape (circle, triangle, rectangle, ...)
     * @param shape
     */
    public void addShape(Shape shape) {
        this.shapes.add(shape);
    }

    /**
     * Draws all shapes
     */
    public void drawAll() {
        for (Shape shape: shapes)
            shape.draw();
    }

    /**
     * Prints all shapes
     */
    public void printAll() {
        for (Shape shape: shapes)
            System.out.println(shape.toString());
    }

    /**
     * Describes each shape using their 'toString()' methods
     */
    public void describeEqualSides() {
        for (Shape shape : shapes) {
            if (shape instanceof Circle)
                System.out.println(shape.toString());
            else if (shape instanceof Rectangle)
                if (((Rectangle) shape).isSquare())
                    System.out.println(shape.toString() + "\tisSquare!");
                else
                    System.out.println(shape.toString());
            else if (((Triangle) shape).isEquilateral())
                System.out.println(shape.toString() + "\tisEquilateral!");
            else
                System.out.println(shape.toString());
        }
    }
}
