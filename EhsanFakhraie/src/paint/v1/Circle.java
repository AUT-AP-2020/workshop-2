package paint.v1;

public class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
    public double calculatePerimeter(){
        return 2*Math.PI*radius;
    }
    public double calculateArea(){
        return Math.PI*radius*radius;
    }
    public void draw(){
        System.out.println("Circle ,"+calculatePerimeter()+","+calculateArea());
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
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
