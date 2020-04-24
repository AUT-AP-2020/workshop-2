import java.util.ArrayList;

/**
 *
 */
public class Paint {
    ArrayList<Triangle> Triangles = new ArrayList<>();
    ArrayList<Circle> Circles = new ArrayList<>();
    ArrayList<Rectangle> Rectangles = new ArrayList<>();

    /**
     *
     * @param circles it will be the available circles in our system
     */
    public void setCircles(ArrayList<Circle> circles) {
        Circles = circles;
    }

    /**
     *
     * @return it is the available circles in our system
     */
    public ArrayList<Circle> getCircles() {
        return Circles;
    }

    /**
     *
     * @return it is the available Rectangles in our system
     */
    public ArrayList<Rectangle> getRectangles() {
        return Rectangles;
    }

    /**
     *
     * @return it is the available Triangles in our system
     */
    public ArrayList<Triangle> getTriangles() {
        return Triangles;
    }

    /**
     *
     * @param rectangles it will be the available Rectangles in our system
     */
    public void setRectangles(ArrayList<Rectangle> rectangles) {
        Rectangles = rectangles;
    }

    /**
     *
     * @param triangles it will be the available triangles in our system
     */
    public void setTriangles(ArrayList<Triangle> triangles) {
        Triangles = triangles;
    }

    /**
     *
     * @param newCircle it will be the new added circle to the list
     */
    public void addCircles(Circle newCircle)
    {
        Circles.add(newCircle);
    }

    /**
     *
     * @param newTriangle it will be the new added Triangle to the list
     */
    public void addTriangle(Triangle newTriangle)
    {
        Triangles.add(newTriangle);
    }

    /**
     *
     * @param newRectangle it will be the new added Rectangle to the list
     */
    public void addRectangles(Rectangle newRectangle)
    {
        Rectangles.add(newRectangle);
    }

    /**
     * show all the available info about the shapes
     */
    public void drawAll()
    {
        for (Circle temp :Circles) {
            temp.draw();
        }
        for (Triangle temp :Triangles) {
            temp.draw();
        }
        for (Rectangle temp :Rectangles) {
            temp.draw();
        }
    }
    /**
     *
     */
    public void printAll()
    {
        for (Circle temp :Circles) {
            System.out.println(temp.toString());
        }
        for (Triangle temp :Triangles) {
            System.out.println(temp.toString());
        }
        for (Rectangle temp :Rectangles) {
            System.out.println(temp.toString());
        }
    }


}
