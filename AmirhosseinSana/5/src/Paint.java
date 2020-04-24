import java.util.ArrayList;

/**
 * The type Paint.
 */
public class Paint {
    private ArrayList<Shape> shapes;

    /**
     * Instantiates a new Paint.
     */
    Paint() {
        shapes = new ArrayList<>();
    }

    /**
     * Add shape.
     *
     * @param shape the shape
     */
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    /**
     * Draw all.
     */
    public void drawAll() {
        for(int i = 0; i < shapes.size(); i ++) {
            shapes.get(i).draw();
        }
    }

    /**
     * Print all.
     */
    public void printAll() {
        for(int i = 0; i < shapes.size(); i ++) {
            System.out.println(shapes.get(i));
        }
    }

    /**
     * Describe equal sides.
     */
    public void describeEqualSides() {
        for(int i = 0; i < shapes.size();i ++ ) {
            Shape shape = shapes.get(i);
            if(shape instanceof Triangle) {
                Triangle t = (Triangle) shape;
                if(t.isEquilateral())
                    System.out.println(t);
            }
            if(shape instanceof Rectangle) {
                Rectangle r = (Rectangle) shape;
                if(r.isSquare())
                    System.out.println(r);
            }
        }
    }
}
