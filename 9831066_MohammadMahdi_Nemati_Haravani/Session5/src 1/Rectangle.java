import java.util.ArrayList;
import java.util.Objects;

public class Rectangle {

    private ArrayList<Double> sides;

    /**
     * constructor which creat a ArrayList and add sides of Rectangle
     * @param length1 the Length of Rectangle
     * @param width1 the Width of Rectangle
     * @param length2 the Length of Rectangle
     * @param width2 the Width of Rectangle
     */
    public Rectangle(Double length1,Double width1,Double length2,Double width2){
        sides = new ArrayList<>();
        sides.add(length1);
        sides.add(width1);
        sides.add(length2);
        sides.add(width2);
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
     * @return the value of length is equals width
     */
    public boolean isSquare(){
        return sides.get(0).equals(sides.get(1));
    }

    /**
     *
     * @return the Perimeter of Rectangle
     */
    public double calculatePerimeter() {
        return 2 * (sides.get(0) + sides.get(1));
    }

    /**
     *
     * @return the Area of Rectangle
     */
    public double calculateArea(){
        return sides.get(0) * sides.get(1);
    }

    /**
     *  show the type and Perimeter and Area of Rectangle
     */
    public void draw(){
        System.out.println("Type : Rectangle" + " Perimeter: " + calculatePerimeter() + " Area: " + calculateArea());
    }

    /**
     *
     * @param toCompere the compere Rectangle information
     * @return the value of this two Rectangle is the same or not
     */
    @Override
    public boolean equals(Object toCompere) {
        return Objects.equals(sides, ((Rectangle) toCompere).sides);
    }

    /**
     *
     * @return a String which contains the type , length and width of Rectangle
     */
    @Override
    public String toString(){
        return "Type : Rectangle" + " length : " + sides.get(0) + " width : " + sides.get(1);
    }

}
