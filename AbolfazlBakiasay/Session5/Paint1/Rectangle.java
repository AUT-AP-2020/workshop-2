import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;




public class Rectangle {
	
	private ArrayList<Double> sides;
	
	public Rectangle(double a, double b, double c, double d) {
		sides = new ArrayList<>();
		sides.add(a);sides.add(b);sides.add(c);sides.add(d);
	}
	
	public ArrayList<Double> getSides() {
		return sides;
	}

	public boolean isSquare() {
		for(int i=1;i<sides.size();i++)
			if(sides.get(0).doubleValue() != sides.get(i).doubleValue())
				return false;
		return true;
	}

	public double calculatePerimeter() {
		double res = 0;
		for(Double d:sides)
			res += d.doubleValue();
		return res;
	}
	
	public double calculateArea() {
		double a = sides.get(0);
		double b = sides.get(0).doubleValue() == sides.get(1).doubleValue() ? sides.get(2) : sides.get(1);
		return a*b;
	}
	
	public void draw() {
		///	Draw The Rectangle Here
		System.out.println("Drawing Rectangle");
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!(obj instanceof Rectangle)) return false;
		Rectangle rect = (Rectangle) obj;
		Set<Double> rects = new HashSet<>(rect.getSides());
		Set<Double> set = new HashSet<>(sides);		
		return set.equals(rects);
	}

	@Override
	public String toString() {
		String res = "";
		for(Double d:sides)
			res += ", "+d.toString();
		res = res.substring(2);
		return "Rectangle: "+res;
	}
}
