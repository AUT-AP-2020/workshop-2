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
        paint.drawAll();
        paint.printAll();
        Circle circle1Temp = new Circle(19);
        Rectangle rect2Temp = new Rectangle(8,5,8,5);
        Triangle tri2Temp = new Triangle(4,4,6);
        //circle1 equals circle1Temp
        System.out.println("Must be true: "+circle1.equals(circle1Temp));
        //rect2 equals rect2Temp
        System.out.println("Must be true: "+rect2.equals(rect2Temp));
        //tri2 equals tri2Temp
        System.out.println("Must be true: "+tri2.equals(tri2Temp));
        //rect3 is Square
        System.out.println("Must be true: "+rect3.isSquare());
        //tri1 is Equilateral
        System.out.println("Must be true: "+tri1.isEquilateral());
    }

}
