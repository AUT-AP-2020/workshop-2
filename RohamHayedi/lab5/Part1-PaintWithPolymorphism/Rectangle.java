import java.util.ArrayList;

public class Rectangle extends Polygon {

    public Rectangle(double... args){
        super(args);
    }

    @Override
    public void draw() {
        System.out.println((char) 0x25AD);
    }

    @Override
    public double calculateArea() {
        ArrayList<Double> sides = super.getSides();
        return sides.get(0).equals(sides.get(1)) ? sides.get(0) * sides.get(2) : sides.get(0) * sides.get(1);
    }

    @Override
    public double calculateParameter() {
        double param = 0;
        for (double side : super.getSides()){
            param += side;
        }
        return param;
    }

    public boolean isSquare(){
        ArrayList<Double> sides = super.getSides();
        double sampleSide = sides.get(0);
        for (double side : sides){
            if (side != sampleSide)
                return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<Double> sides = super.getSides();
        stringBuilder.append("First pair: ");
        stringBuilder.append(sides.get(0));
        stringBuilder.append(", Second pair: ");
        stringBuilder.append(!sides.get(0).equals(sides.get(1)) ? sides.get(1) : sides.get(2));

        return super.toString() + stringBuilder;
    }
}
