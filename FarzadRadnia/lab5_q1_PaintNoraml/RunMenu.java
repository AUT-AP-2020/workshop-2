import java.util.Scanner;
/**
 * this is a paint program that draw som predefine shapes .
 * but beware that this drawing is just printing the names and sizes on board.
 */
public class RunMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Paint paint = new Paint();
        int oper = 10;
        while (oper != 6)
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

             }
        }
    }

    /**
     * draw a specific shape that os choose from list of shapes.
     * @param paint paint object that this shape belongs to.
     */
    private static void drawShape(Paint paint)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number of shape in list.");
        try {
            int number = scanner.nextInt();
            if(number <= paint.getCircles().size())
                paint.getCircles().get(number-1).draw();
            else if(number <= paint.getCircles().size() + paint.getRectangles().size())
                paint.getRectangles().get(number - 1 - paint.getCircles().size() ).draw();
            else
                paint.getTriangles().get(number - 1 - paint.getCircles().size() - paint.getRectangles().size()).draw();
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
        switch (oper)
        {
            case 1:
                System.out.println("enter radius for circle");
                Circle newCircle = new Circle(scanner.nextDouble());
                for(Circle circle : paint.getCircles()) {
                    if (circle.equals(newCircle))
                        System.out.println("" +i+ "- " +circle);
                    i++;
                }

                break;
            case 2:
                System.out.println("enter 3 sides of triangle.");
                Triangle newTriangle = new Triangle(scanner.nextDouble(),scanner.nextDouble(),scanner.nextDouble());
                for(Triangle triangle : paint.getTriangles()) {
                    if (triangle.equals(newTriangle))
                        System.out.println("" +i+ "- " +triangle);
                    i++;
                }
                break;
            case 3:
                System.out.println("enter length for rectangle");
                double length = scanner.nextDouble();
                System.out.println("enter width for rectangle");
                double width = scanner.nextDouble();
                Rectangle newRectangle = new Rectangle(length,width,length,width);
                for(Rectangle rectangle : paint.getRectangles()) {
                    if (rectangle.equals(newRectangle))
                        System.out.println("" +i+ "- " +rectangle);
                    i ++;
                }
                break;
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
        switch (oper)
        {
            case 1:
                System.out.println("enter radius for circle");
                Circle newCircle = new Circle(scanner.nextDouble());
                paint.addCircle(newCircle);
                break;
            case 2:
                System.out.println("enter 3 sides of triangle.");
                Triangle newTriangle = new Triangle(scanner.nextDouble(),scanner.nextDouble(),scanner.nextDouble());
                paint.addTriangle(newTriangle);
                break;
            case 3:
                System.out.println("enter length for rectangle");
                double length = scanner.nextDouble();
                System.out.println("enter width for rectangle");
                double width = scanner.nextDouble();
                Rectangle rectangle = new Rectangle(length,width,length,width);
                paint.addRectangle(rectangle);
                break;
        }
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
                            "5-exit");
    }
}
