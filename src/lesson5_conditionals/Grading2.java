package lesson5_conditionals;
import java.util.Scanner;

public class Grading2 {
    public static void main(String[] args) {
        int InputScore = enterScore();
        String result = getGrade(InputScore);
        if( result == null){
            System.out.println("Invalid score!");
        }else{
            System.out.println(result);
        }
    }

    private static int enterScore(){
        int result;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Input a number of 0-100:");

        result = scan.nextInt();
        scan.close();
        return result;

    }

    private static String getGrade(int score){
        String result;
        if( score > 100 && score < 0  ){
            return null;
        }
        String level = getLevel(score);
        if(score>=90){
           result = "A"+level;

        }else if(score<90 && score >=80){
            result = "B"+level;
        }else if(score<80 && score >=70){
            result = "C"+level;
        }else if(score<70 && score >=60){
            result = "D"+level;
        }else {
            result = "E";
        }

        return result;
    }
    private static String getLevel(int number){
        int remainder = number % 10;
        if(remainder>=7){
            return "+";
        }else if(remainder>=4 && remainder<=6){
            return "";
        }else{
            return "-";
        }
    }
}
