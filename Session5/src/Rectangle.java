import java.util.ArrayList;

/**
 * @author Ali Ansari
 * @version 1.0.0
 * Rectangle class extends to Polygon
 */
public class Rectangle extends Polygon {
    public Rectangle(int width,int height) {
        sides.add(width);
        sides.add(height);
    }

    /**
     * Check rectangle is square or not
     * @return A boolean
     */
    public boolean isSquare() {
        return sides.get(0).equals(sides.get(1));
    }

    @Override
    public String toString() {
        return "Rectangle::"+sides.toString();
    }

    @Override
    public double calculateArea() {
        return sides.get(0)*sides.get(1);
    }

    @Override
    public void draw() {
        System.out.println("Rectangle Area:"+calculateArea()+" Perimeter:"+calculatePerimeter()*2);
    }
}
