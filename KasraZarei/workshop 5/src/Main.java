/**
 * @author Kasra Zarei
 * @since 2020-4-15
 * <h1>Main class</h1>
 * this class have <span style="color:blue">main</span> method to run program <br>
 * have simple tests to check program
 */
public class Main {

    public static void main(String[] args) {
        //simple test
        Shape tri = new Triangle(3, 4, 5);
        Shape tri2 = new Triangle(3, 3, 4);
        Triangle tri3 = new Triangle(3, 3, 3);
        Triangle tri33 = new Triangle(3, 3, 3);
        System.out.println("Are they equal?: " + tri33.equals(tri3));
        Circle circ = new Circle(4);
        Triangle tri4 = new Triangle(5, 5, 5);
        Rectangle rect = new Rectangle(5, 6);
        Rectangle rect3 = new Rectangle(6, 6);
        System.out.println("Are they equal?:" + rect.equals(rect3));
        Paint paint = new Paint();
        paint.addShape(tri);
        paint.addShape(tri2);
        paint.addShape(tri3);
        paint.addShape(circ);
        paint.addShape(rect);
        paint.addShape(rect3);
        paint.addShape(tri4);

        System.out.println("draw all---------------------");
        paint.drawAll();
        System.out.println("print all-------------------");
        paint.printAll();
        System.out.println("EqualsSides------------------");
        paint.describeEqualSides();

    }
}
