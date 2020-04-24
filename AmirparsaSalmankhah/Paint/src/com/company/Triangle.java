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
}