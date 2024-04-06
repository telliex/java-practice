package lesson6_while_loop;
import java.util.Scanner;
public class GradeAverage {
    public static void main(String[] args) {
        double inputQueue;
        Scanner input = new Scanner(System.in);
        int num = 0;
        double total = 0;
        System.out.print("Please enter a series of grandes (Separated by space), and put the '-1' at the end.");

        inputQueue = input.nextDouble();

        while(inputQueue!=-1){
            total = total + inputQueue;
            inputQueue = input.nextDouble();
            ++num;
        }
        double result = total / num;
        System.out.printf("The %d items's Average of the queue number is %.2f",num, result );
        input.close();
    }
}
