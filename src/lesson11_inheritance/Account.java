package lesson11_inheritance;

public abstract class Account {
    private int accountNum;
    private String customerName;
    protected double balance;

    private static int numOfAccount = 0;


    public Account(int num, String name, double accountBalance){
        numOfAccount++;
        accountNum = num;
        customerName = name;
        balance= accountBalance;
    }

    public Account(int num, String name){
//        accountNum = num;
//        customerName = name;
//        balance= 1000;
        this(num, name,0);
    }


    public void setAccountNum( int num){
        accountNum = num;
    }
    public int getAccountNum(){
        return accountNum;
    }

    public void setCustomerName( String name){
        customerName = name;
    }
    public String getCustomerName(){
        return customerName;
    }

    public void setBalance( double inputBalance){
        balance = inputBalance;
    }
    public double getBalance(){
        return balance;
    }

    public static int getNumOfAccount(){
        return numOfAccount;
    }

    public void deposit( double amount){
        balance += amount;
    }

    public void withdraw( double amount){
        balance -= amount;
    }

    public String toString(){
        return String.format("accountNum: %d / customerName: %s / balance: %f", accountNum,customerName ,balance );
    }

}
