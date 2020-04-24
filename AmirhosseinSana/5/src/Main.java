/**
 * The type Main.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Paint paint = new Paint();

        paint.addShape(new Circle(2));
        paint.addShape(new Triangle(2, 3, 4));
        paint.addShape(new Triangle(2, 2, 2));
        paint.addShape(new Rectangle(2, 3, 2, 3));
        paint.addShape(new Rectangle(4, 4, 4, 4));

        paint.describeEqualSides();
        paint.drawAll();
        paint.printAll();
    }
}
