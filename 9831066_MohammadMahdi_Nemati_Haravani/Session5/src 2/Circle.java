public class Circle extends Shape{

    private double radius;

    /**
     * constructor for creat a Circle
     * @param radius is the Radius of Circle
     */
    public Circle(Double radius){
        this.radius = radius;
    }

    /**
     *
     * @return the Radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     *
     * @return the Circle Perimeter
     */
    @Override
    public final double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     *
     * @return the Circle Area
     */
    @Override
    public final double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    /**
     *  show the type and Perimeter and Area of Circle
     */
    @Override
    public void draw() {
        System.out.println("Circle : With The Area Of " + calculateArea() + " And The Perimeter Of " + calculatePerimeter());
    }

    /**
     *
     * @param toCompere the compere Circle information
     * @return the value of this two Circle is the same or not
     */
    @Override
    public final boolean equals(Object toCompere) {
        if(toCompere instanceof Circle) {
            return radius == ((Circle) toCompere).getRadius();
        } else {
            return false;
        }
    }

    /**
     *
     * @return a String which contains the type , Radius of Circle
     */
    @Override
    public String toString() {
        return "Circle { Radius : " + radius + " }";
    }

}
