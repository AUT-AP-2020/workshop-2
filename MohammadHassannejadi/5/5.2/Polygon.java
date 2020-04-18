import java.util.ArrayList;
import java.util.Objects;

/**
 * this is a subclass fo shape class and a super class for triangle and rectangle
 * and contains some methods such as calculate perimeter and etc.
 * @author Mohammad Hassannejadi
 * @version 1.0
 */
public class Polygon extends Shape{
    ArrayList<Double> sides;
    public Polygon(double... var){
        sides = new ArrayList<Double>();
        for(double n : var){
            sides.add(n);
        }
    }
    /**
     * an override of calculate perimeter 
     */
    @Override
    public double calculatePerimeter() {
        double p = 0;
        for(double n : sides){
            p+=n;
        }
        return p;
    }
    /**
     * an override of tostring method
     */
    @Override
    public String toString(){
        int count = 1;
        String format = null;
        if(sides.size()==3){
            format+="triangle:\n";
        }
        else if(sides.size()==4){
            format+="rectangle:\n";
        }
        for(double side : sides){
            format = format +"side"+count+":"+side;
        }
        return format;
    }

    public ArrayList<Double> getSides(){
        return sides;
    }
    /**
     * an override of equals method
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) 
            return true;
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) 
            return false;
        Polygon polygon = (Polygon) obj;
        return Objects.equals(sides, polygon.sides);
    }
}
