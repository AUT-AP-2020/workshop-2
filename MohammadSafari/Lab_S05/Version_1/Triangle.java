package MohammadSafari.Lab_S05.Version_1;

public class Triangle {
    private double[] sides;

    public Triangle(double one, double two, double three) {
        sides = new double[] { one, two, three };
    }

    public double calculatePerimeter() {
        return (sides[0] + sides[1] + sides[2]);
    }

    public double calculateArea() {
        double p = sides[0] + sides[1] + sides[2];
        p /= 2;
        // Heron's Formula
        return Math.sqrt(p * (p - sides[0]) * (p - sides[1]) * (p - sides[2]));
    }

    public void draw() {
        System.out.println(toString());
        System.out.printf("perimeter: %f, area: %f\n", calculatePerimeter(), calculateArea());
    }

    /**
     * @return the sides
     */
    public double[] getSides() {
        return sides;
    }

    public boolean isEquilateral() {
        return sides[0] == sides[1] && sides[1] == sides[2];

    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Triangle)
                ? (((Triangle) obj).sides[0] == this.sides[0] && ((Triangle) obj).sides[1] == this.sides[1]
                        && ((Triangle) obj).sides[2] == this.sides[2])
                : false;
    }

    @Override
    public String toString() {
        return String.format("%s, %f , %f, %f", "Triangle", sides[0], sides[1], sides[2]);
    }

}