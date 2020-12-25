import java.util.ArrayList;
import java.util.Objects;
/**
 * Triangle is a subclass of polygon to save special behavior of triangle
 * @author setayesh
 * @version 0.1
 */
public class Triangle extends Polygon {

    /**
     * constructor makes a valid triangle.
     * @param side sides of this triangle
     */
    public Triangle(double... side) {
        super(side);
    }
    /**
     * calculate area
     * @return area
     */
    public double calculateArea(){
        double h = calculatePerimeter() / 2;
        return (Math.sqrt(h * (h - getSides().get(0)) * (h - getSides().get(1)) * (h - getSides().get(2)))); //Heron formula
    }
    /**
     * @return true if is Equilateral
     */
    public boolean isEquilateral(){
        if (!((getSides().get(0).equals(getSides().get(1))) && (getSides().get(1).equals(getSides().get(2)))))
            return false;
        return true;
    }

    /**
     * compare this object with this shape depends on sides .
     * @param o object to be checked
     * @return true if are equal else false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        return super.equals(o);
    }
}