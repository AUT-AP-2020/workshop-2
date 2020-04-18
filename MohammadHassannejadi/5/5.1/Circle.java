import java.util.Objects;

/**
 * This class save information of 
 * a circle such as radius and calculate its 
 * perimeter and area
 * @author Mohammad Hassannejadi
 * @version 1.0
 */
public class Circle {
    private int radius;
    private final double PI = 3.14;
    
    /**
     * constructor to assign radius first time
     * @param radius radius
     */
    public Circle(int radius){
        this.radius = radius;
    }

    /**
     * getter of radius
     * @return radius
     */
    public int getRadius() {
        return radius;
    }

    /**
     * calculate perimater of circle
     * @return perimeter
     */
    public double calculatePerimeter(){
        return 2.0*PI*(double)getRadius();
    }

    /**
     * calculate area
     * @return area
     */
    public double calculateArea(){
        return PI*(double)getRadius()*(double)getRadius();
    }

    /**
     * show information of a circle
     */
    public void draw(){
        System.out.println("circle:\nArea: " + calculateArea() + " Perimeter: " + calculatePerimeter());
    }

    /**
     * override of equals method to compare two shapes
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) 
            return true;
        if (obj == null || getClass() != obj.getClass()) 
            return false;
        Circle circle = (Circle) obj;
        return radius == circle.radius;
    }
    /**
     * override of to string method to change to a suitable format
     */
    @Override
    public String toString() {
        return "Circle:\nRadius: " + radius;
    }
}
