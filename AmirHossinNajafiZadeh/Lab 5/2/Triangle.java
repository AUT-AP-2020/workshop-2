package com.myPack;

/**
 * This class is a subclass of the
 * polygon class.
 * Calculation of the area is different
 * in this class so we override it.
 *
 */
public class Triangle extends Polygon {
    /**
     * The constructor of the class.
     *
     * @param v the sides
     */
    public Triangle(double ...v){
        super(v);
    }
    /**
     * To see if the triangle is equilateral.
     *
     * @return true or false
     */
    public boolean isEquilateral(){
        return sides.get(0).equals(sides.get(1)) && sides.get(1).equals(sides.get(2));
    }

    @Override
    public double calculateArea() {
        //The half of the perimeter
        double p = calculatePerimeter() / 2;
        double area = p * (p - sides.get(0)) * (p - sides.get(1)) * (p - sides.get(2));
        return Math.sqrt(area);
    }

    @Override
    public void draw() {
        System.out.print("This Shape Is A Triangle ");
        super.draw();
        if(isEquilateral())
            System.out.print(". This Shape Is A Equilateral Triangle.\n" );
        else
            System.out.print(".\n");
    }

    @Override
    public String toString() {
        return "Triangle { " +
                " side 1 = " + sides.get(0) + ", side 2 = " + sides.get(1) + ", side 3 = " + sides.get(2) +
                " }";
    }
}
