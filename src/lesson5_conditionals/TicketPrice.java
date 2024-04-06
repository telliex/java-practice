package lesson5_conditionals;
import java.util.Scanner;
public class TicketPrice {
    public static void main(String[] args) {
        int age = getAge();
        int member = getMember();
        calculate(age, member);
    }

    private static  void calculate(int age, int member){


        if(member == 1){
            double result = getRegularLevel(age) * getDiscountLevel(age);
            System.out.println("Your price is $" + (int)result);
        }else if(member == 0){
            System.out.println("Your price is $"+ getRegularLevel(age));
        }else{
            System.out.println("Please enter integer 1 or 2 !!");
        }
    }
    private static int getAge(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age:");
        int result = input.nextInt();

        return result;
    }

    private static int getMember(){
        Scanner input = new Scanner(System.in);
        System.out.println("Are your member? (1 for yes, 0 for no):");
        int result = input.nextInt();

        return result;
    }

    private static int getRegularLevel(int age){
        if(age>=0&& age<=18){
            return 30;
        }else if(age>=19 &&age<=60){
            return 50;
        }else if(age>60){
            return 40;
        }else{
            return 100;
        }
    }
    private static double getDiscountLevel(int age){
        if(age>=0&& age<=18){
            return 0.5;
        }else if(age>=19 &&age<=60){
            return 0.7;
        }else if(age>60){
            return 0.6;
        }else{
            return 1;
        }
    }
}
