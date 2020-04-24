public class Main {

    public static void main(String[] args) {
        Circle circle1=new Circle(1);
        Circle circle2=new Circle(2);

        rectangle rectangle1=new rectangle(1,2);
        rectangle rectangle2=new rectangle(1,2);
        rectangle rectangle3=new rectangle(3,3);

        triangle triangle1=new triangle(2 ,3 ,3);
        triangle triangle2=new triangle(2 ,3 ,3);
        triangle triangle3=new triangle(3 ,3 ,3);

        Paint paint=new Paint();

        paint.addShape(circle1);
        paint.addShape(circle2);

        paint.addShape(rectangle1);
        paint.addShape(rectangle2);
        paint.addShape(rectangle3);

        paint.addShape(triangle1);
        paint.addShape(triangle2);
        paint.addShape(triangle3);

        paint.print_all();


    }
}
