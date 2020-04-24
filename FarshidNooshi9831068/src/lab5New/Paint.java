// In The Name Of GOD

package lab5New;

import java.util.ArrayList;

/**
 * the paint class to better managing
 */
public class Paint {
    private ArrayList<Shape> shapeArrayList;

    /**
     * a simple constructor for just building the initial array lists
     */
    public Paint() {
        shapeArrayList = new ArrayList<>();
    }

    /**
     * this method prints all the shapes that we saved
     */
    public void drawAll() {
        for (Shape it : shapeArrayList)
            it.draw();
    }

    /**
     * this method prints information about each shape
     */
    public void printAll() {
        for (Shape it : shapeArrayList)
            System.out.println(it);
    }


    public void addShape(Shape shape) {
        shapeArrayList.add(shape);
    }

    /**
     * this method prints the equal sides
     * means the shapes that has equal side lengths
     */
    public void describeEqualSides() {
        for (Shape it : shapeArrayList) {
            if (it instanceof Rectangle && ((Rectangle) it).isSquare())
                it.draw();
            else if (it instanceof Triangle && ((Triangle) it).isEquilateral())
                it.draw();
        }
    }

}
