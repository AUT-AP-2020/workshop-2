import java.util.ArrayList;
import java.util.Objects;

/**
 * all shapes that are able to be draw or print int the paint.
 */
public class Shape {

    /**
     * simple constructor.
     * @param side sizes depends on shape's kind.
     */

    public Shape(double... side) { }

    /**
     * calculate the perimeter of this shape
     * @return perimeter of this shape
     */
    public double calculatePerimeter()
    {
        return 0;
    }


    /**
     * calculate the area of this shape
     * @return area of this shape
     */
    public double calculateArea()
    {
        return 0;
    }

    /**
     * prints the kind , perimeter and area of this shape
     */
    public void draw()
    {
        System.out.println("unknown shape");
    }

    /**
     * prints kind  and sizes of this shape.
     * @return make a string that contains kind  and sizes of this shape
     */
    @Override
    public String toString() {
        return "unknown shape";
    }

    /**
     * heck these shape to be same.
     * @param obj object to be checked
     * @return tru if same else false
     */
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
