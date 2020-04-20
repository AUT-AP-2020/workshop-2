import java.util.Objects;

public class Circle {
    private int radius;

    public Circle(int radius){
        this.radius=radius;
    }

    public double calculatePerimeter(){
        return 2*Math.PI*radius;
    }
    public double calculateArea(){
        return Math.PI*radius*radius;
    }
    public void draw(){
        System.out.println(this.getClass().getName());
        System.out.println("Perimeter = "+calculatePerimeter());
        System.out.println("Area = "+calculateArea());
    }
    public int getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}
