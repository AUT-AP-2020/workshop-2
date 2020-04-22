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
        //creating paint
        Paint paint = new Paint();
        //creating shapes
        Shape circle = new Circle(1);
        Polygon triangle = new Triangle(3, 4, 5);
        Polygon rectangle = new Rectangle(4, 8, 4, 8);
        Rectangle eqRectangle = new Rectangle(6, 6, 6, 6);
        Triangle eqTriangle = new Triangle(2, 2, 2);
        //testing add methods
        paint.addShape(circle);
        paint.addShape(triangle);
        paint.addShape(rectangle);
        paint.addShape(eqRectangle);
        paint.addShape(eqTriangle);
        //testing draw and print all methods
        paint.drawAll();
        paint.printAll();
        //testing describeEqualSides method
        paint.describeEqualSides();
    }
}
