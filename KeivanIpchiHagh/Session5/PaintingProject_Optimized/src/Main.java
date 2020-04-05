import java.text.DecimalFormat;
import java.text.Format;
import java.util.Random;

public class Main {

    public static Random random = new Random();

    public static void main(String[] args) {

        // Create a paint obj
        Paint paint = new Paint();

        // A modern approach (:
        for (int i = 0; i < 10; i++) {
            float chance = random.nextFloat();
            double side1 = formatter(random.nextDouble() * 10);
            double side2 = formatter(random.nextDouble() * 10);
            double side3 = formatter(random.nextDouble() * 10);

            if (chance > 0.03 && chance < 0.33)   // 30% for circle
                paint.addShape(new Circle(side1));
            else if (chance >= 0.33 && chance < 0.63) {   // 33% for rectangle
                if (random.nextFloat() < 0.7) // 70% for ordinary
                    paint.addShape(new Rectangle(side1, side1, side2, side2));
                else    // 30% for square
                    paint.addShape(new Rectangle(side3, side3, side3, side3));
            } else {    // 34% for triangle

                if (random.nextFloat() < 0.7) // 70% For ordinary
                    paint.addShape(new Triangle(side1, side2, side3));
                else    // 30% for Equilateral
                    paint.addShape(new Triangle(side1, side1, side1));
            }
        }

        // Draw everything
        paint.drawAll();

        System.out.println();

        // Print everything
        paint.printAll();

        System.out.println();

        // Describe everything
        paint.describeEqualSides();
    }

    public static double formatter(double rand) {
        DecimalFormat DF = new DecimalFormat("#0.00");  // Regex
        return Double.parseDouble(DF.format(rand));
    }
}
