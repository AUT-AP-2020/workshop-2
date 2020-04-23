import java.util.ArrayList;

public class Paint {

    private ArrayList<Shape> shapes;

    /**
     * constructor which creat an ArrayList
     */
    public Paint(){
        shapes = new ArrayList<>();
    }

    /**
     * add a Shape
     * @param addShape the Shape is add
     */
    public void addShape(Shape addShape){
        shapes.add(addShape);
    }


    /**
     * show the type and Perimeter and Area of all shapes
     */
    public void drawAll(){
        for(Shape shape : shapes)
            shape.draw();
    }

    /**
     * show the type and sides or radius of all shapes
     */
    public void printAll(){
        for(Shape shape : shapes)
            System.out.println(shape.toString());
    }

    /**
     * This method is to check if a triangle is a equilateral or a Rectangle is a square.
     */
    public void describeEqualSides() {
        for (Shape shape : shapes) {
            if (shape instanceof Rectangle) {
                if (((Rectangle) shape).isSquare())
                    System.out.println(shape.toString());
            } else if (shape instanceof Triangle)
                if (((Triangle) shape).isEquilateral())
                    System.out.println(shape.toString());
        }
    }

}
