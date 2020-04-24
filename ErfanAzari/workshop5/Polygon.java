/**
 * This class designed to create polygon shapes
 */

import java.util.ArrayList;
public class Polygon extends Shape {

    //The list of each polygon sides.
    private ArrayList<Double> sides;

    /**
     * The constructor of the class create a polygon shape based on the number of sides.
     * @param args
     */
    public Polygon(Double... args){
        this.sides = new ArrayList<>();
        for (Double d : args)
            sides.add(d);
    }

    /**
     * This method would return the list of sides.
     * @return list of sides
     */
    public ArrayList<Double> getSides(){
        return this.sides;
    }

    /**
     * This method would calculate the perimeter of the polygon shape with the list of sides.
     * @return the perimeter of the shape
     */
    @Override
    public double calculatePerimeter() {
        double perimeter = 0;
        for (Double d : this.getSides())
            perimeter += d;
        return perimeter;
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public void draw() { }

    @Override
    public String toString() {
        if (this.sides.size() == 3)
            System.out.print("Triangle:: ");
        else
            System.out.print("Rectangle:: ");
        int i = 1;
        for ( Double d : this.getSides())
            System.out.print("side" + i++ + ":" + d + ", ");
        System.out.print("\b\b\n");
        return ".";
    }
}
