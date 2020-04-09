public class Main {

    public static void main(String[] args) {

        // Make some circles
        Circle circle1 = new Circle(19);
        Circle circle2 = new Circle(3);

        // Make some rectangles
        Rectangle rect1 = new Rectangle(1,4,1,4);
        Rectangle rect2 = new Rectangle(8,5,8,5);
        Rectangle rect3 = new Rectangle(6,6,6,6);

        // Make some triangles
        Triangle tri1 = new Triangle(2,2,2);
        Triangle tri2 = new Triangle(4,4,6);

        // Make a paint object
        Paint paint = new Paint();

        // Add some circles
        paint.addCircle(circle1);
        paint.addCircle(circle2);

        // Add some rectangles
        paint.addRectangle(rect1);
        paint.addRectangle(rect2);
        paint.addRectangle(rect3);

        // Add some triangles
        paint.addTriangle(tri1);
        paint.addTriangle(tri2);

        // Draw all objects
        paint.drawAll();

        // Print all objects
        paint.printAll();
    }
}
