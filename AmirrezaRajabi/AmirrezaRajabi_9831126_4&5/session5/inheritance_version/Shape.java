/**
 * shape class for extending
 */
public class Shape {

    /**
     * calculate Perimeter (override)
     * @return 0
     */
    public double calculatePerimeter() {
        return 0;
    }

    /**
     * calculate Area(override)
     * @return 1
     */
    public double calculateArea() {
        return 1;
    }

    /**
     * draw a shape
     */
    public void draw() {
        System.out.println(this.getClass().getName());
        System.out.println("perimeter: " + calculatePerimeter());
        System.out.println("area: " + calculateArea());
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /**
     * shape to string
     * @return
     */
    @Override
    public String toString() {
        return "";
    }
}
