import java.util.ArrayList;

/**
 * Paint
 */
public class Paint {

    private ArrayList<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shapeToBeAdded) {
        shapes.add(shapeToBeAdded);
    }

    public void drawAll() {
        for (Shape i : shapes) {
            i.draw();
        }
    }

    public void printAll() {
        for (Shape i : shapes) {
            System.out.println(i);
        }
    }

    public void describeEqualSides() {
        for (Shape i : shapes) {
            if (i instanceof Rectangle) {
                Rectangle castedI = (Rectangle) i;
                if (castedI.isSquare()) {
                    System.out.println(castedI);
                }
            }
            if (i instanceof Triangle) {
                Triangle castedI = (Triangle) i;
                if (castedI.isEquilateral()) {
                    System.out.println(castedI);
                }
            }
        }
    }
}