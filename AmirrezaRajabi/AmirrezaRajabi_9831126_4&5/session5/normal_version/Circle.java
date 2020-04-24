import java.util.ArrayList;

/**
 * Circle class represent circle
 */

public class Circle
{
    //radius of circle
    private int radius;

    /**
     * create a circle
     * @param radius radius of circle
     */
    public Circle(int radius)
    {
        this.radius = radius;
    }
    /**
     * get radius of circle
     * @return radius
     */
    public int getRadius() {
        return radius;
    }

    /**
     * calculate perimeter of circle: 2 * π * radius
     * @return perimeter of circle
     */
    public double calculatePerimeter()
    {
        return 2 * Math.PI * radius;
    }

    /**
     * calculate area of circle: π * radius * radius
     * @return area of circle
     */
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    /**
     * draw with print type and perimeter and area
     */
    public void draw() {
        System.out.println("circle");
        System.out.println("perimeter : " + calculatePerimeter());
        System.out.println("area : " + calculateArea());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Circle circle = (Circle) o;
        return radius == circle.getRadius();
    }

    /**
     * circle to string
     * @return circle to string
     */
    @Override
    public String toString() {
        return "circle (radius = " + radius +")";
    }

}
