package MohammadSafari.Lab_S05.Version_2;

public class Main {
    public static void main(String... args) {
        // because i didnt want to implement any methods for shape and polygon class i
        // defined them as abstract classes so can not instantiate from those classes
        // but can use their static-types identifiers and fields and some implemented
        // methods in polygon class

        // error
        // Circle circle1 = new Shape(19);
        // corrcted
        Circle circle1 = new Circle(19);

        Shape circle2 = new Circle(3);
        // because circle is a subclass of shape , shape static-type identifier can
        // point to circle obj

        // error
        // Rectangle rect1 = new Triangle(1, 4, 1);
        // corrected
        Triangle rect1 = new Triangle(1, 4, 1);

        Polygon rect2 = new Rectangle(8, 5, 8, 5);
        // because rectangle is a subclass of polygon this identifier can point to
        // rectangle obj

        // error
        // Rectangle rec3 = new Shape(6, 6, 6, 6);
        // corrected
        Shape rect3 = new Rectangle(6, 6, 6, 6);
        // satatic-type changed to shape: refer to line 61

        Polygon tri1 = new Triangle(2, 2, 2);

        Triangle tri2 = new Triangle(4, 4, 6);

        Shape tri3 = new Triangle(2, 2, 2);

        // error
        // circle1 = circle2;
        // corrected
        circle1 = (Circle) circle2;

        // error
        // rect2 = rect3;
        // corrected
        rect2 = (Rectangle) rect3;

        // error
        // tri1 = tri3;
        // corrected
        tri1 = (Triangle) tri3;

        // shape object cricle2 can point to rectangle tri3;
        circle2 = tri3;
        tri3 = tri2;
        // now two pointings to triangle shape 2 and trinagle shape 3 can no more be
        // accesible

        // rect 3 is an identifier of rectangle and cannot be used as type triangle so
        // we should change static type from the begining
        rect3 = new Triangle(2, 3, 2);

        // now rect3 as an triangle wil call its overrided toString(actually Triangle's
        // toString)
        System.out.println(rect3.toString());
    }
}