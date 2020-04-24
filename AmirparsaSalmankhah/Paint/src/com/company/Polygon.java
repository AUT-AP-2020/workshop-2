package com.company;

import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collections;

abstract public class Polygon extends Shape {
    //sides
    private ArrayList<Double> sides;

    public Polygon(double... sides) {
        this.sides = new ArrayList<>();
        for (double side : sides)
            this.sides.add(side);
        Collections.sort(this.sides);
    }

    public ArrayList<Double> getSides() {
        return sides;
    }

    @Override
    public String toString() {
        String str = super.toString() + "    ";
        for (int i = 0; i < sides.size(); i++)
            str = str + "Side" + (i + 1) + ":" + sides.get(i) + "  ";
        return str;
    }
}
