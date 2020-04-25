
public class Main {

    
    /** 
     * @param args
     */
    public static void main(String[] args) {

        Circle circle1 = new Circle(8);

        Shape circle2 = new Circle(5); 

        Rectangle rectangle1 = new Rectangle(2,4); 
        
        Polygon rectangle2 = new Rectangle(8,5,8,5); 
        
        Rectangle rectangle3 = new Rectangle(6,6,6,6); 
        
        Polygon triangle1 = new Triangle(2,2,2); 
        
        Triangle triangle2 = new Triangle(4,4,6); 
        
        Shape triangle3 = new Triangle(2,2,2);
        
        circle1 = (Circle)circle2; 
        
        rectangle2 = rectangle3; 
        
        triangle1 = (Triangle)triangle3; 
    
        

        
       // System.out.println(rectangle3.toString());

        Paint paint = new Paint();
        paint.addShape(circle1);
        paint.addShape(rectangle3);
        paint.addShape(triangle1);

      //  paint.printAll();
        paint.describeEqualSides();
    }
}