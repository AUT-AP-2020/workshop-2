import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class Triangle {
	
	private ArrayList<Double> sides;
	
	public Triangle(double a, double b, double c) {
		sides = new ArrayList<>();
		sides.add(a);sides.add(b);sides.add(c);
	}
	
	public ArrayList<Double> getSides() {
		return sides;
	}

	public boolean isEquilateral() {
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
		double	a = sides.get(0),
				b = sides.get(1),
				c = sides.get(2);
		double s = calculatePerimeter()/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	
	public void draw() {
		///	Draw The Triangle Here
		System.out.println("Drawing Triangle");
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!(obj instanceof Triangle)) return false;		
		Triangle tri = (Triangle) obj;
		Set<Double> tris = new HashSet<>(tri.getSides());
		Set<Double> set = new HashSet<>(sides);		
		return set.equals(tris);
	}

	@Override
	public String toString() {
		String res = "";
		for(Double d:sides)
			res += ", "+d.toString();
		res = res.substring(2);
		return "Triangle: "+res;
	}
}
