public class Triangle extends Polygon{

    /**
     * constructor which add sides
     * @param sides a list of all side of Triangle
     */
    public Triangle(Double ... sides){
        super(sides);
    }

    /**
     *
     * @return the value of three side is equal or not
     */
    public boolean isEquilateral(){
        return sides.get(0).equals(sides.get(1)) && sides.get(0).equals(sides.get(2));
    }

    /**
     *
     * @return the Perimeter of Triangle
     */
    @Override
    public double calculatePerimeter() {
        return (sides.get(0) + sides.get(1) + sides.get(2));
    }

    /**
     *
     * @return the Area of Triangle
     */
    @Override
    public double calculateArea(){
        double p = calculatePerimeter() / 2;
        double area = p * (p - sides.get(0)) * (p - sides.get(1)) * (p - sides.get(2));
        return Math.sqrt(area);
    }

    /**
     *  show the type and Perimeter and Area of Triangle
     */
    @Override
    public void draw() {
        System.out.println("Triangle : With The Area Of " + calculateArea() + " And The Perimeter Of " + calculatePerimeter());
    }

}
