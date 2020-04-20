import java.util.ArrayList;
import java.util.Objects;

public class Rectangle {
    private ArrayList<Integer> sides=new ArrayList<>();

    public Rectangle(int a,int b,int c,int d){
        sides.add(a);
        sides.add(b);
        sides.add(c);
        sides.add(d);
    }

    public double calculatePerimeter(){
        double sum=0;
        for(Integer side:sides){
            sum+=side;
        }
        return sum;
    }
    public double calculateArea(){
        if(sides.get(0)==sides.get(1)){
            return sides.get(0)*sides.get(2);
        }else{
            return sides.get(0)*sides.get(1);
        }
    }
    public void draw(){
        System.out.println(this.getClass().getName());
        System.out.println("Perimeter = "+calculatePerimeter());
        System.out.println("Area = "+calculateArea());
    }
    public ArrayList<Integer> getSides() {
        return sides;
    }

    public boolean isSquare(){
        if(sides.get(0)==sides.get(1) && sides.get(1)==sides.get(2) && sides.get(2)==sides.get(3)){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sides=" + sides +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Objects.equals(sides, rectangle.sides);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sides);
    }
}
