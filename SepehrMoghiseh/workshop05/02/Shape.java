public abstract class Shape {
    abstract public double calculatePerimeter();

    abstract public double calculateArea();

    abstract public void draw();

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
