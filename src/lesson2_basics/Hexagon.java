package lesson2_basics;

public class Hexagon {
    public static void main(String[] args) {
        int sideWidth = 10;
        int perimeter = sideWidth* 6;
        System.out.println("The perimeter of the side : "+sideWidth+" hexagon is " + perimeter);
        double area = (3* Math.sqrt(3) / 2)* Math.pow(sideWidth,2);
        System.out.println("The area of the side : "+sideWidth+" hexagon is "+area);
    }
}
