


public class Circle {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double calculatePerimeter() {
		return 2 * Math.PI * radius;
	}
	
	public double calculateArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	public void draw() {
		///	Draw The Circle Here
		System.out.println("Drawing Cirle");
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!(obj instanceof Circle)) return false;
		return radius == ((Circle)obj).getRadius();
	}

	@Override
	public String toString() {
		return "Circle: "+Double.toString(radius);
	}

}
