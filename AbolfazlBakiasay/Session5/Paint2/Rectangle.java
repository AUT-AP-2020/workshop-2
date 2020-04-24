

public class Rectangle extends Polygon {
	
	public Rectangle(double a, double b, double c, double d) {
		super(a, b, c, d);
	}
	
	public boolean isSquare() {
		for(int i=1;i<getSides().size();i++)
			if(getSides().get(0).doubleValue() != getSides().get(i).doubleValue())
				return false;
		return true;
	}
	
	public double calculateArea() {
		double a = getSides().get(0);
		double b = getSides().get(0).doubleValue() == getSides().get(1).doubleValue() ?
				getSides().get(2) : getSides().get(1);
		return a*b;
	}

	@Override
	public String toString() {
		String res = "";
		for(int i=0;i<getSides().size();i++) {
			double sd = getSides().get(i);
			res += ", side"+(i+1)+": "+sd;
		}
		res = res.substring(2);
		return "Rectangle: " + res;
	}
}
