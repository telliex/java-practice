package lesson3_standard_classes;
import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input an integer between 0 and 1000:");

        int num = input.nextInt();
        int result = 0;
        if(num>1000 || num <0){
            System.out.println("Please input an integer between 0 - 1000");
        }else{
            int d3 = num % 10;
            int d2 = (num / 10) % 10;
            int d1 = (num / 100) % 10;
            input.close();
            System.out.println("The sum of all the digits in the integer is :"+ ( d1 + d2 + d3 ));
        }

    }
}
