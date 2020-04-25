import java.util.ArrayList;

/**
 * This class keeps all the shapes
 *
 * @author sevda imany
 * @version 0.0
 */
public class Paint {
    //list of shapes
    ArrayList<Shape> shapes;


    /**
     * Create new Paint
     */
    public Paint() {
        shapes = new ArrayList<>();
    }

    
    /** 
     * This method add the given shape to the shapes list
     * @param shape
     */
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    /**
     * This method draw all shapes 
     */
    public void drawAll() {
        for (Shape shape : shapes)
            shape.draw();
    }

    /**
     * This method print all shapes details
     */
    public void printAll() {
        for (Shape shape : shapes)
            System.out.println(shape.getClass() + ": " + shape.toString());
    }

    /**
     * this method prints shapes information if they are square ot=r equilateral
     */
    public void describeEqualSides(){
        for (Shape shape : shapes){
            if(shape instanceof Rectangle){
              Rectangle rectangle = (Rectangle)shape;
              if(rectangle.isSquare()){
                 System.out.println( rectangle.toString());
              }
            }

            else if(shape instanceof Triangle){
                Triangle triangle = (Triangle) shape;
                if(triangle.isEquilateral()){
                  System.out.println( triangle.toString());
                }
            }
        }

    }
}