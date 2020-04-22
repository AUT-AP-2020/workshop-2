package paint;

public class Shape {
    public double calculatePerimeter(){

        return 0;
    }
    public double calculateArea(){
        return 0;
    }
    public void Draw(){

    }

    @Override
    public boolean equals(Object obj) {
        if (this instanceof Circle && obj instanceof Circle){
            if(((Circle) this).getRadius() == ((Circle) obj).getRadius()){
                return true;
            }
        }
        else if (this instanceof Polygon && obj instanceof Polygon){
                if (((Polygon) this).sides.equals(((Polygon) obj).sides)){
                    return true;
                }
        }
        return false;
    }

    @Override
    public String toString() {
        if (this instanceof Circle){
            return "Circle:: radius : " + ((Circle) this).getRadius();
        }
        if (this instanceof Rectangle){
            if (((Rectangle) this).isEqual()){
                return "Square:: sides : " + ((Rectangle) this).sides.get(0) ;
            }
            else {
                String s = "Rectangle:: ";
                int j = 1;
                for (Integer i : ((Rectangle) this).sides){
                    s += "side" + j + ":" + i + " ";
                    j++;
                }
                return s;
            }
        }
        if (this instanceof Triangle){
            if (((Triangle) this).isEqual()){
                return "Equilateral:: sides : " + ((Triangle) this).sides.get(0);
            }
            else {
                String s = "Triangle:: ";
                int j = 1;
                for (Integer i : ((Triangle) this).sides){
                    s += "side" + j + ":" + i + " ";
                    j++;
                }
                return s;
            }
        }
        return "";
    }
}
