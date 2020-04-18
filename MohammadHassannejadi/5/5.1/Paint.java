import java.util.*;

/**
 * This class saves circles and triangles and rectangles in 
 * different arraylists and add , draw and print information
 * @author Mohammad Hassannejadi
 * @version 1.0
 */
public class Paint {
    private ArrayList<Triangle> triangles;
    private ArrayList<Circle> circles;
    private ArrayList<Rectangle> rectangles;

    /**
     * constructor of class to new lists
     */
    public Paint(){
        triangles = new ArrayList<Triangle>();
        circles = new ArrayList<Circle>();
        rectangles = new ArrayList<Rectangle>();
    }

    /**
     * adding a triangle from main class
     * @param triangle the triangle we want to add
     */
    public void addTriangle(Triangle triangle){
        triangles.add(triangle);
    }

    /**
     * adding a circle from main class
     * @param circle the circle we want to add
     */
    public void addCircle(Circle circle){
        circles.add(circle);
    }

    /**
     * adding a rectangle from main class
     * @param rect the rectangle we want to add
     */
    public void addRectagnle(Rectangle rectangle){
        rectangles.add(rectangle);
    }

    /**
     *  print all perimeter and area of our shapes
     */
    public void drawAll(){
        System.out.println();
        for(Triangle triangle : triangles){
            triangle.draw();
        }
        for(Circle circle : circles){
            circle.draw();
        }
        for(Rectangle rectangle : rectangles){
            rectangle.draw();
        }  
    }
    /**
     *  print information of shapes
     */
    public void printAll(){
        System.out.println();
        for(Triangle triangle : triangles){
             System.out.println(triangle.toString());
        }
        for(Circle circle : circles){
            System.out.println(circle.toString());
        }
        for(Rectangle rectangle : rectangles){
            System.out.println(rectangle.toString());
        }
    }
}
