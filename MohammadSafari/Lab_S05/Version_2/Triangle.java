package MohammadSafari.Lab_S05.Version_2;

public class Triangle extends Polygon {
    public Triangle(double one, double two, double three) {
        super(one, two, three);
    }

    public boolean isEquilateral() {
        return sides[0] == sides[1] && sides[1] == sides[2];

    }

    @Override
    public double calculateArea() {
        double p = sides[0] + sides[1] + sides[2];
        p /= 2;
        // Heron's Formual
        return Math.sqrt(p * (p - sides[0]) * (p - sides[1]) * (p - sides[2]));
    }

    @Override
    public String toString() {
        return String.format("%s:: side1:%f , side2:%f, side3:%f", "Triangle", sides[0], sides[1], sides[2]);

    }

}