/**
 * this class represent a triangle in paint class
 * 
 * @author sevda imany
 * @version 0.0
 */
public class Triangle extends Polygon {

    /**
     * create a new triangle with given sides
     * @param sides
     */
    public Triangle(double...sides)
    {
        super(sides);
    }

    
    /** 
     * @return true if this triangle is equilateral otherwise false
     */
    public boolean isEquilateral()
    {
        boolean isEquilateral = sides.get(0).equals(sides.get(1)) && sides.get(1).equals(sides.get(2));
        return isEquilateral;
    }

    
    /** 
     * This method check the given triangle sides with this triagle
     * @param o
     * @return boolean
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
     * Calculate the area of this triangle
     * @return 
     */
    public double calculateArea(){
        double p = calculateArea()/2;
        double area = Math.sqrt(p * (p - sides.get(0)) * (p  - sides.get(1)) * (p  - sides.get(2)));
        return area;
        
    }


}