public class Triangle extends Polygon {

    public Triangle(Double... sidesArg) {
        super(sidesArg);
    }

    @Override
    public double calculateArea() {
        double p = calculatePerimeter()/2;
        return ( Math.sqrt (Math.abs( p* (p-sides.get(0))* (p-sides.get(1)) *(p-sides.get(2)))));
    }
    public boolean isEquilateral‬‬()
    {
        return (sides.get(0).equals(sides.get(1)) && sides.get(1).equals(sides.get(2)));
    }
}
