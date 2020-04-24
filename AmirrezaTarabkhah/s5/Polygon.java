import java.util.ArrayList;

public class Polygon extends Shape {

    protected ArrayList<Integer> sides = new ArrayList<>();

    public Polygon(int... nums){
        for (int i : nums)
            sides.add(i);
    }

    public double calculateArea(int... nums){
        return 0;
    }

    public double calculatePerimeter(int... nums){
        return 0;
    }

    public void draw() {}

    public boolean equals(Shape shape) {return false;}

    public ArrayList<Integer> getSides() {return null;}

    @Override
    public String toString() {
        return null;
    }
}
