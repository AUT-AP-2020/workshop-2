/**
 * This class designed to draw and manage the shapes.
 *
 * @author erfan
 */

import java.util.ArrayList;
public class Paint {
    private ArrayList<Shape> shapeList;

    public Paint(){
        shapeList = new ArrayList<>();
    }

    public void addShape(Shape shape){
        this.shapeList.add(shape);
    }

    public void drawAll(){
        for (Shape s : shapeList)
            s.draw();
    }

    public void describeEqualSides(){
        for (Shape s : shapeList){
            if (s instanceof Triangle){
                s.toString();
                ((Triangle) s).isEquilateral();
            }else if (s instanceof Rectangle){
                s.toString();
                ((Rectangle)s).isSquare();
            }else {
                s.toString();
            }
        }
    }
}
