/**
 * This is the shape class
 * most of it's methods will be overridden in it's subclasses
 */
public class Shape {

    /**
     * This is a method to calculate Perimeter
     * This method will be overridden in subclasses
     *
     * @return
     */
    public double calculatePerimeter() {
        return 1;
    }

    /**
     * This is a method to calculate Area
     * This method will be overridden in subclasses
     *
     * @return
     */
    public double calculateArea() {
        return 1;
    }

    /**
     * This is a method to draw a shape
     *
     * @return
     */
    public void draw() {
        System.out.println(this.getClass().getName());
        System.out.println("Perimeter = " + calculatePerimeter());
        System.out.println("Area = " + calculateArea());
    }

    /**
     * This is a method to print a shape
     * This method will be overridden in subclasses
     *
     * @return
     */
    @Override
    public String toString() {
        return "";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
