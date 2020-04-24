import java.util.ArrayList;

public abstract class Polygon extends Shape {

    private ArrayList<Double> sides;

    public Polygon(double... args){
        sides = new ArrayList<>();
        for (double side : args){
            sides.add(side);
        }
    }

    @Override
    public abstract void draw();

    public ArrayList<Double> getSides() {
        return sides;
    }
}
