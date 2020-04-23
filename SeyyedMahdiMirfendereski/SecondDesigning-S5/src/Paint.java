import java.util.ArrayList;

/**
 * keeping all shapes in this class
 * @author Mahdi Mirfendereski
 * @version 0.0
 */
public class Paint {
    private ArrayList<Shape> shapes ;

    /**
     * create a array list for shapes
     */
    public Paint(){
        shapes=new ArrayList<>();
    }

    /**
     * adding a shape to list
     * @param shape which shape?
     */
    public void addShape(Shape shape){
        shapes.add(shape);
    }

    /**
     * draw all shapes with polymorphism
     */
    public void drawAll(){
        for(Shape shape:shapes)
            shape.draw();
    }
    /**
     * print all shapes with polymorphism
     */
    public void paintAll(){
        for(Shape shape:shapes)
            System.out.println(shape);
    }

    /**
     * print all shapes that are square or equilateral
     */
    public void describeEqualSides(){
        for (Shape shape:shapes){
            if(shape instanceof Rectangle )
                if(((Rectangle)shape).isSquare())
                    System.out.println(shape);
            if(shape instanceof Triangle)
                if(((Triangle)shape).isEquilateral())
                    System.out.println(shape);

        }
    }
}
