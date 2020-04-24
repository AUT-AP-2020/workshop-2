import java.util.ArrayList;

public class rectangle extends Polygon {
    public rectangle(int width,int length){
        sides.add(width);
        sides.add(length);
    }
    @Override
    public double calculate_Area() {
        int width=sides.get(0);
        int length=sides.get(1);

        return width*length;
    }

    public boolean isSquare(){
        if(sides.get(0)==sides.get(1)){
            return true;

        }
        else return false;
    }


}
