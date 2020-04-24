import java.util.ArrayList;

public class Triangle extends Polygon {

    public Triangle(double... args){
        super(args);
    }

    @Override
    public void draw() {
        System.out.println((char) 0x25B3);
    }

    public boolean isEquilateral(){
        return super.getSides().get(0).equals(super.getSides().get(1)) &&
                super.getSides().get(0).equals(super.getSides().get(2));
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<Double> sides = super.getSides();
        stringBuilder.append("side1: ");
        stringBuilder.append(sides.get(0));
        stringBuilder.append(", side2: ");
        stringBuilder.append(sides.get(1));
        stringBuilder.append(", side3: ");
        stringBuilder.append(sides.get(2));
        return super.toString() + stringBuilder.toString();
    }
}
