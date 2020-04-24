/**
 * This class designed to create triangle shapes
 */
public class Triangle extends Polygon {

    public Triangle(double a, double b, double c){
        super(a, b, c);
    }

    @Override
    public double calculatePerimeter() {
        return super.calculatePerimeter();
    }

    @Override
    public double calculateArea() {
        double p = this.calculatePerimeter() / 2;
        return Math.sqrt(p * (p - this.getSides().get(0)) * (p - this.getSides().get(1)) * (p - this.getSides().get(2)));
    }

    @Override
    public void draw() {
        System.out.println("The shape is: Triangle\nWith the perimeter of: " + this.calculatePerimeter() + "\nAnd the area of: " + this.calculateArea() + '\n');
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Triangle triangle = (Triangle) obj;
        return this.calculatePerimeter() == triangle.calculateArea() && this.calculateArea() == triangle.calculateArea();

    }
    public void isEquilateral(){
        if ((double)this.getSides().get(0) == (double)this.getSides().get(1) && (double)this.getSides().get(1) == (double)this.getSides().get(2))
            System.out.println( "   and this is a equilateral triangle.");
    }
}
