import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Ali Ansari
 * @version 1.0.0
 * Polygon class extend to Shape
 */
abstract public class Polygon extends Shape{
    ArrayList<Integer> sides = new ArrayList<>();
    public Polygon(Integer... args){
        sides.addAll(Arrays.asList(args));
    }
    /**
     * Getter for sides
     * @return Sides
     */
    public ArrayList<Integer> getSides() {
        return sides;
    }
    @Override
    public double calculatePerimeter() {
        double perimeter=0;
        for (int side : sides){
            perimeter=perimeter+side;
        }
        return perimeter;
    }
}
