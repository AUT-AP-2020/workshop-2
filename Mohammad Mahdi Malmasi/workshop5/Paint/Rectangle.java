
/**
 * This class repersent a Rectangle in paint class
 * 
 * @author Mohammad Mahdi Malmasi
 * @version 0.1.0
 */
public class Rectangle extends Polygon 
{

         /* Constructor */

    /**
     * Create a new rectangle with given sides
     *
     * @param sides : the sides of the new 
     */
    public Rectangle(double...sides)
    {
        super(sides);
    }





            /*  Methods  */

    /**
     * Check that this rectangle is square or not
     *
     * @return {@code true} if this rectangle is a square
     */
    public boolean isSquare()
    {
        return sides.get(0).equals(sides.get(1)) && sides.get(0).equals(sides.get(2));
    }


    /**
     * Calculate the area of this rectangle
     * 
     * @return the area of this rectangle
     */
    @Override
    public double calculateArea() 
    {
        return sides.get(0) * sides.get(1);
    }


    /**
     * This method print the details of this rectangle
     */
    @Override
    public void draw() {
        System.out.print("a Rectangle:");
        super.draw();
    }
}