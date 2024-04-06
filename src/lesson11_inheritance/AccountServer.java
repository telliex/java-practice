package lesson11_inheritance;

public class AccountServer {
    private  Account[] accounts;

    public AccountServer(){
        createAccounts();
    }

    public static void main(String[] args) {
        AccountServer acctServer = new AccountServer();
        acctServer.displayAccounts();
        acctServer.accountActivities();
        System.out.println("\nAfter account activities .... \n");
        acctServer.displayAccounts();
    }

    private void createAccounts(){
        accounts = new Account[4];

        accounts[0]= new CheckingAccount(101,"Elly Oak",100);
        accounts[1]= new CheckingAccount(102,"Steve Johnson");
        accounts[2]= new SavingAccount(10001,"Helen Tink",800,0.01);
        accounts[3]= new SavingAccount(10002,"Nicole Shi",0.015);
    }
    public void displayAccounts(){

        for (Account acct: accounts){
            System.out.println(acct);
        }
        System.out.println('2');
    }

    public void accountActivities(){
        // Account 1
        accounts[0].deposit(200);
        accounts[0].withdraw(150);
        accounts[0].deposit(400);

        if(accounts[0] instanceof SavingAccount){
            ((SavingAccount) accounts[0]).addInterest();
        }

        // Account 2
        accounts[1].deposit(1330);
        accounts[1].withdraw(400);

        if(accounts[1] instanceof SavingAccount){
            ((SavingAccount) accounts[1]).addInterest();
        }

        // Account 3
        accounts[2].deposit(200);
        accounts[2].withdraw(410);
        accounts[2].deposit(150);

        if(accounts[2] instanceof SavingAccount){
            ((SavingAccount) accounts[2]).addInterest();
        }

        // Account 4
        accounts[3].deposit(900);
        accounts[3].withdraw(500);

        if(accounts[3] instanceof SavingAccount){
            ((SavingAccount) accounts[3]).addInterest();
        }
    }
}
