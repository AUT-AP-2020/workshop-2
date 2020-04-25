import java.util.ArrayList;


/**
 * The super class of the {@code Rectangle} and {@code Triangle}
 * 
 * @author Mohammad Mahdi Malmasi
 * @version 0.1.0
 */
public class Polygon extends Shape 
{
            /*  Feilds  */

    // sides of polygon
    protected ArrayList<Double> sides;





         /* Constructor */

    /**
     * Create new polygon with given sides
     *
     * @param sides : the sides of the new polygon
     */
    public Polygon(double...sides)
    {
        this.sides = new ArrayList<>();

        
        for (double side : sides)
        {
            this.sides.add(side);
        }
    }





            /*  Methods  */

    /**
     * @return the polygon sides
     */
    public ArrayList<Double> getSides() 
    {
        return sides;
    }


    /**
     * perimeters = sum of the sides
     *
     * @return the perimeter of this polygon
     */
    @Override
    public double calculatePerimeter() 
    {
        double perimeter = 0;

        for(Double side : sides)
            perimeter += side;

        return perimeter;
    }


    /**
     * Check the given polygon sides with this polygon
     * 
     * @return {@code true} if the given polygon sides is equal with this polygon
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
     * @return the lenght of the sides in a {@code String}
     */
    @Override
    public String toString() 
    {
        String output = "";
        int numberOfSide = 1;
       
        for(double side : sides)
        {
         m += "side" + n +": "+ side + ", ";
         n++;
        }
        return m;
    }
}
