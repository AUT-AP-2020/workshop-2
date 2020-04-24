public class triangle extends Polygon{

    public triangle(int side1,int side2,int side3){
        sides.add(side1);
        sides.add(side2);
        sides.add(side3);
    }

    @Override
    public double calculate_Area() {
        double primeter=this.calculate_perimeter();
        double x=primeter/2;
        x=x*(x-sides.get(0))*(x-sides.get(1))*(x-sides.get(2));
        double Area=Math.pow(x,0.5);
        return Area;
    }

    public boolean isEquilateral(){
        if((sides.get(0)==sides.get(1))&&(sides.get(1)==sides.get(2))){
            return true;
        }
        else return false;
    }


}
