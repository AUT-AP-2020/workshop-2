import java.util.ArrayList;
/**
 * this class represents a Rectangle class .
 * @version 0.0
 * @author Mahdi Mirfendereski
 */

public class Rectangle {
    //4 sides
    private ArrayList<Double> sides ;

    /**
     * create new Array list to contain sides
     * @param s1 side 1
     * @param s2 side 2
     * @param s3 side 3
     * @param s4 side 4
     */
    public Rectangle(double s1,double s2,double s3,double s4) {
        sides=new ArrayList<>(4);
        sides.add(s1);
        sides.add(s2);
        sides.add(s3);
        sides.add(s4);
    }

    /**
     *
     * @return list of sides
     */
    public ArrayList<Double> getSides() {
        return sides;
    }

    /**
     * to check if it is square or not
     * @return true if it is square
     */
    public boolean isSquare(){
        if(sides.get(0).equals(sides.get(1)) && sides.get(1).equals(sides.get(2)) && sides.get(2).equals(sides.get(3)))
            return true ;
        return false ;
    }

    /**
     * calculating rectangle's Perimeter
     * @return rectangle's Perimeter
     */
   public double calculatePerimeter(){
        double sum=0;
        for (Double i:sides) {
            sum += i;
        }
       return sum;
   }

    /**
     * calculating rectangle's Area
     * @return rectangle's Area
     */
   public double calculateArea(){
        double s1=sides.get(0);
        for(Double d:sides){
            if(d!=s1)
                return d*s1;
        }
        if(isSquare())
            return sides.get(0)*sides.get(0);
        return 0;
    }

    /**
     * draw a rectangle in a line
     */
    public void draw(){
        System.out.println("Rectangle    Perimeter="+this.calculatePerimeter()+"    Area="+this.calculateArea());
    }

    /**
     * note : parameter of this method is Rectangle type not Object type.
     * @param rectangle Rectangle type
     * @return true if rectangle and this object are equal.
     */
    public boolean equals(Rectangle rectangle){
        if(this==rectangle)
            return true;
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

    @Override
    public String toString() {
        return "Rectangle{" +
                "sides=" +sides.get(0) +","+ sides.get(1)+","+ sides.get(2)+","+ sides.get(3)+
                '}';
    }
}

