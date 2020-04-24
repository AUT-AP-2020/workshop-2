// In The Name Of GOD

package lab5New;

/**
 * this class represents an ordinary shape no matter which shape it is because of inheritance
 */
public class Shape {

    /**
     * @return the arena of the shape
     */
    public double calculateArea() {
        return 0;
    }

    /**
     * @return the perimeter of the shape
     */
    public double calculatePerimeter() {
        return 0;
    }

    /**
     * this method tells the area and perimeter of the shape
     */
    public void draw() {
        System.out.print("Area: " + calculateArea() + " And perimeter: " + calculatePerimeter());
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
