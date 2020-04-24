import java.util.ArrayList;

/**
 * Polygon
 */
public class Polygon extends Shape {

    ArrayList<Double> sides = new ArrayList<>();

    public Polygon(double... givenSides) {
        for (double i : givenSides) {
            sides.add(i);
        }
    }

    /**
     * @return the sides
     */
    public ArrayList<Double> getSides() {
        return sides;
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < sides.size(); i++) {
            if (i > 0) {
                res += ", ";
            }
            res += "side" + (i + 1) + ":" + sides.get(i);
        }
        return res;
    }
}