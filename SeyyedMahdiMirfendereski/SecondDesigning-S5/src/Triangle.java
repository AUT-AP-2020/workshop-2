import java.util.ArrayList;
/**
 * this class represents a Triangle generally
 * @author Mahdi Mirfendereski
 * @version 0.0
 */
public class Triangle extends Polygon {
    /**
     *
     * @param args sides of Triangle
     */
    public Triangle(double... args){
        super(args);
    }
    @Override
    public String toString() {
        return "Triangle:: "+super.toString();
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

        double s =calculatePerimeter()/2;
        return Math.sqrt(s*(s-sides.get(0))*(s-sides.get(1))*(s-sides.get(2)));
    }
    @Override
    public void draw(){
        System.out.print("Triangle    ");
        super.draw();
    }
    public boolean isEquilateral(){
        if(sides.get(0).equals(sides.get(1)) && sides.get(1).equals(sides.get(2)))
            return true ;
        return false ;
    }
    @Override
    public boolean equals(Shape shape){
        if(this==shape)
            return true;
        if(!(shape instanceof Triangle))
            return false;
        Triangle triangle=(Triangle)shape;
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

}
