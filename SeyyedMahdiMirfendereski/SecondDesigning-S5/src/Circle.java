/**
 * this class represents a Circle generally
 * @author Mahdi Mirfendereski
 * @version 0.0
 */
public class Circle extends Shape {
    private double radius;

    /**
     *
     * @param radius radius of circle
     */
    public Circle(double radius){
        this.radius=radius;
    }
    /**
     * get the radius of circle
     * @return radius of circle
     */
    public double getRadius() {
        return radius;
    }
    @Override
    public double calculatePerimeter(){

        return 2*3.14*radius;
    }
    @Override
    public double calculateArea(){
        return 3.14*radius*radius;
    }
    @Override
    public void draw(){
        System.out.println("Circle    Perimeter="+this.calculatePerimeter()+"    Area="+this.calculateArea());
    }
    @Override
    public String toString() {
        return "Circle:: "+ this.radius;
    }
    @Override
    public boolean equals(Shape shape){
        if(this==shape)
            return true;
        if(!(shape instanceof Circle))
            return false;
        Circle circle=(Circle)shape;
        return this.radius == circle.getRadius();
    }
}
