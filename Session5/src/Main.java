public class Main {
    public static void main(String[] args) {
        Paint paint=new Paint();
        Triangle triangle=new Triangle(3,4,5);
        Rectangle rectangle=new Rectangle(10,3);
        Circle circle=new Circle(1);
        paint.addShape(triangle);
        paint.addShape(rectangle);
        paint.addShape(circle);
        paint.drawAll();
        paint.printAll();
    }
}
