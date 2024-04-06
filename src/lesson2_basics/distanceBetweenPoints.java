package lesson2_basics;

public class distanceBetweenPoints {
    public static void main(String[] args) {
        // point A
        int x1 = 13, y1= 5;
        // point B
        int x2 = 3, y2 = 6;

        double  distance = Math.sqrt( Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        System.out.println("The distance between tow points is :"+distance);
    }
}
