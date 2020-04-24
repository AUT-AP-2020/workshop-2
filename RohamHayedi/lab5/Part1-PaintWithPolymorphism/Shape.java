public class Shape extends Paint {

    public double calculateParameter() {
        return 0;
    }

    public double calculateArea() {
        return 0;
    }

    public void draw(){}

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        if (this instanceof Triangle)
            return "Triangle:: ";
        else if (this instanceof Rectangle)
            return "Rectangle:: ";
        else if (this instanceof Circle)
            return "Circle:: ";
        return super.toString();
    }
}
