import javafx.css.converter.LadderConverter;

import java.util.ArrayList;
import java.util.jar.JarOutputStream;

public class Paint {

    ArrayList<shape> shapes=new ArrayList<>();

    public void addShape(shape x){
        shapes.add(x);
    }

    public void draw_all(){
        for (shape shape:shapes) {
            if(shape instanceof Circle){
                System.out.println("Circle:"+"\tperimeter:"+shape.calculate_perimeter()+"\tArea: "+shape.calculate_Area());
            }
            else if(shape instanceof rectangle ){
                System.out.println("Rectangle:"+"\tperimeter:"+shape.calculate_perimeter()+"\tArea: "+shape.calculate_Area());
            }
            else if(shape instanceof triangle){
                System.out.println("Triangle:"+"\tperimeter:"+shape.calculate_perimeter()+"\tArea: "+shape.calculate_Area());

            }
        }
    }

    public void print_all(){
        for (shape shape:shapes) {
            System.out.println("\n");
            if(shape instanceof Circle){
                System.out.println("Circle:"+"\tperimeter:"+shape.calculate_perimeter()+"\tArea: "+shape.calculate_Area());
            }
            else if(shape instanceof rectangle ){
                if(((rectangle) shape).isSquare()) {
                    System.out.println("Rectangle(it is square):" + "\tperimeter:" + shape.calculate_perimeter() + "\tArea: " + shape.calculate_Area());
                }else {
                    System.out.println("Rectangle:" + "\tperimeter:" + shape.calculate_perimeter() + "\tArea: " + shape.calculate_Area());
                }
            }

            else if(shape instanceof triangle){
                if(!((triangle) shape).isEquilateral()) {
                    System.out.println("Triangle:" + "\tperimeter:" + shape.calculate_perimeter() + "\tArea: " + shape.calculate_Area());
                }
                else System.out.println("Triangle(equilateral):"+"\tperimeter:"+shape.calculate_perimeter()+"\tArea: "+shape.calculate_Area());

            }
        }
    }

}
