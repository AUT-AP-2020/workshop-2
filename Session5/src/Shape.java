abstract public class Shape {
    abstract public double calculatePerimeter();
    abstract public double calculateArea();
    abstract public void draw();

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    abstract public String toString();
}
