/**
 * this is a super class for circle and polygon 
 * and calculate perimeter and area
 * @author Mohammad Hassannejadi
 * @version 1.0
 */
public class Shape{

    /**
     * calculate perimeter as super class
     */
    public double calculatePerimeter(){
        return 0;
    }
    /**
     * calculate perimeter as super class
     */
    public double calculateArea(){
        return 0;
    }
    /**
     * an empty method that overrides in subclasses
     */
    public void draw(){
    }
    
    /**
     * an override of equals method
     */
    @Override
    public boolean equals(Object obj){
        return super.equals(obj);
    }
    /**
     * an override of tostring method
     */
    @Override
    public String toString(){
        return super.toString();
    }

}