package com.myPack;

/**
 * This is a subclass of polygon.
 * Calculation of area and draw are different
 * for this class so we override them.
 *
 */
public class Rectangle extends Polygon {
    /**
     * The constructor of the class.
     *
     * @param v the sides
     */
    public Rectangle(double ...v){
        super(v);
    }
    /**
     * To check if the Shape is a square.
     *
     * @return true or false
     */
    public boolean isSquare(){
        return sides.get(0).equals(sides.get(1)) && sides.get(1).equals(sides.get(2)) &&
                sides.get(2).equals(sides.get(3));
    }

    @Override
    public double calculateArea() {
        return sides.get(0) * sides.get(1);
    }

    @Override
    public void draw() {
        System.out.print("This Shape Is A Rectangle ");
        super.draw();
        if(isSquare())
            System.out.print(". And It Is A Square.\n");
        else
            System.out.print(".\n");
    }

    @Override
    public String toString() {
        return "Rectangle { " +
                "side 1 = " + sides.get(0) + ", side 2 = " + sides.get(1) + ", side 3 = " + sides.get(2) + ", side 4 = " + sides.get(3) +
                " }";
    }
}
