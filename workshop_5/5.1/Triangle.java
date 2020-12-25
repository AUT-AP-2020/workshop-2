import java.util.ArrayList;
import java.util.Objects;

/**
 * Triangle is a subclass of paint to save special behavior of triangle
 * @author setayesh
 * @version 0.1
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
        sides = new ArrayList<>();
        sides.add(side1);
        sides.add(side2);
        sides.add(side3);
    }

    /**
     * @return sides list of sides
     */
    public ArrayList<Double> getSides() {
        return sides;
    }

    /**
     * @return true if is Equilateral
     */
    public boolean isEquilateral(){
        if (!((getSides().get(0).equals(getSides().get(1))) && (getSides().get(1).equals(getSides().get(2)))))
        return false;
        return true;
    }

    /**
     * calculate perimeter
     * @return perimeter
     */
    public double calculatePerimeter(){
        return getSides().get(0) + getSides().get(1) + getSides().get(2);
    }

    /**
     * calculate area
     * @return area
     */
    public double calculateArea(){
        double h = calculatePerimeter() / 2;
        return (Math.sqrt(h * (h - getSides().get(0)) * (h - getSides().get(1)) * (h - getSides().get(2)))); //Heron formula
    }

    /**
     * show information of a triangle
     */
    public void draw(){
        System.out.print("\ntriangle:\nArea: " + calculateArea() + "\nPerimeter: " + calculatePerimeter());
        System.out.println();
        if(isEquilateral())
            System.out.println("is a Equilateral" );
        else
            System.out.println("is'n a Equilateral" );
    }
    /**
     * override of equals method to compare two shapes
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return Objects.equals(getSides(), triangle.getSides());
    }
    /**
     * override of to string method to change to a suitable format
     */
    @Override
    public String toString() {
        return "Triangle\nside 1 = " + getSides().get(0) + ", side 2 = " + getSides().get(1) + ", side 3 = " + getSides().get(2);
    }
}