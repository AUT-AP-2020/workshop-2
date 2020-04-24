/**
 * this class is for all shapes
 * and has abstract methods that can calculate perimeter and area of shape via sub class
 *
 * @author Mohammad Javad Rajabi
 * @version 1.0.0
 * @since 2020-04-10
 */
public abstract class Shape {

    // constructor

    /**
     * Constructor for create shape object
     */
    public Shape() {
    }

    /**
     * This method is used to calculate perimeter in sub class.
     * @return double This returns value of perimeter.
     */
    abstract public double calculatePerimeter();

    /**
     * This method is used to calculate area in sub class.
     * @return double This returns value of area.
     */
    abstract public double calculateArea();

    /**
     * This method is used to draw type of shape are printed via super class
     * and its perimeter and area
     */
    public void draw(){
        System.out.printf("{perimeter = %.2f  area = %.2f}", calculatePerimeter(), calculateArea());
        System.out.println();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    abstract public String toString();
}
