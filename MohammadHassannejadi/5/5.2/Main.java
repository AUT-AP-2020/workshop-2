/**
 * This class handle inpuats and run program
 * @author Mohammad Hassannejadi
 * @version 1.0
 */
public class Main{
    public static void main(String[] args) {
        Paint paint = new Paint();

	    Circle circle1 = new Circle(4);
        Circle circle2 = new Circle(27);

        Rectangle rectangle1 = new Rectangle(3,5,3,5);
        Rectangle rectangle2 = new Rectangle(1,2,1,2);
        Rectangle rectangle3 = new Rectangle(8,8,8,8);

        Triangle triangle1 = new Triangle(3,3,3);
        Triangle triangle2 = new Triangle(6,8,10);

        paint.addShape(circle1);
        paint.addShape(circle2);
        paint.addShape(rectangle1);
        paint.addShape(rectangle2);
        paint.addShape(rectangle3);
        paint.addShape(triangle1);
        paint.addShape(triangle2);

        paint.drawAll();
        paint.printAll();

        System.out.println("run Describe Equal side");
        paint.describeEqualSides();
    }
}