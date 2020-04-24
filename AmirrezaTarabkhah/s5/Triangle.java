import java.util.ArrayList;

public class Triangle extends Polygon {

    public Triangle(int a, int b, int c) {super(a, b, c);}

    @Override
    public double calculateArea(int... nums) {
        double i = 0;
        int j = 0;
        int[] m = new int[3];
        for (int n : nums) {
            i += n;
            m[j] = n;
            j++;
        }
        i /= 2;
        i = Math.sqrt(i * (i - m[0]) * (i - m[1]) - (i - m[2]));
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
        System.out.println("Triangle - Area = " + calculateArea(sides.get(0), sides.get(1), sides.get(2)) + " - Perimeter = " + calculatePerimeter(sides.get(0), sides.get(1), sides.get(2)));
    }

    @Override
    public ArrayList<Integer> getSides() {
        return sides;
    }

    @Override
    public boolean equals(Shape shape) {
        int[] j = new int[2];
        int p = 0, o = 0;
        for (int i : shape.getSides()){
            for (int q = 0; q < 3; q++){
                for (int t = 0; t <= p; t++) {
                    if (j[p] == q)
                        o = 1;
                }
                if (o == 1){
                    o = 0;
                    continue;
                }
                if (i == sides.get(q)){
                    j[p] = q;
                    p++;
                }
            }
        }
        if (p == 3)
            return true;
        return false;
    }

    public boolean isEquilateral(){
        if (sides.get(0) == sides.get(1) && sides.get(1) == sides.get(2))
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "Triangle :" + " Side 1 = " + sides.get(0) + " Side 2 = " + sides.get(1) + " Side 3 = " + sides.get(2);
    }
}
