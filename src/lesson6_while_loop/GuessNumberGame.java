package lesson6_while_loop;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("----------Guess My Number Game---------");
        System.out.println(" Level 1 - Easy");
        System.out.println(" Level 2 - Hard");
        System.out.println("---------------------------------------");

        System.out.println("Pick a level (1 or 2):");
        int level = input.nextInt();
        int nowTimes = 0;
        int chanceTimes;

        if(level==1){
            chanceTimes = 4;
        }else{
            chanceTimes = 3;
        }
        int targetNumber = (int)(1+Math.random()* (20+1));


        System.out.println("Guess a number between 1-20:");

            while(nowTimes<=chanceTimes){
                nowTimes = nowTimes + 1;
                int guest = input.nextInt();

                if(nowTimes>=chanceTimes){
                    System.out.printf("You lose! The number is %d", targetNumber);
                    break;
                }else{

                    if(guest==targetNumber){
                        System.out.println("You are right. You guest the right number!!");
                        nowTimes = 5;
                        break;
                    }else{

                        if(guest>targetNumber){
                            System.out.println("Wrong! Guess a smaller number:");
                        }else{
                            System.out.println("Wrong! Guess a bigger number:");
                        }

                    }
                }
            }
    }
}
