import java.util.ArrayList;

public abstract class Polygon extends shape {

    ArrayList<Integer> sides=new ArrayList<>();


    public Polygon(int ... args){
        for(int i :args) {
            sides.add(i);
        }
    }

    public String to_string(){
        String string_sides = null;
        for (Integer side:this.sides
             ) {
            string_sides.concat(side.toString());
        }
        return string_sides;
    }

    public double calculate_perimeter(){
        int perimeter=0;
        for (Integer side :sides
             ) {
            perimeter+=side;
        }
        return perimeter;

    }

    public abstract double calculate_Area();

    public ArrayList<Integer> getSides() {
        return sides;
    }

    public boolean equal(triangle x){
        if(x.getSides()==this.getSides()){
            return true;
        }
        else return false;
    }

}
