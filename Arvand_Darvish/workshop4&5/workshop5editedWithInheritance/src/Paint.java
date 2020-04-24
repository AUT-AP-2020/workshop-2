import java.util.ArrayList;

public class Paint {
    private ArrayList<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void drawAll() {
        for (Shape a: shapes) {
            a.draw();
        }
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    public void printAll() {
        for (Shape a: shapes) {
            System.out.println(a.toString());
        }
        System.out.println("***********************");
    }

    public void describeEqualSides() {
        for (Shape a: shapes) {
            if(a instanceof Rectangle && ((Rectangle) a).isSquare())
                System.out.println(a.toString());
            if(a instanceof Triangle && ((Triangle) a).isEquilateral())
                System.out.println(a.toString());
        }
    }
}
