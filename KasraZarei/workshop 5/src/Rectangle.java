/**
 * <h1>Rectangle class</h1>
 *
 * @Override toString form object class
 * @Override eqaual from object class
 * @Override calculateArea from shape class
 * have isSquare method to check equal sides
 */
public class Rectangle extends Polygon {

    public Rectangle(int a, int b) {
        super(a, b);
    }

    @Override
    public String toString() {
        return "[" + getSides().get(0) + ", " + getSides().get(1) + "]";
    }

    public boolean isSquare(Object o) {
        if (getSides().get(0).equals(getSides().get(1))) {
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (((Rectangle) o).getSides().equals(this.getSides())) {
            return true;
        }
        return false;
    }

    @Override
    public double calculateArea(Shape shape) {
        return this.getSides().get(0) * this.getSides().get(1);
    }
}
