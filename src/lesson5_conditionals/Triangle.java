package lesson5_conditionals;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        int a, b, c;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the three edges of a triangle:");

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        input.close();

        if( (a+b)>c && (a+c)>b && (b+c)>a){
            System.out.println("The perimeter is:"+ (a + b + c));
        }else{
            System.out.println("This is not a valid triangle!");
        }
    }
}
