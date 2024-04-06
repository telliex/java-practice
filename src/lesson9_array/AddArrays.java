package lesson9_array;

import java.util.Random;

public class AddArrays {
    public static void main(String[] args) {
        int[] number1 = createRandomArray(5,3,20);

        int[] number2 = createRandomArray(5,56,15);


        printArray(addArrays(number1,number2));
    }

    public static int[] addArrays(int[] num1, int[] num2){
        int[] result = new int[num1.length + num2.length];

        for(int i= 0 ;i< num1.length+num2.length; i++ ){
            if(i<num1.length){
                result[i] = num1[i];
            }else{
                result[i] = num2[i- num1.length];
            }
        }
        return result;

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
