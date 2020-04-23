public class Rectangle extends Polygon{

    /**
     * constructor which add sides
     * @param sides a list of all side of Rectangle
     */
    public Rectangle(Double ... sides){
        super(sides);
    }

    /**
     *
     * @return the value of length is equals width
     */
    public boolean isSquare(){
        return sides.get(0).equals(sides.get(1));
    }

    /**
     *
     * @return the Perimeter of Rectangle
     */
    @Override
    public double calculatePerimeter() {
        return 2 * (sides.get(0) + sides.get(1));
    }

    /**
     *
     * @return the Area of Rectangle
     */
    @Override
    public double calculateArea(){
        return sides.get(0) * sides.get(1);
    }

    /**
     *  show the type and Perimeter and Area of Rectangle
     */
    @Override
    public void draw() {
        System.out.println("Rectangle : With The Area Of " + calculateArea() + " And The Perimeter Of " + calculatePerimeter());
    }

}
