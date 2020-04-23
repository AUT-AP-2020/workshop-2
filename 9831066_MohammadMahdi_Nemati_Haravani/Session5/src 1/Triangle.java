import java.util.ArrayList;
import java.util.Objects;

public class Triangle {

    private ArrayList<Double> sides;

    /**
     * constructor which creat an ArrayList and add sides of Triangle
     * @param side1 is the first side of Triangle
     * @param side2 is the second side of Triangle
     * @param side3 is the third side of Triangle
     */
    public Triangle(Double side1 , Double side2 ,Double side3){
        sides = new ArrayList<>();
        sides.add(side1);
        sides.add(side2);
        sides.add(side3);
    }

    /**
     *
     * @return a ArrayList of sides
     */
    public ArrayList<Double> getSides(){
        return sides;
    }

    /**
     *
     * @return the value of three side is equal or not
     */
    public boolean isEquilateral(){
        return sides.get(0).equals(sides.get(1)) && sides.get(0).equals(sides.get(2));
    }

    /**
     *
     * @return the Perimeter of Triangle
     */
    public double calculatePerimeter() {
        return (sides.get(0) + sides.get(1) + sides.get(2));
    }

    /**
     *
     * @return the Area of Triangle
     */
    public double calculateArea(){
        double p = calculatePerimeter() / 2;
        double area = p * (p - sides.get(0)) * (p - sides.get(1)) * (p - sides.get(2));
        return Math.sqrt(area);
    }

    /**
     * show the type and Perimeter and Area of Triangle
     */
    public void draw(){
        System.out.println("Type : Triangle" + " Perimeter: " + calculatePerimeter() + " Area: " + calculateArea());
    }

    /**
     *
     * @param toCompere the compere Triangle information
     * @return the value of this two Triangle is the same or not
     */
    @Override
    public boolean equals(Object toCompere){
        return Objects.equals(sides, ((Triangle) toCompere).sides);
    }

    /**
     *
     * @return a String which contains the type and sides of Triangle
     */
    @Override
    public String toString(){
        return "Type : Triangle" + " side 1 : " + sides.get(0) + " side 2 : " + sides.get(1) + " side 3 : " + sides.get(2);
    }

}
