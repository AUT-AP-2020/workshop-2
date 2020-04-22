import java.util.ArrayList;

/**
 * This is a class for polygon shapes and inherits from Shape
 */
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

    @Override
    public double calculatePerimeter() {
        double sum = 0;
        for (Integer side : sides) {
            sum += side;
        }
        return sum;
    }


    @Override
    public String toString() {
        String ans = "";
        int iterator = 1;
        for (Integer side : sides) {
            ans += "side" + iterator + ":" + side;
            if (iterator != sides.size()) {
                ans += ", ";
            }
            iterator++;
        }
        return ans;
    }
}
