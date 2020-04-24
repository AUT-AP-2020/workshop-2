package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Rectangle {
    //list of sides
    private ArrayList<Double> sides;

    public Rectangle(double side1, double side2, double side3, double side4) {
        sides = new ArrayList<>();
        sides.add(side1);
        sides.add(side2);
        sides.add(side3);
        sides.add(side4);
        Collections.sort(sides);
    }

    public ArrayList<Double> getSides() {
        return sides;
    }

    public boolean isSquare() {
        boolean check = true;
        for (int i = 0; i < 4; i++)
            for (int j = i + 1; j < 4; j++)
                if (!sides.get(i).equals(sides.get(j))) {
                    check = false;
                    break;
                }
        return check;
    }

    public double calculatePerimeter() {
        return sides.get(0) + sides.get(1) + sides.get(2) + sides.get(3);
    }

    public double calculateArea() {
        return sides.get(0) * sides.get(2);
    }

    public void draw() {
        System.out.println("Rectangle    Area: " + calculateArea() + "    Perimeter: " + calculatePerimeter());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return sides.get(0).equals(rectangle.sides.get(0)) && sides.get(2).equals(rectangle.sides.get(2));
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sides=" + sides.get(0) + " " + sides.get(1) + " " + sides.get(2) + " " + sides.get(3) +
                '}';
    }
}
