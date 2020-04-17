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
