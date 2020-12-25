import java.util.Objects;
/**
 * Triangle is a subclass of shape to save special behavior of circle
 * @author setayesh
 * @version 0.1
 */
public class Circle extends Shape{
    private int radius;
    private final double PI = 3.14;
    /**
     * make a circle by valid radius. if the radius is smaller or equal to 0 , would ignore the action.
     * @param radius radius of circle
     */
    public Circle(int radius) {
        this.radius = radius;
    }


    /**
     * @return radius the radius
     */
    public int getRadius() {
        return radius;
    }

    /**
     * calculate perimeter of circle
     * @return perimeter
     */
    public double calculatePerimeter(){
        double perimeter = 2.0*PI*getRadius();
        return perimeter;
    }

    /**
     * calculate area
     * @return area
     */
    public double calculateArea(){
        return PI*getRadius()*getRadius();//auto casting because of PI
    }

    /**
     * show information of a circle
     */
    public void draw(){
        System.out.println("\ncircle:\nArea: " + calculateArea() + "\nPerimeter: " + calculatePerimeter());
    }

    /**
     * override of equals method to compare two shapes
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return getRadius() == circle.getRadius();
    }

    /**
     * override of to string method to change to a suitable format
     */
    @Override
    public String toString() {
        return "Circle:\nRadius: ";
    }
}