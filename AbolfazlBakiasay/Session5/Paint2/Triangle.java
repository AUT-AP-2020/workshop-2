

public class Triangle extends Polygon {
	
	public Triangle(double a, double b, double c) {
		super(a, b, c);
	}

	public boolean isEquilateral() {
		for(int i=1;i<getSides().size();i++)
			if(getSides().get(0).doubleValue() != getSides().get(i).doubleValue())
				return false;
		return true;
	}

	public double calculateArea() {
		double	a = getSides().get(0),
				b = getSides().get(1),
				c = getSides().get(2);
		double s = calculatePerimeter()/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}

	@Override
	public String toString() {
		String res = "";
		for(int i=0;i<getSides().size();i++) {
			double sd = getSides().get(i);
			res += ", side"+(i+1)+": "+sd;
		}
		res = res.substring(2);
		return "Triangle: " + res;
	}
}
