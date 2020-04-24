public class Circle extends shape{
    private Integer radius=0;

    public Circle(int radius){

        this.radius=radius;
    }

    public boolean equal(Circle x){
        if(this.getRadius()==x.getRadius()){
            return true;
        }
        else return false;
    }

    public String to_string(){
        return radius.toString();
    }

    public double calculate_perimeter() {
        return 2*3.14*radius;
    }

    public double calculate_Area(){
        return 3.14*(Math.pow(radius,2));
    }

    public int getRadius() {
        return radius;
    }
}


