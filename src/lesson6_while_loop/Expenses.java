package lesson6_while_loop;

import java.util.Scanner;

public class Expenses {
    public static void main(String[] args) {
        double total = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the cost shopping items (Separated by a spec , -1 to end):");

        double items = input.nextDouble();

        while(items!=-1){
            total = total + items;
            items = input.nextDouble();
        }

        System.out.printf("The total shopping expense is $%f", total);
    }
}