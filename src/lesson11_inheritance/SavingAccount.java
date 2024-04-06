package lesson11_inheritance;

public class SavingAccount extends Account {
    private double interestRate ;
    private static final double FEE = 10.00;
    private static final double MIN_BALANCE = 200.00;
    public SavingAccount(int num, String name, double balance, double rate){
        super(num, name , balance);
        interestRate = rate;
    }

    public SavingAccount(int num, String name, double rate){
        super(num, name);
        interestRate = rate;
    }

    public void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    }

    public double getInterestRate(){
        return interestRate;
    }

    public void addInterest(){

    }
    public void withdraw(double amount){
        if(balance<amount){
            balance = 0;
        }else if((balance - amount) < MIN_BALANCE){
            balance = balance -amount - FEE;
        }else{
            balance -= amount;
        }
    }
}
