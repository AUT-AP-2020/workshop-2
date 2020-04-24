public class Main {

    public static void main(String[] args)
    {
        Paint paint = new Paint();
        Shape circle1 = new Circle(19);
        Shape circle2 = new Circle(3);
        Polygon rectangle1 = new Rectangle(1,4,1,4);
        Polygon rectangle2 = new Rectangle(8, 5, 8, 5);
        Polygon rectangle3 = new Rectangle(6, 6, 6, 6);
        Polygon triangle1 = new Triangle(2, 2, 2);
        Polygon triangle2 = new Triangle(4, 4, 6);
        paint.addShape(circle1);
        paint.addShape(triangle1);
        paint.addShape(rectangle1);
        paint.addShape(rectangle2);
        paint.addShape(rectangle3);
        paint.addShape(triangle2);
        paint.drawAll();
        paint.printAll();
        paint.describeEqualSides();
    }
}
