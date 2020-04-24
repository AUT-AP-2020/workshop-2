


/**
 * This class repersent a Triangle in paint class
 * 
 * @author Mohammad Mahdi Malmasi
 * @version 0.1.0
 */
public class Triangle extends Polygon 
{

            /* Constructor */
    /**
     * Create a new triangle with given sides
     *
     * @param sides : the sides of the triangle
     */
    public Triangle(double...sides)
    {
        super(sides);
    }




            /*  Methods  */

    /**
     * @return {@code true} if this triangle is equilateral
     */
    public boolean isEquilateral()
    {
        return (sides.get(0).equals(sides.get(1)) && sides.get(1).equals(sides.get(2)));
    }


    /**
     * Calculate the area of this triangle
     * 
     * @return the area of this triangle
     */
    @Override
    public double calculateArea() 
    {
        // from a formula in geometry: S = √p(p-a)(p-b)(p-c)
        // and p = perimeter/2

        double p = calculatePerimeter() / 2;
        double hold = p * (p - sides.get(0)) * (p - sides.get(1)) * (p - sides.get(2));
        return Math.sqrt(hold);
    }


    /**
     * This method print the details of this triangle
     */
    @Override
    public void draw() 
    {
        System.out.print("a Triangle:");
        super.draw();
    }


    /**
     * This method check the given triangle sides with this triagle
     * 
     * @return {@code true} if these triangles repersent a same triangle
     */
    @Override
    public boolean equals(Object o)
    {
        if (this == o) 
            return true;

        if (!(o instanceof Triangle)) 
            return false;

        
        Triangle givenTriangle = (Triangle) o;
        if (this.sides.contains(givenTriangle.sides.get(0))
            &&
            this.sides.contains(givenTriangle.sides.get(1))
            && 
            this.sides.contains(givenTriangle.sides.get(2)))

                return true;


        return false;
    }
}