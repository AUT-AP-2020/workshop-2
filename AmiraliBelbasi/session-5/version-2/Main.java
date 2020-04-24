/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Shape circle1 = new Circle(19);
        Shape circle2 = new Circle(3);

        Shape rect1 = new Rectangle(1, 4, 1, 4);
        Shape rect2 = new Rectangle(8, 5, 8, 5);
        Shape rect3 = new Rectangle(6, 6, 6, 6);

        Shape tri1 = new Triangle(2, 2, 2);
        Shape tri2 = new Triangle(4, 4, 6);

        Paint paint = new Paint();

        paint.addShape(circle1);
        paint.addShape(circle2);
        paint.addShape(rect1);
        paint.addShape(rect2);
        paint.addShape(rect3);
        paint.addShape(tri1);
        paint.addShape(tri2);
        paint.drawAll();
        paint.printAll();
        System.out.println("list of squares and equilaterals are as follows:");
        paint.describeEqualSides();
    }
}