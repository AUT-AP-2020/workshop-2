/**
 * polygon class inherits shap for extending
 */

import java.util.ArrayList;

public class Polygon extends Shape
{
    protected ArrayList<Integer> sides;

    /**
     * create a polygon
     * @param sides
     */
    public Polygon(Integer... sides) {
        this.sides = new ArrayList<>();
        for (Integer side : sides)
        {
            this.sides.add(side);
        }
    }

    /**
     * get sides
     * @return sides
     */
    public ArrayList<Integer> getSides() {
        return sides;
    }

    /**
     * calculate perimeter of polygon: sum of side
     * @return perimeter
     */
    @Override
    public double calculatePerimeter() {
        double perimeter = 0;
        for (int i = 0;i < sides.size();i++) {
            perimeter = perimeter + sides.get(i);
        }
        return perimeter;
    }

    /**
     * polygon to string
     * @return string
     */
    @Override
    public String toString() {
        String string = "";
        for (int i = 1;i < sides.size()+1;i++) {
            string = string + "side" + i + ":" + sides.get(i-1);
            if (i != sides.size())
            {
                string = string + " , ";
            }
        }
        return string;
    }
}