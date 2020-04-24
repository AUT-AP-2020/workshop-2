package MohammadSafari.Lab_S05.Version_1;

public class Rectangle {
    private double[] sides;

    public Rectangle(double length, double width) {
        sides = new double[] { length, width };
    }

    public double calculatePerimeter() {
        return 2 * (sides[0] + sides[1]);
    }

    public double calculateArea() {
        return (sides[0] * sides[1]);
    }

    public void draw(){
        System.out.println(toString());
        System.out.printf("perimeter: %f, area: %f\n", calculatePerimeter(), calculateArea());
    }

    /**
     * @return the sides
     */
    public double[] getSides() {
        return sides;
    }

    public boolean isSquare() {
        return (sides[0] == sides[1]);
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Rectangle)
                ? (((Rectangle) obj).sides[0] == this.sides[0] && ((Rectangle) obj).sides[1] == this.sides[1])
                : false;
    }

    @Override
    public String toString() {
        return String.format("%s, %s : %f , %s : %f", "Rectangle", "Lenght", sides[0], "Width", sides[1]);
    }

}