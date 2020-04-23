/**
 * the main class run the project and make instances od other classes
 and add new objects and print shapes
 * @author Setayesh
 * @version 0.1
 */
public class Main {
    public static void main(String[] args) {
    Circle circle1 = new Circle(19);
    Circle circle2 = new Circle(3);
    Rectangle rect1 = new Rectangle(1,4,1,4);
    Rectangle rect2 = new Rectangle(8,5,8,5);
    Rectangle rect3 = new Rectangle(6,6,6,6);
    Triangle tri1 = new Triangle(2,2,2);
    Triangle tri2 = new Triangle(4,4,6);
    Paint paint = new Paint();
    paint.addCircle(circle1);
    paint.addCircle(circle2);
    paint.addRectangle(rect1);
    paint.addRectangle(rect2);
    paint.addRectangle(rect3);
    paint.addTriangle(tri1);
    paint.addTriangle(tri2);
    System.out.println("((((draw all : ))))");
    paint.drawAll();
    System.out.println("\n((((print all info of shapes: ))))");
    paint.printAll();
}
}