package lesson7_string;
import java.util.Scanner;

public class NameParser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstName="";
        System.out.println("Enter a name:");
        String FirstName = input.next();
        String LastName = input.next();

        System.out.println("First name is " + FirstName );
        System.out.println("Last name is " + LastName );
        input.close();
    }
}
