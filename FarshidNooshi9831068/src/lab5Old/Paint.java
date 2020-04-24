//In The Name Of GOD

package lab5Old;

import java.util.ArrayList;

public class Paint {
    private ArrayList<Circle> circleArrayList;
    private ArrayList<Triangle> triangleArrayList;
    private ArrayList<Rectangle> rectangleArrayList;

    /**
     * a simple constructor for just building the initial array lists
     */
    public Paint() {
        circleArrayList = new ArrayList<>();
        triangleArrayList = new ArrayList<>();
        rectangleArrayList = new ArrayList<>();
    }

    /**
     * this method prints all the shapes that we saved
     */
    public void drawAll() {
        for (Circle it : circleArrayList)
            it.draw();

        for (Triangle it : triangleArrayList)
            it.draw();

        for (Rectangle it : rectangleArrayList)
            it.draw();
    }

    /**
     * this method prints information about each shape
     */
    public void printAll() {
        for (Circle it : circleArrayList)
            System.out.println(it);

        for (Triangle it : triangleArrayList)
            System.out.println(it);

        for (Rectangle it : rectangleArrayList)
            System.out.println(it);
    }


    /**
     * @param circle is a new circle to be added
     */
    public void addCircle(Circle circle) {
        circleArrayList.add(circle);
    }

    /**
     * @param triangle is a new triangle to be added
     */

    public void addTriangle(Triangle triangle) {
        triangleArrayList.add(triangle);
    }

    /**
     * @param rectangle is a new rectangle to be added
     */
    public void addRectangle(Rectangle rectangle) {
        rectangleArrayList.add(rectangle);
    }

}
