/**
 * <h1>Triangle class</h1>
 *
 * @Override toString from object calss
 * @Override equals from object class
 * @Override calculateArea from shape
 * have isEquilateral method to check is special triangle or not
 */
public class Triangle extends Polygon {

    public Triangle(int a, int b, int c) {
        super(a, b, c);
    }

    public boolean isEquilateral(Object o) {
        if (getSides().get(0).equals(getSides().get(1)) && getSides().get(1).equals(getSides().get(2))) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "[" + getSides().get(0) + ", " + getSides().get(1) + ", " + getSides().get(2) + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (((Triangle) o).getSides().equals(this.getSides())) {
            return true;
        }
        return false;
    }

    @Override
    public double calculateArea(Shape shape) {
        double p = super.calculatePerimeter(this) / 2;
        return Math.sqrt(p * (p - this.getSides().get(0)) * (p - this.getSides().get(1)) * (p - this.getSides().get(2)));
    }
}
