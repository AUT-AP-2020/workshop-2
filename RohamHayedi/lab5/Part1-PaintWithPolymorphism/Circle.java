public class Circle extends Shape {

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        System.out.println((char) 0x25EF);
    }

    @Override
    public double calculateParameter() {
        return 2 * 3.14 * radius;
    }

    @Override
    public double calculateArea() {
        return 3.14 * radius*radius;
    }

    @Override
    public String toString() {
        return "radius = " + radius;
    }
}
