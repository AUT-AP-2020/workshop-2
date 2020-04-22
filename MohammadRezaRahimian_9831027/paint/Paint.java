package paint;

import java.util.ArrayList;

public class Paint {
    ArrayList<Shape> shapes;

    public Paint() {
        shapes = new ArrayList<>();
    }
    public void addShapes(Shape shape){
        shapes.add(shape);
    }
    public void drawAll(){
        for(Shape i : shapes){
            if (i instanceof Circle){
                System.out.println("Circle");
            }
            if (i instanceof Rectangle){
                if (((Rectangle) i).isEqual()){
                    System.out.println("Square");
                }else {
                    System.out.println("Rectangle");
                }
            }
            if (i instanceof Triangle){
                if (((Triangle) i).isEqual()){
                    System.out.println("Equilateral");
                }else {
                    System.out.println("Triangle");
                }
            }
        }
    }
    public void printAll(){
        for(Shape s : shapes){
            System.out.print(s.toString() + " ");
            s.Draw();
        }
    }
}
