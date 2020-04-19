public class Main {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(2,2,3);
        System.out.println(t1.calculatePerimeter());
        System.out.println(t1.calculateArea());
        Triangle t2 = new Triangle(3,2,2);
        System.out.println(t2.calculatePerimeter());
        System.out.println(t2.calculateArea());
        System.out.println(t1.equals(t2));
    }
}
