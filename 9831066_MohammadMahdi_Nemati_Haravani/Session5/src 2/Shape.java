public abstract class Shape {

    /**
     * To calculate the perimeter.
     * @return the perimeter
     */
    public abstract double calculatePerimeter() ;

    /**
     * To calculate the area.
     * @return the area.
     */
    public abstract double calculateArea();

    /**
     * This method is to show the
     * area and the perimeter of a shape.
     */
    public abstract void draw();

    /**
     *
     * @param toCompere the compere Shape information
     * @return the value of this two Shape is the same or not
     */
    public abstract boolean equals(Object toCompere);


}
