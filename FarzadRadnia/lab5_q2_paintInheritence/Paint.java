import java.util.ArrayList;

/**
 * there are some pre defined shapes in paint class that can be draw throw it.
 * but beware that this drawing is just printing the names and sizes on board.
 * @author farzad
 * @version 1.0 (5.April.2020)
 */
public class Paint {
    ArrayList<Shape> shapes;

    /**
     * simple constructor.
     */
    public Paint() {
        shapes =  new ArrayList<>();
    }

    /**
     * add a valid shape to shapes of this class. if the shape is not valid, would be ignored.
     * @param shape shape to be added.
     */
    public void addShape(Shape shape)
    {
        if(shape.calculateArea() != 0) {
            shapes.add(shape);
            System.out.println(shape.toString() + "  added ot shapes.");
        }
    }


    /**
     * prints kind of shape, area and perimeter for all  shapes.
     */
    public void drawAll ()
    {
        for(Shape shape : shapes)
            shape.draw();
    }

    /**
     * prints kind and sizes of each shape.
     */
    public void printAll()
    {
        int i=1;
        for(Shape shape : shapes) {
            System.out.println("" + i + "_ " + shape);
            i++;
        }
    }

    /**
     * prints all squares and equilateral triangles.
     */
    public void describeEqualSides()
    {
        int i=1;
        for(Shape shape : shapes) {
            if (shape instanceof Triangle)
                if (((Triangle) shape).isEquilateral())
                    System.out.println(i +"- " +shape);
            if(shape instanceof Rectangle)
                if(((Rectangle) shape).isSquare())
                    System.out.println(i +"- " +shape);
            i++;
        }
    }


    /**
     * get all shapes of this paint class
     * @return all shapes of this class
     */
    public ArrayList<Shape> getShapes() {
        return shapes;
    }
}
