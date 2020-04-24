public class Shape {
    public double calculatePerimeter() {
        return 1;
    }
    public double calculateArea() {
        return 1;
    }
    public void draw() {
        System.out.println(this.getClass().getName());
        System.out.println("Perimeter = " + calculatePerimeter());
        System.out.println("Area = " + calculateArea());
    }

    public String toString() {
        return "";
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}