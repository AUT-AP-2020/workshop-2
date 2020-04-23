import java.util.ArrayList;

public class Paint {

    private ArrayList<Triangle> triangles;
    private ArrayList<Circle> circles;
    private ArrayList<Rectangle> rectangles;

    /**
     * constructor which creat three ArrayList
     */
    public Paint(){
        triangles = new ArrayList<>();
        circles = new ArrayList<>();
        rectangles = new ArrayList<>();
    }

    /**
     * add a Triangle
     * @param addTriangle the Triangle is add
     */
    public void addTriangle(Triangle addTriangle){
        triangles.add(addTriangle);
    }

    /**
     * add a Circle
     * @param addCircle the Circle is add
     */
    public void addCircle(Circle addCircle){
        circles.add(addCircle);
    }

    /**
     * add a Rectangle
     * @param addRectangle the Rectangle is add
     */
    public void addRectangle(Rectangle addRectangle){
        rectangles.add(addRectangle);
    }

    /**
     * show the type and Perimeter and Area of all shapes
     */
    public void drawAll(){

        for(Triangle triangle : triangles) {
            triangle.draw();
        }

        for(Circle circle : circles) {
            circle.draw();
        }

        for(Rectangle rectangle : rectangles) {
            rectangle.draw();
        }

    }

    /**
     * show the type and sides or radius of all shapes
     */
    public void printAll(){

        for (Circle circle : circles) {
            System.out.println(circle.toString());
        }

        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle.toString());
        }

        for (Triangle triangle : triangles) {
            System.out.println(triangle.toString());
        }

    }

}
