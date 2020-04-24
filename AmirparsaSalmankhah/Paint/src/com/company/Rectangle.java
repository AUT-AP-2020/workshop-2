package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Rectangle extends Polygon{

    public Rectangle(double side1, double side2, double side3, double side4) {
        super(side1,side2,side3,side4);
    }

    public boolean isSquare() {
        boolean check = true;
        for (int i = 0; i < 4; i++)
            for (int j = i + 1; j < 4; j++)
                if (!getSides().get(i).equals(getSides().get(j))) {
                    check = false;
                    break;
                }
        return check;
    }
}
