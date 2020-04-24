package paint.v1;

import java.util.Arrays;

public class Triangle {
    private double[] sides;

    public Triangle(double s1,double s2,double s3) {
        this.sides = new double[3];
        sides[0]=s1;
        sides[1]=s2;
        sides[2]=s3;
    }

    public double[] getSides() {
        return sides;
    }

    public double calculatePerimeter(){
        double perimeter=0;
        for(double side:sides)
            perimeter+=side;
        return perimeter;
    }
    public double calculateArea(){
        double p=calculatePerimeter();
        return Math.sqrt(p*(p-sides[0])*(p-sides[1])*(p-sides[2]));
    }
    public void draw(){
        System.out.println("Triangle ,"+calculatePerimeter()+","+calculateArea());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;
        for (int i = 0; i < 3; i++) {
            if(sides[i]!=triangle.getSides()[i])
                return false;
        }

        return true;
    }
    @Override
    public String toString() {
        return "Triangle{" +
                "sides=" + Arrays.toString(sides) +
                '}';
    }
}
