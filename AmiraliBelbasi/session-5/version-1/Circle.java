/**
 * Circle
 */
public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * @return the radius
     */
    public int getRadius() {
        return radius;
    }

    public double calculatePerimeter() {
        return (2 * Math.PI * radius);
    }

    public double calculateArea() {
        return (Math.PI * radius * radius);
    }

    public void draw() {
        System.out.println("a circle with perimeter of " + calculatePerimeter() + " and area of " + calculateArea());
    }

    @Override
    public boolean equals(Circle circleToBeCompared) {
        if (circleToBeCompared.radius == radius) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return ("a circle with radius of " + radius);
    }
}