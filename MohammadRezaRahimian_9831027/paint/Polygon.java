package paint;

import java.util.ArrayList;

public class Polygon extends Shape {
    ArrayList<Integer> sides ;
    public Polygon(Integer... args){
        sides = new ArrayList<>();
        for (Integer arg : args){
            sides.add(arg);
        }
    }

    public ArrayList<Integer> getSides() {
        return sides;
    }
    public boolean isEqual(){
        Integer s1 = sides.get(0);
        for (int i = 1; i < sides.size() ; i++) {
            if (!s1.equals(sides.get(i))){
                return false;
            }
        }
        return true;
    }
    @Override
    public double calculatePerimeter() {
        int sum = 0;
        for (Integer integer : sides){
            sum+=integer;
        }
        return sum;
    }

    @Override
    public void Draw() {
        if (this instanceof Rectangle){
            if (this.isEqual()){
                System.out.println(" s = " + this.calculateArea() + " , p = " + this.calculatePerimeter());
            }
            else {
                System.out.println(" s = " + this.calculateArea() + " , p = " + this.calculatePerimeter());
            }
        }
        else {
            if (this.isEqual()){
                System.out.println(" s = " + this.calculateArea() + " , p = " + this.calculatePerimeter());
            }
            else {
                System.out.println(" s : " + this.calculateArea() + " , p = " + this.calculatePerimeter());
            }
        }
    }
}
