package paint.v2;

public abstract class Shape {

    public abstract double calculatePerimeter();

    public abstract double calculateArea();

    public abstract boolean equals(Object o);

    public abstract String toString();

    public abstract String type();

    public void draw(){
        System.out.println(type()+" Perimeter"+calculatePerimeter()+" Area"+calculateArea());
    }
}