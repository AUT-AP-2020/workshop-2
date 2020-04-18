import java.util.ArrayList;
import java.util.Objects;

/**
 * This class saves information of triangle such as sides and 
 * calculate area and perimeter 
 * @author Mohammad Hassannejadi
 * @version 1.0
 */
public class Triangle {
    private ArrayList<Double> sides;
    /**
     * constructor to add sides
     * @param side1
     * @param side2
     * @param side3
     */
    public Triangle(double side1, double side2, double side3) {
        sides = new ArrayList<Double>();
        sides.add(side1);
        sides.add(side2);
        sides.add(side3);
    }

    /**
     * getter of list of sides
     * @return sides arraylist
     */
    public ArrayList<Double> getSides() {
        return sides;
    }

    /**
     * check "is this triangle , equilateral?"
     * @return true if is equilaterl
     */
    public boolean isEquilateral(){
        return sides.get(0).equals(sides.get(1)) && sides.get(1).equals(sides.get(2));
    }

    /**
     * calculate perimater 
     * @return perimeter
     */
    public double calculatePerimeter(){
        return sides.get(0) + sides.get(1) + sides.get(2);
    }

    /**
     * calculate area
     * @return area
     */
    public double calculateArea(){
        double hp = calculatePerimeter() / 2; // half of perimeter
        double area = Math.sqrt(hp * (hp - sides.get(0)) * (hp - sides.get(1)) * (hp - sides.get(2))); //Heron formula
        return area;
    }

    /**
     * show information of a triangle
     */
    public void draw(){
        System.out.print("triangle:\nArea: " + calculateArea() + " Perimeter: " + calculatePerimeter());
        System.out.println();
        if(isEquilateral())
            System.out.println("is a equilateral" );
        else{}
        
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
        Triangle triangle = (Triangle) obj;
        return sides.equals(triangle.sides);
    }
    /**
     * override of to string method to change to a suitable format
     */
    @Override
    public String toString() {
        return "Triangle\nside 1 = " + sides.get(0) + ", side 2 = " + sides.get(1) + ", side 3 = " + sides.get(2);
    }
}
