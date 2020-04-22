import java.util.*;

/**
 * Lab5
 */
public class Lab5 {

    public static void main(String[] args) {
        Circle circle1 = new Circle(19);
        Circle circle2 = new Circle(3);

        Rectangle rectangle1 = new Rectangle(1, 4, 1, 4);
        Rectangle rectangle2 = new Rectangle(8, 5, 8, 5);
        Rectangle rectangle3 = new Rectangle(6, 6, 6, 6);

        Triangle triangle1 = new Triangle(2, 2, 2);
        Triangle triangle2 = new Triangle(4, 4, 6);

        Paint paint = new Paint();

        paint.addShape(circle1);
        paint.addShape(circle2);
        paint.addShape(rectangle1);
        paint.addShape(rectangle2);
        paint.addShape(rectangle3);
        paint.addShape(triangle1);
        paint.addShape(triangle2);
        paint.drawAll();
        paint.printAll();
        paint.discribeEqualSides();
    }
}

/**
 * Paint
 */
class Paint {

    private ArrayList<Shape> shapes;

    /**
     * Counstructor
     */
    public Paint() {
        shapes = new ArrayList<Shape>();
    }

    /**
     * 
     * add Shape to Shapes
     */
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void drawAll() {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }

    public void printAll() {
        for (Shape shape : shapes) {
            shape.tostring();
        }
    }

    public void discribeEqualSides() {
        Iterator<Shape> it = shapes.iterator();
        while (it.hasNext()) {
            Shape temp = it.next();
            if (temp instanceof Triangle) {
                Triangle temp2 = (Triangle) temp;
                if (temp2.isEquilateral()) {
                    temp2.tostring();
                }
                continue;
            }
            if (temp instanceof Rectangle) {
                Rectangle temp2 = (Rectangle) temp;
                if (temp2.isSquare()) {
                    temp2.tostring();
                }
                continue;
            }
        }
    }
}

/**
 * Shape
 */
class Shape {

    public double calculatePrimeter() {
        return 0;
    }

    public double calculateArea() {
        return 0;
    }

    /**
     * Print Type of Shape and Primeter and Area
     */
    public void draw() {

    }

    /**
     * Print type of Shape and its Parameters
     */
    public void tostring() {

    }

    /**
     * Check if the input Shape was same
     */
    public boolean equals(Shape shape) {
        return false;
    }
}

/**
 * Polygon
 */
class Polygon extends Shape {
    private ArrayList<Float> sides;

    /**
     * Coustructor
     * 
     * @param sides
     */
    public Polygon(float... sides) {
        this.sides = new ArrayList<Float>();
        for (int i = 0; i < sides.length; i++) {
            this.sides.add(sides[i]);
        }
    }

    /**
     * @return the sides
     */
    public ArrayList<Float> getSides() {
        return sides;
    }

    /**
     * Print type of Shape and its Parameters
     */
    public void tostring() {

        for (int i = 0; i < sides.size(); i++) {
            System.out.printf(" Side %d : %f",i ,sides.get(i));
        }
    }

}

/**
 * Circle
 */
class Circle extends Shape {
    private float radius;

    /**
     * Counstructor
     * 
     * @param radius of the circle
     */
    public Circle(float radius) {
        this.radius = radius;
    }

    /**
     * @return the radius
     */
    public float getRadius() {
        return radius;
    }

    public double calculatePrimeter() {
        return 2 * (Math.PI) * radius;
    }

    public double calculateArea() {
        return (Math.PI) * Math.pow(radius, 2);
    }

    /**
     * Print Type of Shape and Primeter and Area
     */
    public void draw() {
        System.out.println("Circle : " + "Area : " + calculateArea() + " Primeter " + calculatePrimeter());
    }

    /**
     * Print type of Shape and its Parameters
     */
    public void tostring() {
        System.out.println("Circle : " + "Radius :" + radius);
    }

    /**
     * Check if the input Shape was same
     */
    public boolean equals(Circle shape) {
        if (shape.getRadius() == radius) {
            return true;
        }
        return false;
    }
}

/**
 * Triangle
 */
class Triangle extends Polygon {

    /**
     * counstructor
     * 
     * @param side1
     * @param side2
     * @param side3
     */
    public Triangle(float... sides) {
        super(sides);
    }

    /**
     * 
     * @return true if all sides were Equal
     */
    public boolean isEquilateral() {
        float side1 = getSides().get(0);
        float side2 = getSides().get(1);
        float side3 = getSides().get(2);

        if ((side1 == side2) && (side1 == side3) && (side2 == side3)) {
            return true;
        }
        return false;
    }

    public double calculatePrimeter() {
        double temp = 0;
        for (Float float1 : getSides()) {
            temp += float1;
        }
        return temp;
    }

    public double calculateArea() {
        double p = calculatePrimeter();
        double temp = p * (p - getSides().get(0)) * (p - getSides().get(1)) * (p - getSides().get(2));
        return Math.sqrt(temp);
    }

    /**
     * Print Type of Shape and Primeter and Area
     */
    public void draw() {
        System.out.println("Triangle : " + "Area : " + (int)calculateArea() + " Primeter : " +calculatePrimeter());
    }

    /**
     * Print type of Shape and its Parameters
     */
    public void tostring() {
        System.out.printf("Triangle : ");
        super.tostring();
        System.out.println();
    }

    /**
     * Check if the input Shape was same
     */
    public boolean equals(Triangle shape) {
        if ((calculateArea() == shape.calculateArea()) && calculatePrimeter() == shape.calculatePrimeter()) {
            return true;
        }
        return false;
    }
}

/**
 * Triangle ext
 */
class Rectangle extends Polygon {
    /**
     * counstructor
     * 
     * @param side1
     * @param side2
     * @param side3
     */
    public Rectangle(float... sides) {
        super(sides);
    }

    /**
     * 
     * @return true if all sides were Equal
     */
    public boolean isSquare() {
        float side1 = getSides().get(0);
        float side2 = getSides().get(1);
        if (side1 == side2) {
            return true;
        }
        return false;
    }

    public double calculatePrimeter() {
        return 2 * (getSides().get(0) + getSides().get(1));
    }

    public double calculateArea() {
        return getSides().get(0) * getSides().get(1);

    }

    /**
     * Print Type of Shape and Primeter and Area
     */
    public void draw() {
        System.out.println("Rectangle : " + "Area : " + calculateArea() + " Primeter : " + calculatePrimeter());
    }

    /**
     * Print type of Shape and its Parameters
     */
    public void tostring() {
        System.out.printf("Rectangle : ");
        super.tostring();
        System.out.println();
    }

    /**
     * Check if the input Shape was same
     */
    public boolean equals(Rectangle shape) {
        if ((calculateArea() == shape.calculateArea()) && calculatePrimeter() == shape.calculatePrimeter()) {
            return true;
        }
        return false;
    }
}
