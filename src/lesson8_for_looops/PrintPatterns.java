package lesson8_for_looops;

public class PrintPatterns {
    public static void main(String[] args) {
        for(int i=0 ;i<4;i++){
            for(int j=0;j<10;j++){
                System.out.print("n");
            }
            System.out.println();
        }

        System.out.println();

        for(int i=0 ;i<5;i++){
            for(int j=0;j<9;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();

        for(int i=0 ;i<7;i++){
            for(int j=0;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println();

        for(int i=0 ;i<6;i++){
            for(int j=0;j<=i;j++){
                System.out.print("a");
            }
            System.out.println();
        }
    }
}
