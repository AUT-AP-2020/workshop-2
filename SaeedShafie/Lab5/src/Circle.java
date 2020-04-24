public class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public String toString() {
        return "Circle:: radius:" + radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    public void Draw() {
        System.out.println(" s = " + this.calculateArea() + " , p = " + this.calculatePerimeter());
    }
}
