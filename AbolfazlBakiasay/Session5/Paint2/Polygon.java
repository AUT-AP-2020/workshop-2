import java.util.ArrayList;
import java.util.Arrays;


public class Polygon extends Shape {
	
	private ArrayList<Double> sides;
	
	public Polygon(Double... sides) {
		this.sides = new ArrayList<>(Arrays.asList(sides));
	}

	public ArrayList<Double> getSides() {
		return sides;
	}
	
	@Override
	public String toString() {
		String res = "";
		for(int i=0;i<sides.size();i++) {
			double sd = sides.get(i);
			res += ", side"+(i+1)+": "+sd;
		}
		res = res.substring(2);
		return "Polygon: " + res;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!(obj instanceof Polygon)) return false;
		return ((Polygon)obj).equals(sides);
	}

	public double calculatePerimeter() {
		double res = 0;
		for(Double d:getSides())
			res += d.doubleValue();
		return res;
	}

}
