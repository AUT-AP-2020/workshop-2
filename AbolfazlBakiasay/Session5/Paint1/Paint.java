import java.util.ArrayList;


public class Paint {
	ArrayList<Triangle> triangles;
	ArrayList<Rectangle> rectangles;
	ArrayList<Circle> circles;
	
	public Paint() {
		triangles = new ArrayList<>();
		rectangles = new ArrayList<>();
		circles = new ArrayList<>();
	}
	
	public void addTriangle(Triangle triangle) {
		triangles.add(triangle);
	}
	
	public void addRectangle(Rectangle rectangle) {
		rectangles.add(rectangle);
	}
	
	public void addCircle(Circle circle) {
		circles.add(circle);
	}
	
	public void drawAll() {
		for(Triangle t : triangles)
			t.draw();
		for(Rectangle r : rectangles)
			r.draw();
		for(Circle c : circles)
			c.draw();
	}	

	public void printAll() {
		System.out.println("");
		for(Triangle t : triangles)
			System.out.println(t);
		for(Rectangle r : rectangles)
			System.out.println(r);
		for(Circle c : circles)
			System.out.println(c);
		System.out.println("");
	}
}


