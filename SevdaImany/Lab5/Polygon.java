import java.util.ArrayList;

/**
 * The super class of the Rectangle and Triangle
 * 
 * @author sevda imany
 * @version 0.0
 */
public class Polygon extends Shape {
    // sides of polygon
    ArrayList<Double> sides;

    /**
     * Create new polygon with given sides
     * @param sides
     */
    public Polygon(double... sides) {
        this.sides = new ArrayList<>();

        for (double side : sides)
            this.sides.add(side);
    }

    
    /** 
     * @return sides
     */
    public ArrayList<Double> getSides() {
        return sides;
    }

    
    /** 
     * Check the given polygon sides with this polygon
     * @param o
     * @return boolean
     */
    @Override
    public boolean equals(Object o) 
    {
        if (this == o) 
            return true;

        if (!(o instanceof Polygon)) 
            return false;

        
        // cast the given object
        Polygon givenPolygon = (Polygon)o;


        if (this.sides.size() != givenPolygon.sides.size())
            return false;

        
        for (int i = 0; i < sides.size(); i++)
            if (!this.sides.get(i).equals(givenPolygon.sides.get(i)))
                return false;


        return true;
    }

    
    /** 
     * this method calculate perimeter
     * @return 
     */
    public double calculatePerimeter() {
        double perimeter = 0;

        for (double side : sides)
            perimeter += side;

        return perimeter;
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        String m ="";
        int n = 1;
        String s = "";
        for(double side : sides){
         m += " "+ s + "sides" + n +": "+ side + ",";
         n++;
        }
        return m;
    }

}