package lesson5_conditionals;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        displayMenu();
        Scanner input = new Scanner(System.in);
        System.out.println("Choose an operation(1-4):");
        int operation= input.nextInt();


        int a ,b;
        a = nextStep("first");
        b = nextStep("second");
        calculate(operation,a , b);
        input.close();

    }

    private static void displayMenu(){
        System.out.println("--------Operation-------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("------------------------");
    }

    private static void calculate(int op, int n1, int n2){
        switch(op){
            case 1:
                System.out.printf("%d + %d = %d", n1, n2 , n1 + n2);
                break;
            case 2:
                System.out.printf("%d - %d = %d", n1, n2 , n1 - n2);
                break;
            case 3:
                System.out.printf("%d * %d = %d", n1, n2 , n1 * n2);
                break;
            case 4:
                System.out.printf("%d / %d = %d", n1, n2 , n1 / n2);
                break;
            default:
                System.out.println("Please choose an operation 1-4");
                break;
        }
    }
    private static int nextStep(String step){
        Scanner input = new Scanner(System.in);
        int number;
        if(step=="first"){
            System.out.println("Enter the first integer number:");
        }else{
            System.out.println("Enter the second integer number:");
        }

        number = input.nextInt();

        return number;
    }
}
