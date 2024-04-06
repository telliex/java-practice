package lesson6_while_loop;
import java.util.Scanner;
import java.util.Random;
public class GuessNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int targetNumber = rand.nextInt(20)+1;
        int guestNumber = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Guess a number between 1-20:");
        guestNumber = input.nextInt();

        while(targetNumber != guestNumber){

            if(targetNumber>guestNumber){
                System.out.println("Wrong! Guess a bigger number:"+ guestNumber);
            }else{
                System.out.println("Wrong! Guess a small number:"+ guestNumber);
            }
            guestNumber = input.nextInt();
        }

        input.close();

    }
}
