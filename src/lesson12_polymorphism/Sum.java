package lesson12_polymorphism;

public class Sum {
    public static void main(String[] args) {
        System.out.println("Add tow int (3,7): "+ add(3,7));
        System.out.println("Add three int (4,7,9): "+ add(4,7,9));
        int[] numbers1 = {22,21,5,3};
        System.out.println("Add int[] (22,21,5,3): "+ add(numbers1));

        System.out.println("Add tow int (2.3,7.4): "+ add(2.3,7.4));
        System.out.println("Add three int (2.5,7.9,9.7): "+ add(2.5,7.9,9.7));
        double[] numbers2 = {4.2,7.1,9.3};
        System.out.println("Add int[] (4.2,7.1,9.3): "+ add(numbers2));
    }

    public static int add(int n1,int n2){
        return n1+n2;
    }
    public static int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }

    public static int add(int[] nums){
        int total = 0;
        for(int n : nums){
            total += n;
        }
        return total;
    }

    public static double  add(double n1, double n2){
        return n1+n2;
    }
    public static double add(double n1, double n2 , double n3){
        return n1+n2+n3;
    }
    public static double add(double[] nums){
        double total = 0.0;
        for(double n:nums){
            total +=n;
        }
        return total;
    }

}
