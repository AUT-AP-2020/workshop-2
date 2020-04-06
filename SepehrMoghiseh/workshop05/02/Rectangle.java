public class Rectangle extends Polygon {
    public Rectangle(int side1, int side2, int side3, int side4) {
        super(side1, side2, side3, side4);
    }

    public String toString() {

        return "rectangle " + " side1: " + sides.get(0) + " side2: " + sides.get(1) + " side3: " + sides.get(2) + " side4: " + sides.get(3);

    }


    public double calculateArea() {
        return sides.get(0) * sides.get(1);
    }

    public void draw() {
        System.out.println("rectangle : " + "area =  " + calculateArea() + " , " + "primeter = " + calculatePerimeter());
    }

    public boolean isSquare() {
        if (sides.get(0) == sides.get(1) && sides.get(0) == sides.get(2) && sides.get(0) == sides.get(3) && sides.get(1) == sides.get(2) && sides.get(1) == sides.get(3) && sides.get(2) == sides.get(3))
            return true;
        return false;
    }
}
