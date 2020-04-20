import java.util.ArrayList;

public class Paint {
    private ArrayList<Shape> shapes;

    public Paint() {
        shapes = new ArrayList<>();
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void drawAll() {
        for (Shape shape : shapes)
            shape.draw();

    }

    public void printAll() {
        for (Shape shape : shapes)
            System.out.println(shape.toString());
    }
    public void describeEqualSides() {
        for (Shape shape : shapes) {
            if ((shape instanceof Triangle && ((Triangle) shape).isEquilateral‬‬())
                    || shape instanceof Rectangle && ((Rectangle) shape).isSquare‬‬())
                System.out.println(shape.toString());
        }
    }


}
