package lesson4_mothods;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please input the random number range e.x. 20 30:");

        int start = input.nextInt();
        int end = input.nextInt();
        int result = getRandomNumber(start,end);
        input.close();

        System.out.printf("A number between %d and %d is %d", start , end, result);

        
    }
    private static int getRandomNumber(int startNumber, int range){
        return (int)(startNumber+(Math.random()*(range-startNumber+1)));
    }
}
