package com.company;

public class Shape {
    @Override
    public String toString() {
        if(this instanceof Triangle)
            return "Triangle";
        else if(this instanceof Rectangle)
            return "Rectangle";
        return "Circle";
    }

    public double calculateArea(){
        if(this instanceof Triangle){
            Triangle tmp = (Triangle) this;
            double p = calculatePerimeter() / 2;
            return Math.sqrt(p * (p - tmp.getSides().get(0)) * (p - tmp.getSides().get(1)) * (p - tmp.getSides().get(2)));
        }
        else if (this instanceof Rectangle){
            Rectangle tmp = (Rectangle) this;
            return tmp.getSides().get(0) * tmp.getSides().get(2);
        }
        Circle tmp = (Circle) this;
        return Math.pow(tmp.getRadius(), 2) * Math.PI;
    }

    public double calculatePerimeter(){
        if(this instanceof Triangle){
            Triangle tmp = (Triangle) this;
            return tmp.getSides().get(0) + tmp.getSides().get(1) + tmp.getSides().get(2);
        }
        else if (this instanceof Rectangle){
            Rectangle tmp = (Rectangle) this;
            return 2 * (tmp.getSides().get(0) + tmp.getSides().get(2));
        }
        Circle tmp = (Circle) this;
        return 2 * tmp.getRadius() * Math.PI;
    }

    public void draw(){
        if(this instanceof Triangle)
            System.out.print("Triangle    ");
        else if(this instanceof Rectangle)
            System.out.print("Rectangle    ");
        else if(this instanceof Circle)
            System.out.print("Circle    ");
        System.out.print("Area: " + calculateArea() + "Perimeter: " + calculatePerimeter());
    }

    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if(this instanceof Rectangle) {
            Rectangle tmp = (Rectangle) this;
            Rectangle rectangle = (Rectangle) o;
            return rectangle.getSides().get(0).equals(tmp.getSides().get(0)) && rectangle.getSides().get(2).equals(tmp.getSides().get(2));
        }
        else if(this instanceof Triangle){
            Triangle tmp = (Triangle) this;
            Triangle triangle = (Triangle) o;
            return triangle.getSides().get(0).equals(tmp.getSides().get(0)) && triangle.getSides().get(1).equals(tmp.getSides().get(1)) && triangle.getSides().get(2).equals(tmp.getSides().get(2));
        }
        Circle tmp = (Circle) this;
        Circle circle = (Circle)  o;
        return tmp.getRadius() == circle.getRadius();
    }
}
