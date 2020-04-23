/**
 * this class represents a shape generally
 * @author Mahdi Mirfendereski
 * @version 0.0
 */
public class Shape {
    /**
     * calculating shape's Perimeter
     * @return shape's Perimeter
     */
    public double calculatePerimeter(){
        return 0 ;
    }

    /**
     * calculating shape's Area
     * @return shape's Area
     */
    public double calculateArea(){
        return 0;
    }

    /**
     * draw a shape in one line
     */
    public void draw(){
        System.out.println("Perimeter="+this.calculatePerimeter()+"    Area="+this.calculateArea());
    }

    /**
     * note : parameter of this method is Shape type not Object type.
     * to check if both are equal or not
     * @param shape kind of shape
     * @return true if both are equal
     */
    public boolean equals(Shape shape){
        return false;
    }

    @Override
    public String toString() {
        return "";
    }
}
