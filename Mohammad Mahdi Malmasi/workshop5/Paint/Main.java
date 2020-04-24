/**
 * A test of classes
 * 
 * @author Mohammad Mahdi Malmasi
 * @version 0.1.0
 */
public class Main {

    public static void main(String[] args) 
    {
        Circle circle1 = new Circle(19);

        Shape circle2 = new Circle(3); 

        Rectangle rect1 = new Rectangle(1,4); 
        
        Polygon rect2 = new Rectangle(8,5,8,5); 
        
        Rectangle rect3 = new Rectangle(6,6,6,6); 
        
        Polygon tri1 = new Triangle(2,2,2); 
        
        Triangle tri2 = new Triangle(4,4,6); 
        
        Shape tri3 = new Triangle(2,2,2);
        
        circle1 = (Circle)circle2; 
        
        rect2 = rect3; 
        
        tri1 = (Triangle)tri3; 
        
        //cricle2 = tri3; 
        
        tri3 = tri2;
        
        rect3 = new Rectangle(2,3,2);
        
        System.out.println(rect3.toString());
    }
}
