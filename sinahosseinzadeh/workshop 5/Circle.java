import java.util.ArrayList;
import java.util.Objects;
/**
 *
 */
public class Circle {
    int radius ;

    /**
     *
     * @param Radius it will be the radius of this circle
     */
    public Circle(int Radius)
    {
       this.radius=Radius;
    }

    /**
     *
     * @return it the radius of our circle
     */
    public double getRadius() {
        return radius;
    }

    /**
     *
     * @param radius its going to be the radius of this circle
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }

    /**
     *
     * @return its the perimeter occupied by our circle
     */
    public double calculatePerimeter()
    {
            double Diameter =radius*2;
            double Perimeter = Diameter*Math.PI;
            return Perimeter;

    }

    /**
     *
     * @return its the area occupied by our circle
     */
    public double calculateArea()
    {
        double Area = 0.00;
        Area = (radius*radius)*Math.PI;
        return Area;
    }

    /**
     * it will repreasnt the best info about our shape
     */
    public void draw ()
    {
        System.out.println("*    *    *    *    *    *    *    *    *    *    *    *");
        System.out.println("its a circle");
        System.out.println("radius is : "+radius);
        System.out.println(calculatePerimeter());
        System.out.println(calculateArea());
        System.out.println("*    *    *    *    *    *    *    *    *    *    *    *");
    }
    @Override
    public String toString() {
        return "Circle { " +
                "radius :" + radius +
                "   perimeters : " + calculatePerimeter()+
                "   Area : "+calculateArea()+
                " }";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.getRadius(), getRadius()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRadius());
    }
}
