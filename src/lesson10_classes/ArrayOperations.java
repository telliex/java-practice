package lesson10_classes;

import java.util.Random;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] myArray = createRandomArray(10,5,20);

        printArray(myArray);
        printArray(reverseArray(myArray));

    }
    public static int[] reverseArray(int[] inputArray){
        int size = inputArray.length;
        int[] result = new int[size];

        for(int i =0; i < size; i++){
            result[size-1-i] = inputArray[i];
        }

        return result;
    }

    public static int[] mergeArrays(int[] array1, int[] array2){
        int size1 = array1.length;
        int size2 = array2.length;
        int[] margeResult = new int[size1+size2];

        for(int i =0; i < size1; i++){
            margeResult[i] = array1[i];
        }
        for(int j =0; j < size2; j++){
            margeResult[size1-1+j] = array1[j];
        }

        return margeResult;
    }

    public static int[] createRandomArray(int size, int first, int range ){
        int[] members = new int[size];
        Random random = new Random();

        for(int i = 0; i <size; i++){
            members[i] = first+ random.nextInt(range);

        }
        return members;
    }

    public static void printArray(int[] inputArray){
        for(int i=0; i< inputArray.length;i++){
            System.out.print(inputArray[i]+" ");
        }
        System.out.println();
    }
}
