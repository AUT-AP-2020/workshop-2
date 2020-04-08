import java.util.Objects;

/**
 * shape of circle.
 */
public class Circle {
    private double radius;
    private final double PI = 3.14;


    /**
     * make a circle by valid radius. if the radius is smaller or equal to 0 , would ignore the action.
     * @param radius radius of circle
     */
    public Circle(double radius) {

        if(radius > 0)
            this.radius = radius;
        else
            System.out.println("not possible to make a circle by this radius.");
    }


    /**
     * calculate the perimeter of circle
     * @return perimeter of circle
     */
    public double calculatePerimeter()
    {
        return radius*2*PI;
    }

    /**
     * calculate the area of this circle
     * @return area of this circle
     */
    public double calculateArea()
    {
        return radius*radius*PI;
    }

    /**
     * prints kind , area and perimeter.
     */
    public void draw()
    {
        System.out.println("Circle:  Perimeter: " + calculatePerimeter() + "  Area: " + calculateArea());
    }

    /**
     * make a string that contains kind  of class and radius.
     * @return
     */
    @Override
    public String toString() {
        return "Circle  Radius: " + radius;
    }

    /**
     * get radius of this circle
     * @return radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * checks this object to be same with this circle depends of radius.
     * @param o object to be checked
     * @return true if same else false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.getRadius(), getRadius()) == 0 ;
    }

    /**
     * make a hash code for this object
     * @return hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getRadius(), PI);
    }
}
