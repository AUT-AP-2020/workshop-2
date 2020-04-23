import java.util.*;

/**
 * this class is use to add shapes and print information in methods
 * @author Setayesh
 * @version 0.1
 */
public class Paint {
    private ArrayList<Triangle> triangles;
    private ArrayList<Circle> circles;
    private ArrayList<Rectangle> rectangles;

    /**
     * constructor of Paint class that define array lists of sub classes
     */
    public Paint(){
        triangles = new ArrayList<Triangle>();
        circles = new ArrayList<Circle>();
        rectangles = new ArrayList<Rectangle>();
    }

    /**
     * adding a triangle to array list
     * @param triangle the new triangle to add to array list
     */
    public void addTriangle(Triangle triangle){
        triangles.add(triangle);
    }

    /**
     * adding a circle to array list
     * @param circle the new circle  to add to array list
     */
    public void addCircle(Circle circle){
        circles.add(circle);
    }

    /**
     * adding a rectangle to array list
     * @param rectangle the new rectangle  to add to array list
     */
    public void addRectangle(Rectangle rectangle){
        rectangles.add(rectangle);
    }

    /**
     *  print all perimeter and area of array list shapes
     */
    public void drawAll(){
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
        for(Triangle triangle : triangles){
            System.out.println(triangle + "\n");
        }
        for(Circle circle : circles){
            System.out.println(circle + "\n");
        }
        for(Rectangle rectangle : rectangles){
            System.out.println(rectangle + "\n");
        }
    }
}