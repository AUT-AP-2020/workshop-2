/**
 * This class is subclass of polygon saves information of 
 * rectaangle such as sides and 
 * calculate area
 * @author Mohammad Hassannejadi
 * @version 1.0
 */
public class Rectangle extends Polygon{
    /**
     * The constructor of the class.
     *
     * @param var the sides
     */
    public Rectangle(double... var){
        super(var);
    }
    
    @Override
    public double calculateArea(){
        return sides.get(0)*sides.get(1);
    }
    /**
     * To see if the triangle is equilateral.
     *
     * @return true or false
     */
    public boolean isSquare(){
        return sides.get(0).equals(sides.get(1)) && sides.get(1).equals(sides.get(2)) && sides.get(2).equals(sides.get(3));
    }
    /**
     * override of draw method in shape class
     */
    @Override
    public void draw() {
        System.out.print("Rectangle ");
        if(isSquare())
            System.out.println("and square");
        else
            System.out.println();
        System.out.println("perimeter:"+calculatePerimeter()+" area:"+calculateArea());
        
    }
    /**
     * override of tostring method
     */
    @Override
    public String toString() {
        return "Rectangle\nside 1 = " + sides.get(0) + ", side 2 = " + sides.get(1) + ", side 3 = " + sides.get(2) + ", side 4 = " + sides.get(3);
    }
}