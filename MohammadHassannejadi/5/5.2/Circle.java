/**
 * This class save information of 
 * a circle such as radius and calculate its 
 * perimeter and area
 * @author Mohammad Hassannejadi
 * @version 1.0
 */
public class Circle extends Shape{

    private double radius;
    private final double PI = 3.14;
    /**
     * constructor to assign radius first time
     * @param radius radius
     */
    public Circle(double radius){
        this.radius = radius;
    }
    /**
     * getter of radius
     * @return radius
     */
    public double getRadius(){
        return radius;
    }
    /**
     * calculate perimater of circle
     * @return perimeter
     */
    @Override
    public double calculatePerimeter(){
        return 2.0 * PI * radius ; 
    }
    /**
     * calculate area
     * @return area
     */
    @Override
    public double calculateArea(){
        return PI * radius * radius;
    }
    /**
     * show information of a circle
     */
    @Override
    public void draw(){
        System.out.println("Circle:");
        System.out.println("Perimter:"+calculatePerimeter()+" , Area:"+calculateArea());
    }
    /**
     * override of to string method to change to a suitable format
     */
    @Override
    public String toString(){
        return "Circle with radius: "+radius;
    }
    /**
     * override of equals method to compare two shapes
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }
}