package lesson6_while_loop;

public class CustomerGrowth {
    public static void main(String[] args) {
        int initial = 300;
        int target = 1500;
        int number = 180;

        int result = getHowManyYears(initial,target,number);
        System.out.println(result);
        int customers = initial+(number*result);
        int years = (result-initial)/180;

        System.out.println("The initial customer number is "+ initial);
        System.out.println("Years to take to reach the goal "+ years);
        System.out.println("There will be "+result+" customers");
    }

    private static int getHowManyYears(int init, int target, int num){
        int result = init;
        int years = 0;
        while(result<target){
            result = result + years * num;
            years = years +1 ;
        }

        return result;
    }
}
