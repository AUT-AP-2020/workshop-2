public class main {

    public static void main(String[] args) {
        Paint paint = new Paint();

        Triangle triangle1 = new Triangle(1,2,3);
        Triangle triangle2 = new Triangle(2,2,2);
        Triangle triangle3 = new Triangle(3,4,5);

        Rectangle rectangle1 = new Rectangle(1,2,1,2);
        Rectangle rectangle2 = new Rectangle(2,2,2,2);
        Rectangle rectangle3 = new Rectangle(3,2,3,2);

        Circle circle1 = new Circle(2);
        Circle circle2 = new Circle(3);
        Circle circle3 = new Circle(5);

        paint.addShape(triangle1);
        paint.addShape(triangle2);
        paint.addShape(triangle3);
        paint.addShape(rectangle1);
        paint.addShape(rectangle2);
        paint.addShape(rectangle3);
        paint.addShape(circle1);
        paint.addShape(circle2);
        paint.addShape(circle3);

        paint.drawAll();
        paint.printAll();
    }
}
