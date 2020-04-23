import java.util.ArrayList;
/**
 * this class represents a Triangle class .
 * @version 0.0
 * @author Mahdi Mirfendereski
 */
public class Triangle {
    private ArrayList<Double> sides ;

    /**
     * create new Array list to contain sides
     * @param s1 side 1
     * @param s2 side 2
     * @param s3 side 3
     *
     */
    public Triangle(double s1,double s2,double s3) {
        sides=new ArrayList<>(3);
        sides.add(s1);
        sides.add(s2);
        sides.add(s3);
    }

    /**
     * @return list of sides
     */
    public ArrayList<Double> getSides() {
        return sides;
    }

    /**
     * to check if it is equilateral
     * @return true if it is equilateral
     */
    public boolean isEquilateral(){
        if(sides.get(0).equals(sides.get(1)) && sides.get(1).equals(sides.get(2)))
            return true ;
        return false ;
    }

    /**
     * calculating Triangle's Perimeter
     * @return Triangle's Perimeter
     */
    public double calculatePerimeter(){
        double sum=0;
        for (Double i:sides) {
            sum += i;
        }
        return sum;
    }

    /**
     * calculating Triangle's Area
     * @return Triangle's Area
     */
    public double calculateArea(){

        double s =calculatePerimeter()/2;
        return Math.sqrt(s*(s-sides.get(0))*(s-sides.get(1))*(s-sides.get(2)));
    }
    /**
     * draw a Triangle in a line
     */
    public void draw(){
        System.out.println("Triangle    Perimeter="+this.calculatePerimeter()+"    Area="+this.calculateArea());
    }
    /**
     * note : parameter of this method is Triangle type not Object type.
     * @param triangle Rectangle type
     * @return true if triangle and this object are equal.
     */
    public boolean equals(Triangle triangle){
        if(this==triangle)
            return true;
        ArrayList<Double> temp1=new ArrayList<>(3);
        ArrayList<Double> temp2=new ArrayList<>(3);
        temp1.addAll(sides);
        temp2.addAll(triangle.getSides());
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
        return "Triangle{" +
                "sides=" +sides.get(0) +","+ sides.get(1)+","+ sides.get(2)+
                '}';
    }
}
