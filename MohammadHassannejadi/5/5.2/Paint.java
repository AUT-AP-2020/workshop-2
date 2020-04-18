import java.util.ArrayList;

/**
 * This class saves all shapes in 
 * arraylist and add , draw and print information
 * @author Mohammad Hassannejadi
 * @version 1.0
 */
public class Paint{
    private ArrayList<Shape> shapes;
    /**
     * constructor of class to new lists
     */
    public Paint(){
        shapes = new ArrayList<Shape>();
    }
    /**
     * adding a shape from main class
     * @param shape the shape we want to add
     */
    public void addShape(Shape shape){
        shapes.add(shape);
    }
    /**
     *  print all perimeter and area of our shapes
     */
    public void drawAll(){
        for(Shape shape : shapes){
            shape.draw();
        }
    }
    /**
     *  print information of shapes
     */
    public void printAll(){
        for(Shape shape : shapes){
            System.out.println(shape.toString());
        }
    }
    /**
     * print all equal side shape 
     */
    public void describeEqualSides(){
        for(Shape shape : shapes){
            if(shape instanceof Triangle){
                if(((Triangle) shape).isEquilateral())
                    System.out.println(shape.toString());
            }
            else if(shape instanceof Rectangle){
                if(((Rectangle) shape).isSquare())
                    System.out.println(shape.toString());
            }
                
        }
    }
}