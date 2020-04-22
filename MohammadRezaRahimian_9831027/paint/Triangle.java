package paint;

public class Triangle extends Polygon {
    public Triangle(Integer... args) {
        super(args);
    }

    @Override
    public double calculateArea() {
        double p = calculatePerimeter()/2;
        return Double.parseDouble(String.format("%.2f", (Math.sqrt(p*(p-sides.get(0))*(p-sides.get(1))*(p-sides.get(2))))));
    }
}
