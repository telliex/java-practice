package lesson8_for_looops;

public class PrintNumberSequence {
    public static void main(String[] args) {
        int totalNumberA = (100-50)/2;
        printNumbers(50,2,totalNumberA);

        System.out.println();

        int totalNumberB = (41-1)/4;
        printNumbers(1,4,totalNumberB);

        System.out.println();

        printNumbers(6,6,10);

    }
    public static void printNumbers (int first, int step, int totalNumbers){

        for(int i=0; i<=totalNumbers; i++){
            System.out.print((first + i*step) + " ");
        }

    }

}
