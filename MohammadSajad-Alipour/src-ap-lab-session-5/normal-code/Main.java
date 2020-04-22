/**
 * This is the test class for testing classes
 */
public class Main {
    /**
     * This is the main method
     *
     * @param args
     */
    public static void main(String[] args) {
        //creating shapes
        Circle circle1 = new Circle(19);
        Circle circle2 = new Circle(3);
        Rectangle rect1 = new Rectangle(1, 4, 1, 4);
        Rectangle rect2 = new Rectangle(8, 5, 8, 5);
        Rectangle rect3 = new Rectangle(6, 6, 6, 6);
        Triangle tri1 = new Triangle(2, 2, 2);
        Triangle tri2 = new Triangle(4, 4, 6);
        //creating paint
        Paint paint = new Paint();
        //testing add methods
        paint.addCircle(circle1);
        paint.addCircle(circle2);
        paint.addRectangle(rect1);
        paint.addRectangle(rect2);
        paint.addRectangle(rect3);
        paint.addTriangle(tri1);
        paint.addTriangle(tri2);
        //testing draw and print all methods
        paint.drawAll();
        paint.printAll();

        //Testing isSquare and isEquilateral methods
        if (rect3.isSquare()) {
            System.out.println("It is square!");
        }
        if (tri1.isEquilateral()) {
            System.out.println("It is equilateral!");
        }
    }
}
