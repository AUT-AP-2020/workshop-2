/**
 * this is a paint program that draw som predefine shapes . this class is just like a test.
 * but beware that this drawing is just printing the names and sizes on board.
 */
public class Run {
    public static void main(String[] args) {
        Paint paint = new Paint();
        Shape circle = new Circle(2);
        Shape circle1 = new Circle(5.64);
        Shape circle2 = new Circle(-40);

        Shape triangle = new Triangle(4,3,5);
        Shape triangle1 = new Triangle(4.5,4.5,4.5);
        Shape triangle2 = new Triangle(1,2,3);

        Shape rectangle = new Rectangle(2,4,2,4);
        Shape rectangle1 = new Rectangle(3,4,2,4);
        Shape rectangle2 = new Rectangle(10,10,10,10);


        paint.addShape(circle);
        paint.addShape(circle1);
        paint.addShape(circle2);

        paint.addShape(rectangle);
        paint.addShape(rectangle1);
        paint.addShape(rectangle2);

        paint.addShape(triangle);
        paint.addShape(triangle1);
        paint.addShape(triangle2);

        System.out.println();
        paint.drawAll();
        System.out.println();
        paint.printAll();
    }
}
