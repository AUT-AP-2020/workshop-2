package paint.v1;

import java.util.Arrays;

public class Rectangle {
    double[] sides;

    public Rectangle(double s1,double s2,double s3,double s4) {
        this.sides = new double[4];
        sides[0]=s1;
        sides[1]=s2;
        sides[2]=s3;
        sides[3]=s4;
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

        return sides[0]*sides[1];
    }
    public void draw(){
        System.out.println("Rectangle ,"+calculatePerimeter()+","+calculateArea());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        for (int i = 0; i < 3; i++) {
            if(sides[i]!=rectangle.getSides()[i])
                return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "sides=" + Arrays.toString(sides) +
                '}';
    }

}
