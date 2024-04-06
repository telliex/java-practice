package lesson4_mothods;
import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the length & width  (separated by a space) e.x. 20 30:");
        int length = input.nextInt();
        int width = input.nextInt();
        input.close();
        System.out.println("The rectangle's area is " + ( length * width) );
        System.out.println("The rectangle's perimeter is" + (length + width)*2);
    }
}
