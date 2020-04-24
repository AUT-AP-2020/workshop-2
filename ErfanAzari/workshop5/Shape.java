/**
 * This is an abstract class which holds the common features among all the shapes.
 */

abstract public class Shape {

    /**
     * Each shape has a perimeter
     * @return the perimeter of the shape
     */
    abstract public double calculatePerimeter();

    /**
     * Each shape has an area.
     * @return the area of the shape
     */
    abstract public double calculateArea();

    /**
     * Each shape has a draw method which print the perimeter and area of the shape
     */
    abstract public void draw();

    abstract public String toString();
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
