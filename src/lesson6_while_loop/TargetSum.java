package lesson6_while_loop;
import java.util.Scanner;
public class TargetSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("-Enter a target sum");
        int sum = input.nextInt();
        int result = calculate(sum);
        input.close();
        System.out.println("the smallest number to reach the target sum is "+result);

    }

    private static int calculate(int num){
        int next = 1;
        int total = 0;
        while(total<=num){
            total = total + next;
            next = next + 1;
        }

        if((total-num)<(total-num-next)){
            return next;
        }else{
            return next-1;
        }

    }
}
