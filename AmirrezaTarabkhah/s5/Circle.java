import java.util.ArrayList;

public class Circle extends Shape {

    private int radius;

    public Circle(int radius) {this.radius = radius;}

    @Override
    public double calculateArea(int... nums) {
        double i = 1;
        for (int n : nums)
            i *= n;
        i *= i * pi;
        return i;
    }

    @Override
    public double calculatePerimeter(int... nums){
        double i = 0;
        for (int n : nums)
            i += n;
        i *= 2 * pi;
        return i;
    }

    @Override
    public void draw() {System.out.println("Circle - Area = " + calculateArea(radius) + " - Perimeter = " + calculatePerimeter(radius));}

    @Override
    public boolean equals(Shape shape) {
        if (shape.getSides().get(0) == radius)
            return true;
        return false;
    }

    @Override
    public ArrayList<Integer> getSides() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(radius);
        return arrayList;
    }

    @Override
    public String toString() {
        return "Circle : " + "radius = " + radius;
    }
}
