/**
 * This class handle inpuats and run program
 * @author Mohammad Hassannejadi
 * @version 1.0
 */

public class Main {

    public static void main(String[] args) {
        Paint paint = new Paint();
	    Circle circle1 = new Circle(4);
        paint.addCircle(circle1);
        Circle circle2 = new Circle(27);
        paint.addCircle(circle2);

        Rectangle rectangle1 = new Rectangle(3,5,3,5);
        paint.addRectagnle(rectangle1);
        Rectangle rectangle2 = new Rectangle(1,2,1,2);
        paint.addRectagnle(rectangle2);
        Rectangle rectangle3 = new Rectangle(8,8,8,8);
        paint.addRectagnle(rectangle3);

        Triangle triangle1 = new Triangle(3,4,5);
        paint.addTriangle(triangle1);
        Triangle triangle2 = new Triangle(6,8,10);
        paint.addTriangle(triangle2);
        
        paint.drawAll();
        paint.printAll();
       
    }
}
