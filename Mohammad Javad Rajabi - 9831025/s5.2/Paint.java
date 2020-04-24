import java.util.ArrayList;

/**
 * this class is for all shapes
 * and can add all type of shape with addShape method
 * also has methods that can draw and print all shape
 *
 * @author Mohammad Javad Rajabi
 * @version 1.0.0
 * @since 2020-04-10
 */
public class Paint {

    //fields

    /**
     * list of shapes
     */
    private ArrayList<Shape> shapes;

    //constructors

    /**
     * Constructor for create paint object
     */
    public Paint() {
        shapes = new ArrayList<Shape>();
    }

    // methods

    /**
     *  This method is used to add a new shape to list.
     * @param shape This is object that add to list of shapes.
     */
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    /**
     * This method is used to draw type of all shapes
     * and their perimeter and area are printed
     */
    public void drawAll() {
        System.out.println("----------------------");
        System.out.println("draw list of shapes");
        for (Shape shape : shapes) {
            shape.draw();
        }
    }

    /**
     * This method is used to draw type of all shapes
     * and their sides or radius.
     */
    public void printAll() {
        System.out.println("----------------------");
        System.out.println("print list of shapes");
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }
    }

    /**
     * This method is used to check which polygon have equal sides.
     */
    public void describeEqualSides() {
        for (Shape shape : shapes) {
            if (shape instanceof Triangle){
                if (((Triangle) shape).isEquilateral()){
                    System.out.println("----------------------");
                    System.out.println("this shape is equilateral");
                    System.out.println(shape.toString());
                }
            }
            else if (shape instanceof Rectangle){
                if (((Rectangle) shape).isSquare()){
                    System.out.println("----------------------");
                    System.out.println("this shape is square");
                    System.out.println(shape.toString());
                }
            }
        }
    }
}
