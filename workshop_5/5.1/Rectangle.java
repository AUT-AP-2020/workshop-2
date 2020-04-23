import java.util.*;


/**
 * Rectangle is a subclass of paint to save special behavior of Rectangle
 * @author setayesh
 * @version 0.1
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
        sides = new ArrayList<>();
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
     * @return if is square true
     */
    public boolean isSquare(){
        if (!((getSides().get(0).equals(getSides().get(1))) &&
                (getSides().get(1).equals(getSides().get(2))) &&
                (getSides().get(2).equals(getSides().get(3)))))
            return false;
        return true;
    }

    /**
     * calculate perimeter of triangle
     * @return perimeter
     */
    public double calculatePerimeter(){
        return getSides().get(0) + getSides().get(1) + getSides().get(2) + getSides().get(3);
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
        System.out.print("\nrectangle:\nArea: " + calculateArea() + "\nPerimeter: " + calculatePerimeter());
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
        return "Rectangle:\nside 1 : " + getSides().get(0) + ", side 2 : " + getSides().get(1) + ", side 3 : " + getSides().get(2) + ", side 4 : " + getSides().get(3);
    }
}