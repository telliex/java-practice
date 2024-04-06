package lesson3_standard_classes;
import java.lang.Math;

public class Lesson3Practice {
    public static void main(String[] args) {
        System.out.println("Math.E=" + Math.E);
        System.out.println("Math.PI=" + Math.PI);
        System.out.println("Math.sqrt(9)=" + Math.sqrt(9));
        System.out.println("Math.log(8)=" + Math.log(8));
        System.out.println("Math.pow(2,4)=" + Math.pow(2,4));
        System.out.println("Math.round(4.5678)=" + Math.round(4.5678));

        int x=12, y=6;
        System.out.println("Math.sqrt((x * y)/(x +y))=" + Math.sqrt((x * y)/(x + y)));

        System.out.println("A random number between 0 to 99:" + (int) (Math.random()*100));
        System.out.println("A random number between 1 to 6:" + (int) (1+ Math.random()*6));
        System.out.println("A random number between 28 to 90:" + (int) (28+ Math.random()*63));
    }
}
