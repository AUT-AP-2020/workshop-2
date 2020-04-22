package paint;

public class Circle extends Shape {
    private int radius;
    public Circle(int radius){
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double calculatePerimeter() {
        return Double.parseDouble(String.format("%.2f", 2*radius*3.14));
    }

    @Override
    public void Draw() {
        System.out.println(" s = " + this.calculateArea() + " , p = " + this.calculatePerimeter());
    }

    @Override
    public double calculateArea() {
        return Double.parseDouble(String.format("%.2f", 3.14*Math.pow(radius,2)));
    }
}
