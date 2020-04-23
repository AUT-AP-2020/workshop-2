import java.util.ArrayList;

/**
 * this class represents a polygon generally
 * @author Mahdi Mirfendereski
 * @version 0.0
 */
public class Polygon extends Shape {
    protected ArrayList<Double> sides ;
    /**
     *
     * @param args sides of polygon
     */
    public Polygon(double... args){
        sides=new ArrayList<>();
        for (Double d:args) {
            sides.add(d);
        }
    }

    /**
     * grt list of sides
     * @return list of sides
     */
    public ArrayList<Double> getSides() {
        return sides;
    }
    @Override
    public void draw(){
        super.draw();
    }
    @Override
    public String toString() {
        String temp ="";
        int i=1;
        for (Double d:sides) {
            temp+="Side"+i+":"+d.doubleValue()+", ";
            i++;
        }
        return temp;
    }
}
