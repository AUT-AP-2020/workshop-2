/**
 * Circle
 */
public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    /**
     * @return the radius
     */
    public int getRadius() {
        return radius;
    }

    @Override
    public double calculatePerimeter() {
        return (2 * Math.PI * radius);
    }

    @Override
    public double calculateArea() {
        return (Math.PI * radius * radius);
    }

    @Override
    public void draw() {
        System.out.println("a circle with perimeter of " + calculatePerimeter() + " and area of " + calculateArea());
    }

    @Override
    public boolean equals(Shape shapeToBeCompared) {
        if (!(shapeToBeCompared instanceof Circle)) {
            return false;
        }
        Circle castedShapeToBeCompared = (Circle) shapeToBeCompared;
        if (castedShapeToBeCompared.radius == radius) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return ("a circle with radius of " + radius);
    }
}