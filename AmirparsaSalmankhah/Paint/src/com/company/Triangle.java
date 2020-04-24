package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Triangle extends Polygon{

    public Triangle(double side1, double side2, double side3) {
        super(side1,side2,side3);
    }

    public boolean isEquilateral() {
        return getSides().get(0).equals(getSides().get(1)) && getSides().get(0).equals(getSides().get(2)) && getSides().get(1).equals(getSides().get(2));
    }

    @Override
    public double calculateArea(){
        double p = calculatePerimeter() / 2;
        return Math.sqrt(p * (p - getSides().get(0)) * (p - getSides().get(1)) * (p - getSides().get(2)));
    }

    @Override
    public double calculatePerimeter() {
        return getSides().get(0) + getSides().get(1) + getSides().get(2);
    }

    @Override
    public void draw() {
        System.out.println("Triangle    ");
        super.draw();
    }

    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return triangle.getSides().get(0).equals(getSides().get(0)) && triangle.getSides().get(1).equals(getSides().get(1)) && triangle.getSides().get(2).equals(getSides().get(2));
    }
}