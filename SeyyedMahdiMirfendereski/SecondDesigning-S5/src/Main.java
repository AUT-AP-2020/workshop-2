public class Main {
    public static void main(String[] args){
        Circle circle1 = new Circle(19);
        Circle circle2 = new Circle(3);
        Rectangle rect1 = new Rectangle(1,4,1,4);
        Rectangle rect2 = new Rectangle(8,5,8,5);
        Rectangle rect3 = new Rectangle(6,6,6,6);
        Triangle tri1 = new Triangle(2,2,2);
        Triangle tri2 = new Triangle(4,4,6);
        Paint paint = new Paint();
        paint.addShape(circle1);
        paint.addShape(circle2);
        paint.addShape(rect1);
        paint.addShape(rect2);
        paint.addShape(rect3);
        paint.addShape(tri1);
        paint.addShape(tri2);
        paint.drawAll();
        paint.paintAll();
        Circle circle1Temp = new Circle(19);
        Rectangle rect2Temp = new Rectangle(8,5,8,5);
        Triangle tri2Temp = new Triangle(4,4,6);
        //equal method for circle testing
        System.out.println("Must be true: "+circle1.equals(circle1Temp));
        //equal method for rectangle testing
        System.out.println("Must be true: "+rect2.equals(rect2Temp));
        //equal method for triangle testing
        System.out.println("Must be true: "+tri2.equals(tri2Temp));
        //is square method for rectangle testing
        System.out.println("Must be true: "+rect3.isSquare());
        //is Equilateral method for triangle testing
        System.out.println("Must be true: "+tri1.isEquilateral());
        paint.describeEqualSides();




    }
}
