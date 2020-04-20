/**
 * The Shape class implement geometric shapes.
 *
 * @author Amirreza Hashemi
 * @version 1.0
 * @since 4/19/2020
 */
public abstract class Shape {


    /**
     * Calculates perimeter of shape.
     *
     * @return the double perimeter of shape
     */
    abstract public double calculatePerimeter();

    /**
     * Calculates area of shape.
     *
     * @return the double area of shape
     */
    abstract public double calculateArea();

    /**
     * Draws a shape.
     */
    public void draw() {
        System.out.println(getClass().getName() + " : perimeter : " + calculatePerimeter() + " area : " + calculateArea());
    }

    @Override
    abstract public String toString();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return (calculateArea() == shape.calculateArea() && calculatePerimeter() == shape.calculatePerimeter());
    }

}
