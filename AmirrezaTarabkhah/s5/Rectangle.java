import java.util.ArrayList;

public class Rectangle extends Polygon {

    public Rectangle(int a, int b) {super(a, b);}

    @Override
    public double calculateArea(int... nums) {
        int i = 1;
        for (int n : nums)
            i *= n;
        return i;
    }

    @Override
    public double calculatePerimeter(int... nums){
        double i = 0;
        for (int n : nums)
            i += n;
        return i;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle - Area = " + calculateArea(sides.get(0), sides.get(1)) + " - Perimeter = " + calculatePerimeter(sides.get(0), sides.get(1)));
    }

    @Override
    public ArrayList<Integer> getSides() {
        return sides;
    }

    @Override
    public boolean equals(Shape shape) {
        int p = 0;
        for (int i = 0; i < 1; i++)
        {
            for (int j = 0; j < 1; j++) {
                if (shape.getSides().get(i) == sides.get(j))
                    p++;
            }
        }
        if (p == 2){
            if (!isSquare())
                if (!(shape.getSides().get(0) == shape.getSides().get(1)))
                    return true;
        }
        if (p == 4)
            return true;
        return false;
    }

    public boolean isSquare(){
        if (sides.get(0) == sides.get(1))
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "Rectangle :" + " Side 1 = " + sides.get(0) + " Side 2 = " + sides.get(1);
    }
}
