
/**
 * This class repersent a Shape in paint class
 * 
 * @author Mohammad Mahdi Malmasi
 * @version 0.1.0
 */
public class Shape 
{

            /*  Methods  */

    /**
     * This method shuold {@code Override} in sub classes
     * 
     * @return 0 if the sub classes doesn't Override this method
     */
    public double calculatePerimeter()
    {
        return 0;
    }


    /**
     * This method shuold {@code Override} in sub classes
     *
     * @return 0 if the sub classes doesn't Override this method
     */
    public double calculateArea()
    {
        return 0;
    }


    /**
     * This method print the details of the shape
     */
    public void draw()
    {
        System.out.println("Area: " + calculateArea() + ", Perimeter: " + calculatePerimeter());
    }


    /**
     * @return the class of this shape
     */
    @Override
    public String toString()
    {
        return "" + this.getClass();
    }
}