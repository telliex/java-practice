package lesson10_classes;

public class PassByValueTest {
    public static void main(String[] args) {
        int x =5, y=7;

        System.out.println("Before involving swap method.");
        System.out.printf("The valuables x = %d , y = %d \n",x, y);

        swap(x,y);
        System.out.println("After involving swap method.");
        System.out.printf("The valuables x = %d , y = %d \n ",x, y);
    }

    public static void swap(int x,int y){
        int temp ;
        temp = x;
        x = y ;
        y= temp;
        System.out.printf("Inside the swap method: x = %d , y = %d \n" ,x, y);
    }


}
