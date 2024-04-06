package lesson5_conditionals;

public class Lesson5Parctice {
    public static void main(String[] args) {
        int n = 17;
        if( n % 2 == 0 ){
            System.out.println(n +" is even number.");
        }else{
            System.out.println(n +" is odd number.");
        }

        if(n % 5 ==0){
            System.out.println(n +" is a multiple of 5.");
        }else{
            System.out.println(n +" is not a multiple of 5.");
        }

        if(n>0){
            System.out.println(n +" is a positive number.");
        }else if(n==0){
            System.out.println(n +" is a zero.");
        }else{
            System.out.println(n +" is a negative number.");
        }

        if(n>0){
            if( n % 2 == 0 ){
                System.out.println(n +" is even positive number.");
            }else{
                System.out.println(n +" is odd positive number.");
            }
        }else if(n==0){
            System.out.println(n +" is a zero.");
        }else{
            if( n % 2 == 0 ){
                System.out.println(n +" is even negative number.");
            }else{
                System.out.println(n +" is odd negative number.");
            }
        }
    }
}
