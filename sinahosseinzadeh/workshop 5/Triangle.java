import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Objects;

/**
 * @author MORTEZA
 * @version 1.00
 */
public class Triangle {
    private ArrayList<Integer> tool = new ArrayList<Integer>();
    public Triangle(int tool1,int tool2,int tool3)
    {
        tool.add(tool1);
        tool.add(tool2);
        tool.add(tool3);
    }

    /**
     *
     * @return it will provide you with each side size
     */
    public ArrayList<Integer> getTool() {
        return tool;
    }

    /**
     *
     * @param tool it will be the each side length
     */
    public void setTool(ArrayList<Integer> tool) {
        this.tool = tool;
    }

    /**
     * it will determine if the triangle is equilateral
     */
    public void  isEquilateral()
    {
       if (tool.size()>3)
       {
           System.out.println("its not a triangle ");
       }
       else
       {
           if ((tool.get(0)==tool.get(1))&&(tool.get(2)==tool.get(1)))
           {
               System.out.println("it is a equilateral triangles ");
           }
           else
               System.out.println("it is not a equilateral triangles");
       }
    }

    /**
     *
     * @return it will provide us the perimeter usage
     */
    public double calculatePerimeter()
    {
        if (tool.size()>3)
        {
            System.out.println("its not a triangle ");
            return 0.0;
        }
        else {
            double Perimeter = tool.get(0) + tool.get(1) + tool.get(2);
            return Perimeter;
        }
    }

    /**
     *
     * @return it will provide us with the area used
     */
    public double calculateArea()
    {
        double Half = calculatePerimeter();
        double Area = 0.00;
        Area = Math.sqrt((Half)*(Half-tool.get(0))*(Half-tool.get(1))*(Half-tool.get(2)));
        return Area;
    }

    /**
     * show us the valuable info about the shape !
     */
    public void draw ()
    {
        System.out.println("*    *    *    *    *    *    *    *    *    *    *    *");
        System.out.println("its a triangle ");
        isEquilateral();
        System.out.println(calculatePerimeter());
        System.out.println(calculateArea());
        System.out.println("*    *    *    *    *    *    *    *    *    *    *    *");
    }
    @Override
    public String toString() {
        return "Triangle { " +
                "tool= " + tool +
                "   perimeters : " + calculatePerimeter()+
                "   Area  : "+calculateArea()+
                " }";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return Objects.equals(getTool(), triangle.getTool());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTool());
    }
}
