import  java.util.ArrayList;

public class Polygon extends Shape {
    protected ArrayList<Integer> sides;

    public Polygon(Integer... sides) {
        this.sides = new ArrayList<>();
        for (Integer side : sides) {
            this.sides.add(side);
        }
    }

    public ArrayList<Integer> getSides() {
        return sides;
    }

    public double calculatePerimeter() {
        double sum = 0;
        for (Integer side : sides) {
            sum += side;
        }
        return sum;
    }

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
    public boolean isEqual(){
        Integer s1 = sides.get(0);
        for (int i = 1; i < sides.size() ; i++) {
            if (!s1.equals(sides.get(i))){
                return false;
            }
        }
        return true;
    }
}
