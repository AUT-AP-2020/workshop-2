package com.company;

public class Circle {
    //radius
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calculatePerimeter() {
        return 2 * radius * Math.PI;
    }

    public double calculateArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    public void draw() {
        System.out.println("Circle    Area: " + calculateArea() + "    Perimeter: " + calculatePerimeter());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Radius=" + radius +
                '}';
    }
}
