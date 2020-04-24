public class Main {

    public static void main(String[] args)
    {
        Paint paint = new Paint();
        Circle circle1 = new Circle(19);
        Circle circle2 = new Circle(3);
        Rectangle rectangle1 = new Rectangle(1, 4, 1, 4);
        Rectangle rectangle2 = new Rectangle(6, 6, 6, 6);
        Rectangle rectangle3 = new Rectangle(8, 5, 8, 5);
        if (rectangle2.isSquare() == 1) {
            System.out.println(rectangle2.toString());
            System.out.println("It is square!");
        }
        Triangle triangle1 = new Triangle(2, 2, 2);
        Triangle triangle2 = new Triangle(4, 4, 6);
        if (triangle1.isEquilateral() == 1)
        {
            System.out.println(triangle1.toString());
            System.out.println("It is equilateral!");
        }
        paint.addCircle(circle1);
        paint.addRectangle(rectangle1);
        paint.addRectangle(rectangle2);
        paint.addRectangle(rectangle3);
        paint.addTriangle(triangle1);
        paint.addTriangle(triangle2);
        paint.drawAll();
        paint.printAll();
    }
}
