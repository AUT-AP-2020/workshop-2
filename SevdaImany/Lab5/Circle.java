/**
 * this class represent a circle in paint class
 * 
 * @author sevda imany
 * @version 0.0
 */
public class Circle extends Shape {
    //the circle's radius
    private double radius;
    private final double PI = 3.14159;

    /**
     * create a new circle with given radius
     * @param radius
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    
    /** 
     * get radius
     * @return 
     */
    public double getRadious() {
        return radius;
    }

    
    /** 
     * get circle's perimeter
     * @return 
     */
    public double calculatePerimeter() {
        return 2 * PI * radius;
    }

    
    /** 
     * get circle's area
     * @return 
     */
    public double calculateArea() {
        return PI * radius * radius;
    }

    
    /** 
     * @param o
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (!(o instanceof Circle))
            return false;

        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    @Override
    public void draw() {
        System.out.print("a Circle:");
        super.draw();
    }

    
    /** 
     * @return String
     */
    public String toString() {
        return "" + "radius: " + radius;
    }

}