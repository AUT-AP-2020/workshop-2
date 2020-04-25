/**
 * this class represent a rectangle in paint class
 * 
 * @author sevda imany
 * @version 0.0
 */
public class Rectangle extends Polygon {

    /**
     * create a new rectangle with given sides
     */
    public Rectangle(double... sides) {
        super(sides);
    }

    
    /** 
     * 
     * Check that this rectangle is square or not
     * @return true if the rectangle is square otherwise false
     */
    public boolean isSquare()
    {
        boolean isSquare = sides.get(0).equals(sides.get(1)) && sides.get(0).equals(sides.get(2)) ;
        return isSquare;
    }

    
    /** 
     * Calculate the area of this rectangle
     * @return 
     */
    public double calculateArea() {
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