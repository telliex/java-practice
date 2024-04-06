package lesson11_inheritance;

public class CheckingAccount extends Account {
    public CheckingAccount(int num, String name, double balance){
        super(num,name,balance);
    }
    public CheckingAccount(int num, String name){
        super(num,name);
    }

    public void withdraw( double amount){

        if(amount>balance){
            System.out.println("You are not allowed to withdraw more than you have.");
            balance = 0 ;
        }else{
            balance -= amount;
        }
    }
}
