import java.util.ArrayList;

/**
 * @author Ali Ansari
 * @version 1.0.0
 * Triangle class extend to Polygon
 */
public class Triangle extends Polygon {
    public Triangle(int side1,int side2,int side3) {
        sides.add(side1);
        sides.add(side2);
        sides.add(side3);
    }

    /**
     * Check triangle is equilateral or not
     * @return A boolean
     */
    public boolean isEquilateral(){
        return sides.get(0).equals(sides.get(1)) && sides.get(1).equals(sides.get(2));
    }

    @Override
    public String toString() {
        return "Triangle::"+sides.toString();
    }

    @Override
    public double calculateArea() {
        double p=((double)sides.get(0)+sides.get(1)+sides.get(2))/2;
        double area=p*(p-sides.get(0))*(p-sides.get(1))*(p-sides.get(2));
        area=Math.sqrt(area);
        return area;
    }
    public void draw() {
        System.out.println("Triangle Area:"+calculateArea()+" Perimeter:"+calculatePerimeter());
    }
}
