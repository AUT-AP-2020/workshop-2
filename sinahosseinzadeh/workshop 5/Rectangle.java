import java.util.ArrayList;
import java.util.Objects;

/**
 * @author morteza
 * @version 1.1
 *
 */
public class Rectangle {
    private ArrayList<Integer> tool = new ArrayList<Integer>();
    boolean square = false;
    public Rectangle(int tool1,int tool2,int tool3,int tool4)
    {
        tool.add(tool1);
        tool.add(tool2);
        tool.add(tool3);
        tool.add(tool4);
    }

    /**
     *
     * @return it will show us the each side size or lengths
     */
    public ArrayList<Integer> getTool() {
        return tool;
    }

    /**
     *
     * @param tool it will be each side length
     */
    public void setTool(ArrayList<Integer> tool) {
        this.tool = tool;
    }

    /**
     * it will check if it is a square or not
     */
    public void  isSquare()
    {
        if (tool.size()>4)
        {
            System.out.println("its not a Rectangle ");
        }
        else
        {
            if ((tool.get(0)==tool.get(1))&&(tool.get(2)==tool.get(1)))
            {
                System.out.println("it is a square  ");
            }
            else
                System.out.println("it is not a square ");
        }
    }

    /**
     *
     * @return its the perimeter occupied by our shape
     */
    public double calculatePerimeter()
    {
        if (tool.size()>4)
        {
            System.out.println("its not a Rectangle ");
            return 0.0;
        }
        else {
            double Perimeter = tool.get(0) + tool.get(1) + tool.get(2)+tool.get(3);
            return Perimeter;
        }
    }

    /**
     *
     * @return its the area occupied by our shape
     */
    public double calculateArea()
    {
        double Half = calculatePerimeter();
        double Area = 0.00;
            if (tool.get(0)!=tool.get(1))
            {
                Area=tool.get(0)*tool.get(1);
            }
            else if (tool.get(0)!=tool.get(2))
            {
                Area=tool.get(0)*tool.get(2);
            }
            else if (tool.get(0)!=tool.get(3))
            {
                Area=tool.get(0)*tool.get(3);
            }
            else
            {
                Area=tool.get(0)*tool.get(3);
            }
        return Area;
    }
    /**
     *  it will represent the best info about our shape
     */
    public void draw ()
    {
        System.out.println("*    *    *    *    *    *    *    *    *    *    *    *");
        System.out.println("its a Rectangle ");
        isSquare();
        System.out.println(calculatePerimeter());
        System.out.println(calculateArea());
        System.out.println("*    *    *    *    *    *    *    *    *    *    *    *");
    }
    @Override
    public String toString() {
        return "Redtangle { " +
                "tool= " + tool +
                "  perimeters : " + calculatePerimeter()+
                "  Area : "+calculateArea()+
                " }";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) o;
        return Objects.equals(getTool(), rectangle.getTool());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTool());
    }
}
