package com.company;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Represents a polygon.
 * @author Amirparsa Salmankhah
 * @version 1.0.0
 */
abstract public class Polygon extends Shape {
    //sides
    private ArrayList<Double> sides;

    /**
     * Constructor with var args parameters.
     * @param sides Some double numbers.(sides of the polygon)
     */
    public Polygon(double... sides) {
        this.sides = new ArrayList<>();
        for (double side : sides)
            this.sides.add(side);
        Collections.sort(this.sides);
    }

    /**
     * Gets list of sides.
     * @return List of sides
     */
    public ArrayList<Double> getSides() {
        return sides;
    }

    /**
     * Returns an string containing polygon details.
     * @return polygon details
     */
    @Override
    public String toString() {
        String str = super.toString() + "    ";
        for (int i = 0; i < sides.size(); i++)
            str = str + "Side" + (i + 1) + ":" + sides.get(i) + "  ";
        return str;
    }
}
