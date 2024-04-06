package lesson7_string;
import java.util.Scanner;

public class PhoneNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 10 digit number:");
        String phone = input.nextLine();
        String formattedNumber1 = String.format("%s-%s-%s", phone.substring(0, 3), phone.substring(3, 6), phone.substring(6, 10));

        System.out.println(formattedNumber1);

        String formattedNumber2 = String.format("(%s) %s-%s",
                phone.substring(0, 3),
                phone.substring(3, 6),
                phone.substring(6, 10));

        System.out.println(formattedNumber2);
    }
}
