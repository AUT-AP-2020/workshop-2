/**
 * Polygon Object
 * @author Keivan Ipchi Hagh
 * @since 2020/5/4
 * @override 1.0.1
 */
import java.util.ArrayList;
import java.util.Arrays;

public class Polygon extends Shape {

    /**
     * Polygon Constructor, Initializes fields
     * @param sides Sides
     */
    public Polygon(Double... sides) {
        super(sides);
    }

    /**
     * Getter: Get sides
     * @return Sides
     */
    public ArrayList<Double> getSides() {
        return sides;
    }
}