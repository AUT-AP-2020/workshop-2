import java.util.ArrayList;
import java.util.logging.SocketHandler;

public class Paint {

    private ArrayList<Shape> shapes;

    public Paint(){
        shapes = new ArrayList<>();
    }

    public void addShape(Shape shape){
        shapes.add(shape);
    }

    public void drawAll(){
        for(Shape shape : shapes){
            shape.draw();
        }
    }

    public void describeEqualSides(){
        System.out.println("describeEqualSides::");
        for (Shape shape : shapes){
            if (shape instanceof Triangle) {
                if (((Triangle) shape).isEquilateral())
                    System.out.println(shape);
            }else if (shape instanceof Rectangle)
                if (((Rectangle) shape).isSquare())
                    System.out.println(shape);
        }
    }

    public void printAll(){
        for (Shape shape : shapes){
            System.out.println(shape);
        }
    }

}
