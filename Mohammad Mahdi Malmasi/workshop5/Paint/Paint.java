import java.util.ArrayList;



/**
 * This class keeps all the shapes for us and
 * their informations.
 *
 */
public class Paint 
{
            /*  Feilds  */

    // shapes of this class
    private ArrayList<Shape> shapes;





          /* Constructor */

    /**
     * Create new Paint
     */
    public Paint()
    {
        shapes = new ArrayList<>();
    }





            /*  Methods  */

    /**
     * This method add the given shape to the shapes list
     * 
     * @param shapeToAdd : the new shape to add
     */
    public void addShape(Shape shape)
    {
        shapes.add(shape);
    }


    /**
     * This method draw all shapes in terminal
     */
    public void drawAll()
    {
        for(Shape shape : shapes)
            shape.draw();
    }


    /**
     * This method print all shapes details in terminal
     */
    public void printAll()
    {
        for(Shape shape : shapes)
            System.out.println(shape.getClass() + ": " + shape.toString());
    }
}