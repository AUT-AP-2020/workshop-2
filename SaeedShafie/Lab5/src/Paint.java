import java.util.ArrayList;

public class Paint {
    private ArrayList<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shapeToAdd) {
        shapes.add(shapeToAdd);
    }

    public void drawAll() {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
    public void printAll() {
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
    public void describeEqualSides() {
        for (Shape shape : shapes) {
            if (shape instanceof Triangle) {
                if (((Triangle) shape).isEquilateral()) {
                    System.out.println(shape + " is equal");
                }
            }
            if (shape instanceof Rectangle) {
                if (((Rectangle) shape).isSquare()) {
                    System.out.println(shape + " is square!");
                }
            }
        }
    }
}