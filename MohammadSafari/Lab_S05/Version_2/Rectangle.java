package MohammadSafari.Lab_S05.Version_2;

public class Rectangle extends Polygon {
    public Rectangle(double one, double two, double three, double four) {
        super(one, two, three, four);
    }

    public boolean isSquare() {
        return ((sides[0] == sides[1]) && (sides[1] == sides[2]) && (sides[2] == sides[3]));
    }

    @Override
    public double calculateArea() {
        return (sides[0] * sides[1]);
    }

    @Override
    public String toString() {
        return String.format("%s:: side1:%f , side2:%f , side3:%f , side4:%f", sides[0], sides[1], sides[2], sides[3]);

    }
}