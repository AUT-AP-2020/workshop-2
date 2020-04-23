public class Circle {

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
    public double getRadius(){
        return radius;
    }

    /**
     *
     * @return the Circle Perimeter
     */
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     *
     * @return the Circle Area
     */
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    /**
     * show the type and Perimeter and Area of Rectangle
     */
    public void draw(){
        System.out.println("Type : Circle" + " Perimeter: " + calculatePerimeter() + " Area: " + calculateArea());
    }

    /**
     *
     * @param toCompere the compere Circle information
     * @return the value of this two Circle is the same or not
     */
    public boolean equals(Circle toCompere){
        return radius == toCompere.getRadius();
    }

    /**
     *
     * @return a String which contains the type and Radius of Circle
     */
    @Override
    public String toString(){
        return "Type : Triangle" + " radius : " + radius ;
    }

}
