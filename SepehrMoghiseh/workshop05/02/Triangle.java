public class Triangle extends Polygon {
    public Triangle(int side1, int side2, int side3) {
        super(side1, side2, side3);
    }

    public boolean isEquilateral() {
        if (sides.get(0) == sides.get(1) && sides.get(0) == sides.get(2) && sides.get(1) == sides.get(2))
            return true;
        return false;
    }

    public String toString() {
        return "triangle" + " side1: " + sides.get(0) + " side2: " + sides.get(1) + " side3: " + sides.get(2);

    }


    public double calculateArea() {
        double s = sides.get(0) + sides.get(1) + sides.get(2);
        s = s / 2;
        double area = Math.sqrt(s * (s - sides.get(0)) * (s - sides.get(1)) * (s - sides.get(2)));
        return area;
    }

    public void draw() {
        System.out.println("triangle : " + "area = " + calculateArea() + " , " + "primeter = " + calculatePerimeter());
    }

}
