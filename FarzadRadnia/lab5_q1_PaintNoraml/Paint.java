import java.util.ArrayList;

/**
 * there are some pre defined shapes in paint class that can be draw throw it.
 * but beware that this drawing is just printing the names and sizes on board.
 * @author farzad
 * @version 1.0 (5.April.2020)
 */
public class Paint {
    ArrayList<Triangle> triangles;
    ArrayList<Circle> circles;
    ArrayList<Rectangle> rectangles;

    /**
     * simple constructor.
     */
    public Paint() {
        triangles = new ArrayList<>();
        circles = new ArrayList<>();
        rectangles = new ArrayList<>();
    }

    /**
     * add a valid triangle to shapes of this class. if the triangle is not valid, would be ignored.
     * @param triangle triangle to be added.
     */
    public void addTriangle(Triangle triangle)
    {
        if(triangle.getSides().size() != 0)
            triangles.add(triangle);
    }

    /**
     * add a valid circle to shapes of this class. if the circle is not valid, would be ignored.
     * @param circle circle to be added.
     */
    public void addCircle (Circle circle)
    {
        if(circle.getRadius() != 0)
            circles.add(circle);
    }

    /**
     * add a valid rectangle to shapes of this class. if the rectangle is not valid, would be ignored.
     * @param rectangle rectangle to be added.
     */
    public void addRectangle (Rectangle rectangle)
    {
        if(rectangle.getSides().size() != 0)
            rectangles.add(rectangle);
    }



    /**
     * prints kind of shape, area and perimeter for all  shapes.
     */
    public void drawAll ()
    {
        for(Circle circle : circles)
            circle.draw();
        for(Rectangle rectangle : rectangles)
            rectangle.draw();
        for(Triangle triangle : triangles)
            triangle.draw();
    }


    /**
     * prints kind and sizes of each shape.
     */
    public void printAll()
    {
        int i=1;
        for(Circle circle : circles) {
            System.out.println(""+i +"_ "+ circle);
            i++;
        }
        for(Rectangle rectangle : rectangles) {
            System.out.println("" + i + "_ " + rectangle);
            i++;
        }
        for(Triangle triangle : triangles) {
            System.out.println("" + i + "_ " + triangle);
            i++;
        }
    }

    /**
     * get all rectangles of this paint class
     * @return all rectangles of this class
     */
    public ArrayList<Rectangle> getRectangles() {
        return rectangles;
    }

    /**
     * get all circles of this paint class
     * @return all circles of this class
     */
    public ArrayList<Circle> getCircles() {
        return circles;
    }

    /**
     * get all triangles of this paint class
     * @return all triangles of this class
     */
    public ArrayList<Triangle> getTriangles() {
        return triangles;
    }
}
