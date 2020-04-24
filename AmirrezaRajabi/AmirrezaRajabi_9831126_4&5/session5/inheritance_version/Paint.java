/**
 * This is the paint class which includes a list of shapes
 */
import java.util.ArrayList;

public class Paint {
    private ArrayList<Shape> shapes = new ArrayList<>();

    /**
     *  add shape
     * @param shapeToAdd
     */
    public void addShape(Shape shapeToAdd) {
        shapes.add(shapeToAdd);
    }

    /**
     * draw shapes
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
        for (int i =0;i < shapes.size();i++) {
            if (shapes.get(i) instanceof Triangle) {
                if (((Triangle) shapes.get(i)).isEquilateral() == 1) {
                    System.out.println(shapes.get(i) + " is equilateral!");
                }
            }
            if (shapes.get(i) instanceof Rectangle) {
                if (((Rectangle) shapes.get(i)).isSquare() == 1) {
                    System.out.println(shapes.get(i) + " is square!");
                }
            }
        }
    }

    /**
     * This is a method to print all the shapes
     */
    public void printAll() {
        for (int i =0;i < shapes.size();i++) {
            System.out.println(shapes.get(i));
        }
    }
}