/**
 * This class repersent a Shape in paint class
 * 
 * @author sevda imany
 * @version 0.0
 */
public class Shape {

    
    /** 
     *  This method shuold Override in sub classes
     * @return 
     */
    public double calculatePerimeter() {
        return 0;
    }

    
    /** 
     *  This method shuold Override in sub classes
     * @return double
     */
    public double calculateArea() {
        return 0;
    }

    /**
     * This method print the details of the shape
     */
    public void draw() {
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println("Area: " + calculateArea());
    }

    
    /** 
     * @return the class of this shape
     */
    @Override
    public String toString() {
        return "" + this.getClass();
    }
}