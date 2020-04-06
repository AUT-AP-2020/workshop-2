import java.util.ArrayList;
import java.util.Objects;

/**
 * shape of triangle
 */
public class Triangle extends Polygon {

    /**
     * makes a valid triangle . if the sides are not valid, the construction would be ignored.
     * @param side sides of this triangle
     */
    public Triangle(double... side) {
        super(side);
        if(!validInput(side)) {
            System.out.println("not valid.you cant make a triangle by this sides");
            sides.clear();
        }
    }

    /**
     * checks this inputs to be valid for making a triangle
     * @param sides 3 sides of this triangle
     * @return true if is valid else false
     */
    private boolean validInput(double... sides)
    {
        if(sides.length == 0) return false;
        if (sides[0] + sides[1] <= sides[2]) return false;
        if( sides[2] + sides[1] <= sides[0]) return false;
        return !( sides[2] + sides[0] <= sides[1]) ;
    }


    /**
     * calculate the area of this triangle
     * @return area of this triangle
     */
    public double calculateArea()
    {
        if(sides.size() == 0 )
            return 0;
        double perimeter = calculatePerimeter()/2;
        return Math.pow( ( perimeter * (perimeter-sides.get(0)) * (perimeter-sides.get(1)) * (perimeter- sides.get(2)) ) , 0.5);
    }

    /**
     * prints the kind , perimeter and area of this triangle
     */
    public void draw()
    {
        System.out.println("Triangle "+ (isEquilateral()?" (equilateral)": "" ) +" :   Perimeter: " + calculatePerimeter() + "  Area: " + calculateArea());
    }

    /**
     * return kind  and sizes of this triangle.
     * @return String that contains kind  and sizes of this triangle
     */
    @Override
    public String toString() {
        try {
            return "Triangle "+ (isEquilateral()?" (equilateral)": "" ) +" sides:   " + sides.get(0) + "    " + sides.get(1) + "    " + sides.get(2) ;
        }catch (IndexOutOfBoundsException e)
        {
            return "not valid Triangle";
        }
    }


    /**
     * checks if all sides are equal
     * @return true if equals else false.
     */
    public boolean isEquilateral ()
    {
        return sides.get(0).equals(sides.get(1)) && sides.get(1).equals(sides.get(2));
    }

    /**
     * compare this object with this shape depends on sides .
     * @param o object to be checked
     * @return true if are equal else false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        return super.equals(o);
    }
}
