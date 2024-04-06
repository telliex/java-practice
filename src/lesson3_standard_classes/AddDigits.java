package lesson3_standard_classes;
import java.util.Scanner;

public class AddDigits {
    public static void main(String[] args) {
        int a, b, c;

        Scanner input =  new Scanner(System.in);
        System.out.println("Enter the 3 coefficients (integers):");

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        input.close();

        System.out.printf("The three coefficients are %d , %d and %d . \n",a, b, c );

        double discriminant = Math.pow(b, 2) - 4 * a * c;
        if (discriminant < 0) {
            System.out.println("The equation has no real roots.");
        } else {
            double resultP = (-b + Math.sqrt(discriminant)) / (2 * a);
            double resultN = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("The two roots are %.2f and %.2f.", resultP, resultN);
        }
        input.close();
    }
}
