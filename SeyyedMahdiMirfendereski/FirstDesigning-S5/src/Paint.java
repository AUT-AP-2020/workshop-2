import java.util.ArrayList;

/**
 * this class represents a paint class to include circle,rectangle and triangle array list.
 * @version 0.0
 * @author Mahdi Mirfendereski
 */
public class Paint {
    private ArrayList<Circle> circles;
    private ArrayList<Triangle> triangles;
    private ArrayList<Rectangle> rectangles;
    public Paint(){
        circles=new ArrayList<>();
        triangles=new ArrayList<>();
        rectangles=new ArrayList<>();
    }

    /**
     *
     * @param circle circle to add to circle's list
     */
    public void addCircle(Circle circle){
        circles.add(circle);
    }
    /**
     *
     * @param triangle triangle to add to triangle's list
     */
    public void addTriangle(Triangle triangle){
        triangles.add(triangle);
    }
    /**
     *
     * @param rectangle rectangle to add to rectangle's list
     */
    public void addRectangle(Rectangle rectangle){
        rectangles.add(rectangle);
    }

    /**
     * draw all shapes
     */
    public void drawAll(){
        for (Rectangle r:rectangles)
            r.draw();
        for (Circle c:circles)
            c.draw();
        for (Triangle t:triangles)
            t.draw();
    }
    /**
     * print all shapes
     */
    public void printAll(){
        for (Rectangle r:rectangles)
            System.out.println(r);
        for (Circle c:circles)
            System.out.println(c);
        for (Triangle t:triangles)
            System.out.println(t);
    }
}
