import java.util.ArrayList;

/**
 * This is the paint class which includes a list of shapes
 */
public class Paint {
    private ArrayList<Shape> shapes = new ArrayList<>();

    /**
     * This is a method to add a shape in shapes list
     *
     * @param shapeToAdd
     */
    public void addShape(Shape shapeToAdd) {
        shapes.add(shapeToAdd);
    }

    /**
     * This is a method to draw all the shapes
     */
    public void drawAll() {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }

    /**
     * This is a method to describe equal sides shapes
     */
    public void describeEqualSides() {
        for (Shape shape : shapes) {
            if (shape instanceof Triangle) {
                if (((Triangle) shape).isEquilateral()) {
                    System.out.println(shape + " is equilateral!");
                }
            }
            if (shape instanceof Rectangle) {
                if (((Rectangle) shape).isSquare()) {
                    System.out.println(shape + " is square!");
                }
            }
        }
    }

    /**
     * This is a method to print all the shapes
     */
    public void printAll() {
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
