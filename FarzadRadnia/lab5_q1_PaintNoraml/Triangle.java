import java.util.ArrayList;
import java.util.Objects;

/**
 * shape of triangle
 */
public class Triangle {

    private ArrayList<Double> sides;

    /**
     * makes a valid triangle . if the sides are not valid, the construction would be ignored.
     * @param side sides of this triangle
     */
    public Triangle(double... side) {
        sides = new ArrayList<>();

        if(validInput(side))
            for(Double tempSide : side)
                sides.add(tempSide);
            else
            System.out.println("not valid.you cant make a triangle by this sides");
    }

    /**
     * checks this inputs to be valid for making a triangle
     * @param sides 3 sides of this triangle
     * @return true if is valid else false
     */
    private boolean validInput(double... sides)
    {
        if (sides[0] + sides[1] <= sides[2]) return false;
        if( sides[2] + sides[1] <= sides[0]) return false;
        return !( sides[2] + sides[0] <= sides[1]) ;
    }

    /**
     * calculate the perimeter of this class
     * @return perimeter of this triangle
     */
    public double calculatePerimeter()
    {
        double perimeter = 0;
        for (Double side : sides)
            perimeter += side;
        return perimeter;
    }

    /**
     * calculate the area of this triangle
     * @return area of this triangle
     */
    public double calculateArea()
    {
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
        return "Triangle "+ (isEquilateral()?" (equilateral)": "" ) +" sides:   " + sides.get(0) + "    " + sides.get(1) + "    " + sides.get(2) ;
    }

    /**
     * get the sides of this triangle
     * @return sides of this triangle
     */
    public ArrayList<Double> getSides() {
        return sides;
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
        Triangle triangle = (Triangle) o;
        return getSides().equals(triangle.getSides());
    }

    /**
     * make a hash code
     * @return hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getSides());
    }
}
