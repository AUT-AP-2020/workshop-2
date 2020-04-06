import java.util.Scanner;
/**
 * this is a paint program that draw som predefine shapes .
 * but beware that this drawing is just printing the names and sizes on board.
 */
public class RunMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Paint paint = new Paint();
        paint.addShape(new Circle(4.5));
        paint.addShape(new Triangle(3,3,3));
        paint.addShape(new Triangle(3,3.5,3));
        paint.addShape(new Rectangle(4,5,4,5));
        paint.addShape(new Rectangle(2,2,2,2));

        int oper = 10;
        while (oper != 7)
        {
            menu();
            oper = scanner.nextInt();
            switch (oper)
            {
                case 1:
                    addShape(paint);
                    break;
                case 2:
                    paint.printAll();
                    break;
                case 3:
                    paint.drawAll();
                    break;
                case 4:
                    drawShape(paint);
                    break;
                case 5:
                    findEquals(paint);
                case 6:
                    paint.describeEqualSides();

            }
        }
    }

    /**
     * draw a specific shape that is choose from list of shapes.
     * @param paint paint object that this shape belongs to.
     */
    private static void drawShape(Paint paint)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number of shape in list.");
        try {
            paint.getShapes().get(scanner.nextInt()-1).draw();
        }catch (IndexOutOfBoundsException e)
        {
            System.out.println("not valid number. take a look at list of shapes.");
        }
    }

    /**
     * find an equal shape among shapes of this object.
     * @param paint paint object to be checked
     */
    private static  void findEquals(Paint paint)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1-circle   2-Triangle   3-rectangle");
        int oper = scanner.nextInt();
        int i = 1;
        Shape shapeToBeFound = new Shape();
        switch (oper)
        {
            case 1:
                System.out.println("enter radius for circle");
                shapeToBeFound = new Circle(scanner.nextDouble());
                break;
            case 2:
                System.out.println("enter 3 sides of triangle.");
                 shapeToBeFound = new Triangle(scanner.nextDouble(),scanner.nextDouble(),scanner.nextDouble());
                break;
            case 3:
                System.out.println("enter length for rectangle");
                double length = scanner.nextDouble();
                System.out.println("enter width for rectangle");
                double width = scanner.nextDouble();
                 shapeToBeFound = new Rectangle(length,width,length,width);
                break;
        }
        for(Shape shape : paint.getShapes()) {
            if (shape.equals(shapeToBeFound))
                System.out.println("" +i+ "- " +shape);
            i ++;
        }
    }

    /**
     * add a new shape to shape of this class
     * @param paint paint class that the new shape should be added to.
     */
    private static void addShape(Paint paint)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1-circle   2-Triangle   3-rectangle");
        int oper = scanner.nextInt();
        Shape shapeToBeAdded = new Shape();
        switch (oper)
        {
            case 1:
                System.out.println("enter radius for circle");
                shapeToBeAdded = new Circle(scanner.nextDouble());
                break;
            case 2:
                System.out.println("enter 3 sides of triangle.");
                shapeToBeAdded  = new Triangle(scanner.nextDouble(),scanner.nextDouble(),scanner.nextDouble());
                break;
            case 3:
                System.out.println("enter length for rectangle");
                double length = scanner.nextDouble();
                System.out.println("enter width for rectangle");
                double width = scanner.nextDouble();
                shapeToBeAdded  = new Rectangle(length,width,length,width);
                break;
        }
        paint.addShape(shapeToBeAdded);
    }

    /**
     * just prints the menu.
     */
    private static void menu()
    {
        System.out.println( "\n1-make a shape\n"+
                "2-print all shape\n" +
                "3-draw all shapes\n"+
                "4-draw specific shape of list\n" +
                "5-find equal shapes like given shape\n"+
                "6-print squares and equilateral triangles\n"+
                "7-exit");
    }
}
