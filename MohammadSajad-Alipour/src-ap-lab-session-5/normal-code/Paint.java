import java.util.ArrayList;

public class Paint {
    private ArrayList<Triangle> triangles=new ArrayList<>();
    private ArrayList<Circle> circles=new ArrayList<>();
    private ArrayList<Rectangle> rectangles=new ArrayList<>();

    public void addTriangle(Triangle triangleToAdd){
        triangles.add(triangleToAdd);
    }

    public void addCircle(Circle circleToAdd){
        circles.add(circleToAdd);
    }

    public void addRectangle(Rectangle rectangleToAdd){
        rectangles.add(rectangleToAdd);
    }
    public void drawAll(){
        for(Triangle triangle:triangles){
            triangle.draw();
        }
        for(Circle circle:circles){
            circle.draw();
        }
        for(Rectangle rectangle:rectangles){
            rectangle.draw();
        }
    }
    public void printAll(){
        for(Triangle triangle:triangles){
            System.out.println(triangle);
        }
        for(Circle circle:circles){
            System.out.println(circle);
        }
        for(Rectangle rectangle:rectangles){
            System.out.println(rectangle);
        }
    }
}
