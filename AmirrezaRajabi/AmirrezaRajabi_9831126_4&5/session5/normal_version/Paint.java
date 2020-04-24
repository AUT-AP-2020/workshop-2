/**
 * Pain class include triangle circle rectangle
 */
import java.util.ArrayList;
public class Paint
{
    private ArrayList<Triangle> triangles = new ArrayList<>();
    private ArrayList<Circle> circles = new ArrayList<>();
    private ArrayList<Rectangle> rectangles = new ArrayList<>();

    /**
     * add triangle to triangles
     * @param triangleToAdd
     */
    public void addTriangle(Triangle triangleToAdd) {
        triangles.add(triangleToAdd);
    }

    /**
     * add circle to circles
     * @param circleToAdd
     */
    public void addCircle(Circle circleToAdd) {
        circles.add(circleToAdd);
    }

    /**
     * add rectangle to rectangles
     * @param rectangleToAdd
     */
    public void addRectangle(Rectangle rectangleToAdd) {
        rectangles.add(rectangleToAdd);
    }

    /**
     * draw circles rectangles triangles
     */
    public void drawAll() {
        for (int i = 0;i < circles.size();i++) {
            circles.get(i).draw();
        }
        for (int i = 0;i < rectangles.size();i++) {
            rectangles.get(i).draw();
        }
        for (int i = 0;i < triangles.size();i++) {
            triangles.get(i).draw();
        }
    }

    /**
     * print circles rectangles triangles
     */
    public void printAll() {
        for (int i = 0;i < circles.size();i++) {
            System.out.println(circles.get(i).toString());
        }
        for (int i = 0;i < rectangles.size();i++) {
            System.out.println(rectangles.get(i).toString());
        }
        for (int i = 0;i < triangles.size();i++) {
            System.out.println(triangles.get(i).toString());
        }
    }
}
