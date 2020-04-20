/**
 * The Main class tests other classes.
 *
 * @author Amirreza Hashemi
 * @version 2.0
 * @since 4/19/2020
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(1.0, 1.0, 1.0, 1.0, 1.0);
        Triangle t1 = new Triangle(2.0, 10.0, 1.0);
        r1.draw();
        t1.draw();
        Circle circle1 = new Circle(19);
        Circle circle2 = new Circle(3);
        Rectangle rect1 = new Rectangle(1.0, 4.0, 1.0, 4.0);
        Rectangle rect2 = new Rectangle(8.0, 5.0, 8.0, 5.0);
        Rectangle rec3 = new Rectangle(6.0, 6.0, 6.0, 6.0);
        System.out.println(rec3.isSquare‬‬());

        Triangle tri1 = new Triangle(2.0, 2.0, 2.0);
        System.out.println(tri1.isEquilateral‬‬());
        Triangle tri2 = new Triangle(4.0, 4.0, 6.0);
        Paint paint = new Paint();
        paint.addShape(circle1);
        paint.addShape(circle2);
        paint.addShape(rect1);
        paint.addShape(rect2);
        paint.addShape(rec3);
        paint.addShape(tri1);
        paint.addShape(tri2);
        paint.drawAll();
        paint.printAll();
        System.out.println("describeEqualSides");
        paint.describeEqualSides();
    }
}
