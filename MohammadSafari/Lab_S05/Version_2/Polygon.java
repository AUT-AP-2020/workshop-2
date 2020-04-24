package MohammadSafari.Lab_S05.Version_2;

import java.util.*;

public abstract class Polygon extends Shape {
    protected double[] sides;

    public Polygon(double... sides) {
        this.sides = sides;
    }

    public double calculatePerimeter() {
        double peri = 0;
        for (int i = 0; i < sides.length; i++) {
            peri += sides[i];
        }
        return peri;
    }

    public abstract double calculateArea();

    /**
     * @return the sides
     */
    public double[] getSides() {
        return sides;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Polygon) {
            Polygon polygon = (Polygon) obj;
            for (int i = 0; i < this.sides.length; i++)
                // finding a starting point
                if (polygon.sides[i] == this.sides[0]) {
                    int k = 0;
                    for (int j = i; (k < this.sides.length); j++, k++) {
                        if (polygon.sides[j % (this.sides.length)] != this.sides[k])
                            break;
                    }
                    if (k == this.sides.length)
                        return true;
                }
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("Polygonal(%lf sides): %s", sides.length, Arrays.toString(sides));
    }

}