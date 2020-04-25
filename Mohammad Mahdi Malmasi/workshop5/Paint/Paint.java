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
            
      
    /**
     * This method find squares and equilateral triangles
     */
    public void describeEqualSides()
    {
        for (Shape shape : shapes)
        {
            // check square cases
            if(shape instanceof Rectangle)
            {
              // cast the object
              Rectangle rectangle = (Rectangle) shape;
                        
              // check that it is a square or not
              if(rectangle.isSquare())
                 System.out.println(rectangle.toString());
            }
            
            // check equilateral triangle
            if(shape instanceof Triangle)
            {
                // cast the object
                Triangle triangle = (Triangle) shape;
                    
                // check that it is a equilateral triangle or not
                if(triangle.isEquilateral())
                  System.out.println(triangle.toString());
            }
        }

    }
}
