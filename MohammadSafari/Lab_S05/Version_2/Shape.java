package MohammadSafari.Lab_S05.Version_2;

public abstract class Shape {
    public abstract double calculatePerimeter();

    public abstract double calculateArea();

    public void draw(){
        System.out.println(toString());
        System.out.printf("perimeter: %f, area: %f\n", calculatePerimeter(), calculateArea());
    }

    @Override
    public abstract boolean equals(Object obj);

    @Override
    public abstract String toString();
}