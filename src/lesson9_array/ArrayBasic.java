package lesson9_array;

import java.util.Random;

public class ArrayBasic {
    public static void main(String[] args) {

        learnBasic();
        int[] number1 = createRandomArray(12,3,20);
        printArray(number1);

        int[] number2 = createRandomArray(10,56,15);
        printArray(number2);
        printArray(doubleArrayValues(number2));
        System.out.println();
    }

    public static void printArray(int[] inputArray){
        for(int i=0; i< inputArray.length;i++){
            System.out.print(inputArray[i]+" ");
        }
        System.out.println();
    }

    public static void learnBasic(){
        int[] x = new int[5];
        System.out.println("x[3]:"+x[3]);

        int[] y = {3,2,8,5,12,32,1};
        System.out.println("y[5]:"+y[5]);
        for(int i=0;i< y.length;i++){
            System.out.print(y[i]+" ");
        }
        System.out.println();

    }
    public static int[] createRandomArray(int size, int first, int range ){
        int[] members = new int[size];
        Random random = new Random();

        for(int i = 0; i <size; i++){
            members[i] = first+ random.nextInt(range);
        }
        return members;
    }
    public static int[] doubleArrayValues(int[] inputArray){
        int[] output = new int[inputArray.length];
        for(int i = 0 ;i< inputArray.length; i++){
            output[i]=inputArray[i]*2;
        }
        return output;
    }
}
