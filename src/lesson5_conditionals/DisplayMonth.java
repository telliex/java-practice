package lesson5_conditionals;
import  java.util.Scanner;
public class DisplayMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to present a month.");
        int number = input.nextInt();

        enterMonthNumber(number);
        input.close();
    }
    private static void enterMonthNumber(int number){


        if(number>=13 || number<=0){
            System.out.println("This is a invalid number.");
        }else{
            System.out.println(getMonthName(number));
        }


    }
    private  static  String getMonthName(int score){

        String result = "";
        switch(score){
            case 1:
                result = "January";
            break;
            case 2:
                result =  "February";
                break;
            case 3:
                result =  "March";
            break;
            case 4:
                result =  "April";
            break;
            case 5:
                result =  "May";
            break;
            case 6:
                result =  "June";
            break;
            case 7:
                result =  "july";
            break;
            case 8:
                result =  "August";
            break;
            case 9:
                result =  "September";
            break;
            case 10:
                result =  "October";
            break;
            case 11:
                result =  "November";
            break;
            case 12:
                result =  "December";
            break;
            default:
                return "unknow";
        }
        return result;
    }
}
