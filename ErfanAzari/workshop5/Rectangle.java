/**
 * This class designed to create rectangle shapes.
 */
public class Rectangle extends Polygon {

    public Rectangle(double a, double b, double c, double d) {
        super(a, b, c, d);
    }

    public double calculateArea(){
        return this.getSides().get(0) * this.getSides().get(2);
    }


    public double calculatePerimeter(){
        return super.calculatePerimeter();
    }

    public void draw(){
        System.out.println("The shape is: Rectangle\nWith perimeter of: " + calculatePerimeter() + "\nAnd the area of: " + calculateArea() + "\n");
    }

    /**
     * This method would check to see if the rectangle is a square or not.
     */
    public void isSquare(){
        if ((double)this.getSides().get(0) == (double)this.getSides().get(1) && (double)this.getSides().get(2) == (double)this.getSides().get(3))
            System.out.println("    and this is a square.");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}