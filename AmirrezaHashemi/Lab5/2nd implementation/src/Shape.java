public abstract class Shape {


    abstract public double calculatePerimeter();

    abstract public double calculateArea();

    public void draw() {
        System.out.println(getClass().getName()+" : perimeter : " + calculatePerimeter() + " area : " + calculateArea());
    }

    @Override
    abstract public String toString();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o ;
        return (calculateArea() == shape.calculateArea() && calculatePerimeter() == shape.calculatePerimeter());
    }

}
