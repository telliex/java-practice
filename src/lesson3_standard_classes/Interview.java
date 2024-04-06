package lesson3_standard_classes;

import java.util.Scanner;

public class Interview {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.next();
        System.out.println("How old are you?");
        int age = input.nextInt();
        System.out.println("What do you like to do at your spare time?");
        String activity = input.next();
        System.out.println("What do your favorite sport?");
        String sport = input.next();

        input.close();

        System.out.printf("------------ All About %s ======= \n", name);
        System.out.printf(" %s is %d years old. \n", name, age);
        System.out.printf(" %s like to %s at his/her spare time. \n", name, activity);
        System.out.printf(" %s's favorite sport is %s . \n", name, sport);
    }
}
