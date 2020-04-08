import java.util.ArrayList;
import java.util.Objects;

/**
 * all shapes that are able to be draw or print int the paint.
 */
public abstract class Shape {


    /**
     * calculate the perimeter of this shape
     * @return perimeter of this shape
     */
    public abstract  double calculatePerimeter();


    /**
     * calculate the area of this shape
     * @return area of this shape
     */
    public abstract double calculateArea();

    /**
     * prints the kind , perimeter and area of this shape
     */
    public abstract void draw();

    /**
     * prints kind  and sizes of this shape.
     * @return make a string that contains kind  and sizes of this shape
     */
    @Override
    public abstract String toString() ;

    /**
     * heck these shape to be same.
     * @param obj object to be checked
     * @return tru if same else false
     */
    @Override
    public abstract boolean equals(Object obj);
}
