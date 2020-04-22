/**
 * <h1>Paint class</h1>
 * this class saves all shape in arraylist<br>
 * have drawAll method to print shape perimeter and area<br>
 * have printAll method to print shape sides<br>
 * have describeEqualSides method to check shapes are equal or not
 */

import java.util.ArrayList;

public class Paint {

    private ArrayList<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void drawAll() {
        for (Shape shape : shapes) {
            System.out.println("Shape:" + shape.getClass().getName() + "  Perimeter:" + shape.calculatePerimeter(shape) + "  Area:" + shape.calculateArea(shape));
        }
    }

    public void printAll() {
        for (Shape shape : shapes) {
            System.out.println("Shape: " + shape.getClass().getName() + "  sides:" + shape);
        }
    }

    public void describeEqualSides() {
        for (Shape shape : shapes) {
            if (shape instanceof Triangle) {
                if (((Triangle) shape).isEquilateral(shape)) {
                    System.out.println("shape: " + shape.getClass().getName() + " sides:" + shape + "**** is equilateral");
                }
            } else if (shape instanceof Rectangle) {
                if (((Rectangle) shape).isSquare(shape)) {
                    System.out.println("shape: " + shape.getClass().getName() + " sides:" + shape + "**** is square");
                }
            }
        }
    }
}
