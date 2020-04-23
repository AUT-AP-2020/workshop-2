import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public abstract class Polygon extends Shape {

    protected ArrayList<Double> sides;

    /**
     * constructor which add sides
     * @param sides a list of all side of Polygon
     */
    public Polygon(Double ... sides){
        this.sides = new ArrayList<>();
        Collections.addAll(this.sides, sides);
    }

    /**
     *
     * @return a ArrayList of sides
     */
    public ArrayList<Double> getSides() {
        return sides;
    }

    /**
     *
     * @return the Polygon Perimeter
     */
    @Override
    public abstract double calculatePerimeter();

    /**
     *
     * @return the Polygon Area
     */
    @Override
    public abstract double calculateArea();

    /**
     *
     * @param toCompere the compere Polygon information
     * @return the value of this two Polygon is the same or not
     */
    @Override
    public boolean equals(Object toCompere){
        if(toCompere instanceof Polygon) {
            return Objects.equals(sides, ((Polygon) toCompere).sides);
        } else {
            return false;
        }
    }

    /**
     *
     * @return a String which contains the type , length and width of Rectangle
     */
    @Override
    public String toString() {
        StringBuilder temp = new StringBuilder();

        if (this instanceof Triangle) {
            temp.append("Triangle {");
        } else {
            temp.append("Rectangle {");
        }

        for (int i = 0; i < sides.size(); i++) {
            temp.append("side ").append(i + 1).append(" : ").append(sides.get(i));
            if(i + 1 != sides.size()){
                temp.append(" , ");
            }
        }

        temp.append(" }");
        return temp.toString();
    }

}
