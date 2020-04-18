import java.util.*;


/**
 * This class saves information of rectaangle such as sides and 
 * calculate area and perimeter 
 * @author Mohammad Hassannejadi
 * @version 1.0
 */
public class Rectangle {
    private ArrayList<Double> sides;
    /**
     * constructor to add sides
     * @param side1
     * @param side2
     * @param side3
     * @param side4
     */
    public Rectangle(double side1 , double side2 , double side3 ,double side4){
        sides = new ArrayList<Double>();
        sides.add(side1);
        sides.add(side2);
        sides.add(side3);
        sides.add(side4);
    }

    /**
     * getter of list of sides
     * @return sides arraylist
     */
    public ArrayList<Double> getSides() {
        return sides;
    }

    /**
     * check "is a rectangle square?""
     * @return if is square true
     */
    public boolean isSquare(){
        return sides.get(0).equals(sides.get(1)) && sides.get(1).equals(sides.get(2)) && sides.get(2).equals(sides.get(3));
    }

    /**
     * calculate perimater of triangle
     * @return perimeter
     */
    public double calculatePerimeter(){
        return sides.get(0) + sides.get(1) + sides.get(2) + sides.get(3);
    }

    /**
     * calculate area
     * @return area
     */
    public double calculateArea(){
        return sides.get(0)*sides.get(1);
    }

    /**
     * show information of a triangle
     */
    public void draw(){
        System.out.print("rectangle:\nArea: " + calculateArea() + " Perimeter: " + calculatePerimeter());
        System.out.println();
        if(isSquare())
            System.out.print("is a square." );
        else
            System.out.print("isn't square");
        System.out.println();
    }
    /**
     * override of equals method to compare two shapes
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) 
            return true;
        if (obj == null || getClass() != obj.getClass()) 
            return false;
        Rectangle rectangle = (Rectangle) obj;
        return Objects.equals(sides, rectangle.sides);
    }
    /**
     * override of to string method to change to a suitable format
     */
    @Override
    public String toString() {
        return "Rectangle:\nside 1 : " + sides.get(0) + ", side 2 : " + sides.get(1) + ", side 3 : " + sides.get(2) + ", side 4 : " + sides.get(3);
    }
}
