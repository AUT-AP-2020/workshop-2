package paint.v2;

public class Main {
    public static void main(String[] args) {
        Circle circle1=new Circle(9);
        Circle circle2=new Circle(9);
        Circle circle3=new Circle(9);
        Circle circle4=new Circle(9);

        Rectangle rectangle=new Rectangle(10,10);
        Rectangle rectangle2=new Rectangle(10,10);
        Rectangle rectangle3=new Rectangle(10,10);

        Triangle triangle=new Triangle(10,2,9);
        Triangle triangle2=new Triangle(10,2,9);
        Triangle triangle3=new Triangle(10,2,9);

        Paint p=new Paint();
        p.addCircle(circle1);
        p.addCircle(circle2);
        p.addCircle(circle3);

        p.addRectangle(rectangle);
        p.addRectangle(rectangle2);
        p.addRectangle(rectangle3);

        p.addTriangle(triangle);
        p.addTriangle(triangle2);
        p.addTriangle(triangle3);

        p.printAll();
        p.drawAll();
    }
}
