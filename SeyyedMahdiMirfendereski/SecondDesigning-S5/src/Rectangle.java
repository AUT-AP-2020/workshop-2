import java.util.ArrayList;
/**
 * this class represents a Rectangle generally
 * @author Mahdi Mirfendereski
 * @version 0.0
 */
public class Rectangle extends Polygon {
    /**
     *
     * @param args sides of Rectangle
     */
    public Rectangle(double... args){
        super(args);
    }
    @Override
    public String toString() {
        return "Rectangle:: "+super.toString();
    }
    @Override
    public double calculatePerimeter(){
        double sum=0;
        for (Double i:sides) {
            sum += i;
        }
        return sum;
    }
    @Override
    public double calculateArea(){
        double s1=sides.get(0);
        for(Double d:sides){
            if(d!=s1)
                return d*s1;
        }

        return sides.get(0)*sides.get(0);
    }
    @Override
    public void draw(){
        System.out.print("Rectangle    ");
        super.draw();
    }
    public boolean isSquare(){
        if(sides.get(0).equals(sides.get(1)) && sides.get(1).equals(sides.get(2)) && sides.get(2).equals(sides.get(3)))
            return true ;
        return false ;
    }
    @Override
    public boolean equals(Shape shape){
        if(this==shape)
            return true;
        if(!(shape instanceof Rectangle))
            return false;
        Rectangle rectangle=(Rectangle)shape;
        ArrayList<Double> temp1=new ArrayList<>(4);
        ArrayList<Double> temp2=new ArrayList<>(4);
        temp1.addAll(sides);
        temp2.addAll(rectangle.getSides());
        for(Double d:sides){
            if(!temp2.contains(d))
                return false;
            else
                temp2.remove(d);
        }
        return true;
    }
}
