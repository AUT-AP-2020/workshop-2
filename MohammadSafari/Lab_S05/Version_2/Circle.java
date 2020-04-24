package MohammadSafari.Lab_S05.Version_2;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    public double calculatePerimeter() {
        return (2 * Math.PI * radius);
    }

    public double calculateArea() {
        return (Math.PI * radius * radius);
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Circle) ? (((Circle) obj).getRadius() == this.radius) : false;
    }

    @Override
    public String toString() {
        return String.format("%s, %s : %f", "Circle", "Radius", radius);
    }

}