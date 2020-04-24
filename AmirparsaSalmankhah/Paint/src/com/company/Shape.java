package com.company;

abstract public class Shape {
    @Override
    public String toString() {
        if(this instanceof Triangle)
            return "Triangle";
        else if(this instanceof Rectangle)
            return "Rectangle";
        return "Circle:    Radius:" + ((Circle)this).getRadius();
    }

    abstract public double calculateArea();

    abstract public double calculatePerimeter();

    public void draw(){
        System.out.println("Area: " + calculateArea() + "    Perimeter: " + calculatePerimeter());
    }

    abstract public boolean equals(Object o);
}
