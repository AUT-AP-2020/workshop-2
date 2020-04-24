/**
 * @author morteza
 * @version 1.00
 *
 */
public class Run {
    public static void main(String[] args) {
        Circle circle1 = new Circle(19);
        Circle circle2 = new Circle(3);
        Rectangle rect1 = new Rectangle(1,4,1,4);
        Rectangle rect2 = new Rectangle(8,5,8,5);
        Rectangle rect3 = new Rectangle(6,6,6,6);
        Triangle tri1 = new Triangle(2,2,2);
        Triangle tri2 = new Triangle(4,4,6);
        Triangle tri3 = new Triangle(4,4,6);
        Paint paint = new Paint();
        paint.addCircles(circle1);
        paint.addCircles(circle2);
        paint.addRectangles(rect1);
        paint.addRectangles(rect2);
        paint.addRectangles(rect3);
        paint.addTriangle(tri1);
        paint.addTriangle(tri2);
        paint.drawAll();
        paint.printAll();
        System.out.println("+         +         +          +          +          +         + ");
        // tri2  va tri3 dare moghayese mishe !
        System.out.println("is the last triangle equals to one before it ?");
        if (tri2.equals(tri3))
        {
            System.out.println("they are equal");
        }
        else
        {
            System.out.println("they are not equal");
        }
        System.out.println("+         +         +          +          +          +         + ");
    }
}
