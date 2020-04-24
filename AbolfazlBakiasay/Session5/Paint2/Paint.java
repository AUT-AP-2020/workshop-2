import java.util.ArrayList;


public class Paint {
	ArrayList<Shape> shapes;
	
	public Paint() {
		shapes = new ArrayList<>();
	}
	
	public void addShape(Shape shape) {
		shapes.add(shape);
	}
	
	public void drawAll() {
		for(Shape shape : shapes)
			shape.draw();
	}
	
	public void describeEqualSides() {
		System.out.println("");
		System.out.println("Equal Side Shapes: ");
		for(Shape shape : shapes) {
			if(shape instanceof Rectangle && ((Rectangle)shape).isSquare())
				System.out.println((Rectangle)shape);
			if(shape instanceof Triangle && ((Triangle)shape).isEquilateral())
				System.out.println((Triangle)shape);
		}
		System.out.println("");
	}

	public void printAll() {
		System.out.println("");
		for(Shape shape : shapes)
			System.out.println(shape);
		System.out.println("");
	}
}


