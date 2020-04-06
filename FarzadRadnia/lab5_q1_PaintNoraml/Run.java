/**
 * this is a paint program that draw som predefine shapes . this class is just like a test.
 * but beware that this drawing is just printing the names and sizes on board.
 */
public class Run {
    public static void main(String[] args) {
        Paint paint = new Paint();
        Circle circle = new Circle(2);
        Circle circle1 = new Circle(5.64);
        Circle circle2 = new Circle(-40);

        Triangle triangle = new Triangle(4,3,5);
        Triangle triangle1 = new Triangle(4.5,4.5,4.5);
        Triangle triangle2 = new Triangle(1,2,3);

        Rectangle rectangle = new Rectangle(2,4,2,4);
        Rectangle rectangle1 = new Rectangle(3,4,2,4);
        Rectangle rectangle2 = new Rectangle(10,10,10,10);


        paint.addCircle(circle);
        paint.addCircle(circle1);
        paint.addCircle(circle2);

        paint.addRectangle(rectangle);
        paint.addRectangle(rectangle1);
        paint.addRectangle(rectangle2);

        paint.addTriangle(triangle);
        paint.addTriangle(triangle1);
        paint.addTriangle(triangle2);

        System.out.println();
        paint.drawAll();
        System.out.println();
        paint.printAll();
    }
}
