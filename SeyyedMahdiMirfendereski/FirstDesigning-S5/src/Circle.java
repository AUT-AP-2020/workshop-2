
/**
 * this class represents a circle class .
 * @version 0.0
 * @author Mahdi Mirfendereski
 */
public class Circle {
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
     * @return radius
     */
    public double getRadius() {
        return radius;
    }
    /**
     * calculating circle's Perimeter
     * @return circle's Perimeter
     */
    public double calculatePerimeter(){

        return 2*3.14*radius;
    }

    /**
     * calculating circle's Area
     * @return circle's Area
     */
    public double calculateArea(){
        return 3.14*radius*radius;
    }
    /**
     * draw a circle in a line
     */
    public void draw(){
        System.out.println("Circle    Perimeter="+this.calculatePerimeter()+"    Area="+this.calculateArea());
    }
    /**
     * note : parameter of this method is Circle type not Object type.
     * @param circle Circle type
     * @return true if circle and this object are equal.
     */
    public boolean equals(Circle circle){
        if(this==circle)
            return true;

        return this.radius == circle.getRadius();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" +radius+
                '}';
    }
}
