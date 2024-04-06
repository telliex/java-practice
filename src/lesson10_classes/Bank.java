package lesson10_classes;

public class Bank {
    public static void main(String[] args) {
        manageCustomers();
        manageAccount();
    }

    private static void manageCustomers(){
        Customer cust1 = new Customer("Allen Chen", 100, "100 Whisman Rd, Mountain View") ;
        Customer cust2 = new Customer("Jack Lin", 101, "1000 Foster City Rd, Foster City") ;
        Customer cust3 = new Customer("May Smith", 102, "1280 Foster City Rd, Foster City") ;


//        System.out.println("---cust1---------------");
//        System.out.println(cust1.toString());
//        cust1.setId(200);
//        System.out.println(cust1.toString());
//        cust1.setAddress("285 Bascom Ave. San Jose");
//        System.out.println(cust1.toString());
//        cust1.setName("Lucy Brown");
//        System.out.println(cust1.toString());
//        System.out.println("---cust2---------------");
//        System.out.println(cust2.toString());
//        cust2.setName("Mary Brown");
//        System.out.println(cust2.toString());
    }
    private static void manageAccount(){
        System.out.println("========= Manage Account =============");
        System.out.println("Total Number of Account is "+ Account.getNumOfAccount());

        Account acc1 = new Account(100,"Allen Chen",500);
        Account acc2 = new Account(101,"Jack Lin",900);
        Account acc3 = new Account(102,"May Smith",650);
        Account acc4 = new Account(103,"Jasicca Wang",650);
        System.out.println("Total Number of Account is "+ Account.getNumOfAccount());

        System.out.println("acc1---------------");

        System.out.println(acc1.toString());
        acc1.deposit(300);
        System.out.println(acc1.toString());
        System.out.println("acc2---------------");
        System.out.println(acc2.toString());

        System.out.println(acc2.toString());
        System.out.println("acc3---------------");
        System.out.println(acc3.toString());
        acc3.setAccountNum(220);
        acc3.deposit(999);
        System.out.println(acc3.toString());
    }
}
