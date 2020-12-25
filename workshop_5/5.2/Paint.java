import java.util.ArrayList;

/**
 * this class is use to add shapes and print information in methods
 * @author Setayesh
 * @version 0.1
 */
public class Paint {
    ArrayList<Shape> shapes;

    /**
     * Constructor.
     */
    public Paint() {
        shapes =  new ArrayList<>();
    }

    /**
     * add a shape to list of shapes .
     * @param shape shape to be added.
     */
    public void addShape(Shape shape) {
            shapes.add(shape);
    }


    /**
     *  print all perimeter and area of array list shapes
     */
    public void drawAll ()
    {
        for(Shape shape : shapes)
            shape.draw();
    }

    /**
     *  print information of shapes
     */
    public void printAll() {
        for (Shape shape : shapes) {
            System.out.println(shape + "\n");
        }
    }

    /**
     * prints all squares and equilateral triangles.
     */
    public void describeEqualSides(){
        for(Shape shape : shapes) {
            if (shape instanceof Triangle)
                if (((Triangle) shape).isEquilateral())
                    System.out.println(shape);
            if(shape instanceof Rectangle)
                if(((Rectangle) shape).isSquare())
                    System.out.println(shape);
        }
    }


    /**
     * @return all shapes of this class
     */
    public ArrayList<Shape> getShapes() {
        return shapes;
    }
}