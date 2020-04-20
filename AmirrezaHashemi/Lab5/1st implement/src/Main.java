public class Main {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(2,2,3);
        System.out.println(t1.calculatePerimeter());
        System.out.println(t1.calculateArea());
        Triangle t2 = new Triangle(3,2,2);
        System.out.println(t2.calculatePerimeter());
        System.out.println(t2.calculateArea());
        System.out.println(t1.equals(t2));



        Circle circle1 = new Circle(19);
        Circle circle2 = new Circle(3);
        Rectangle rect1 = new Rectangle(1,4,1,4);
        Rectangle rect2 = new Rectangle(8,5,8,5);
        Rectangle rec3 = new Rectangle(6,6,6,6);
        System.out.println(rec3.isSquare‬‬());

        Triangle tri1 = new Triangle(2,2,2);
        System.out.println(tri1.isEquilateral‬‬());
        Triangle tri2 = new Triangle(4,4,6);
        Paint paint = new Paint();
        paint.addCircle(circle1);
        paint.addCircle(circle2);
        paint.addRectangle(rect1);
        paint.addRectangle(rect2);
        paint.addRectangle(rec3);
        paint.addTriangle(tri1);
        paint.addTriangle(tri2);
        paint.drawAll();
        paint.printAll();
    }
}
