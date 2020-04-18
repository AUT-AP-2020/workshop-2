
/**
 * This class saves information of triangle such as sides and 
 * calculate area and perimeter 
 * @author Mohammad Hassannejadi
 * @version 1.0
 */
public class Triangle extends Polygon {
    
    /**
     * The constructor of the class.
     *
     * @param var the sides
     */
    public Triangle(double... var){
        super(var);
    }

    @Override
    public double calculateArea() {
        //The half of the perimeter
        double p = calculatePerimeter() / 2;
        double area = p * (p - sides.get(0)) * (p - sides.get(1)) * (p - sides.get(2));
        return Math.sqrt(area);
    }

    /**
     * To see if the triangle is equilateral.
     *
     * @return true or false
     */
    public boolean isEquilateral(){
        return sides.get(0).equals(sides.get(1)) && sides.get(1).equals(sides.get(2));
    }
    /**
     * override of draw method in shape class
     */
    @Override
    public void draw() {
        System.out.print("Triangle ");
        if(isEquilateral())
            System.out.println("and Equilateral");
        else
            System.out.println();
        System.out.println("perimeter:"+calculatePerimeter()+" area:"+calculateArea());
    }
    /**
     * override of tostring method
     */
    @Override
    public String toString() {
        return "triangle\nside 1 = " + sides.get(0) + ", side 2 = " + sides.get(1) + ", side 3 = " + sides.get(2);
    }
}

