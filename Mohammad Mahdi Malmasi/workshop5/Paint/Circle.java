



/**
 * This class repersent a Circle in paint class
 * 
 * @author Mohammad Mahdi Malmasi
 * @version 0.1.0
 */
public class Circle extends Shape 
{
            /*  Feilds  */

    // π = 3.14159 ...
    private final double PI = 3.14159;

    // the radius of the circle
    private double radius;







         /* Constructor */

    /**
     * Create a new circle with given radius
     *
     * @param radius : the radius of the circle
     */
    public Circle(double radius)
    {
        this.radius = radius;
    }





            /*  Methods  */

    /**
     * @return the radius of this circle
     */
    public double getRadius() 
    {
        return radius;
    }


    /**
     * Calculate the perimeter of this circle.
     * Circle perimeter = 2πr
     * 
     * @return the perimeter of this circle
     */
    @Override
    public double calculatePerimeter() 
    {
        return 2 * PI * radius;
    }

    
    /**
     * Calculate the area of this circle.
     * Circle area = π(r^2)
     * 
     * @return the area of this circle
     */
    @Override
    public double calculateArea() 
    {
        return PI * radius * radius;
    }


    /**
     * This method print the details of this circle
     */
    @Override
    public void draw() 
    {
        System.out.print("a Circle:");
        super.draw();
    }


    /**
     * Check the radius of given circle with this circle
     * 
     * @return {@code true} if these circles have equal radius
     */
    @Override
    public boolean equals(Object o) 
    {
        if (this == o) 
            return true;

        if (!(o instanceof Circle)) 
            return false;

        
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }
}