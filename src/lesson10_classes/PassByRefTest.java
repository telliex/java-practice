package lesson10_classes;

public class PassByRefTest {
    public static void main(String[] args) {
        int[] target = {2,7,3,1,5,10,8};
        System.out.println("Before modifying the array");
        printArray(target);

        modifyArray(target);
        System.out.println("After modifying the array");
        printArray(target);
    }

    public static void modifyArray(int[] array){

//        for(int e: array){
//            e = e * 2;
//        }
        for(int i = 0; i <array.length;i++){
            array[i]=array[i] *2;
        }
    }
    public static void printArray(int[] array){
        for(int e: array){
            System.out.print(e +" ");
        }
        System.out.println();
    }
}
