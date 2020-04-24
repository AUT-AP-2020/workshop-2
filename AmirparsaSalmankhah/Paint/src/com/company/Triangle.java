package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Triangle {
    //list of sides
    private ArrayList<Double> sides;

    public Triangle(double side1, double side2, double side3) {
        sides = new ArrayList<>();
        sides.add(side1);
        sides.add(side2);
        sides.add(side3);
        Collections.sort(sides);
    }

    public ArrayList<Double> getSides() {
        return sides;
    }

    public boolean isEquilateral() {
        return sides.get(0).equals(sides.get(1)) && sides.get(0).equals(sides.get(2)) && sides.get(1).equals(sides.get(2));
    }

    public double calculatePerimeter() {
        return sides.get(0) + sides.get(1) + sides.get(2);
    }

    public double calculateArea() {
        double p = calculatePerimeter() / 2;
        return Math.sqrt(p * (p - sides.get(0)) * (p - sides.get(1)) * (p - sides.get(2)));
    }

    public void draw() {
        System.out.println("Triangle    Area: " + calculateArea() + "    Perimeter: " + calculatePerimeter());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return sides.get(0).equals(triangle.sides.get(0)) && sides.get(1).equals(triangle.sides.get(1)) && sides.get(2).equals(triangle.sides.get(2));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sides=" + sides.get(0) + " " + sides.get(1) + " " + sides.get(2) +
                '}';
    }
}