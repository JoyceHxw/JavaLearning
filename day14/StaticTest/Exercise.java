package StaticTest;

public class Exercise {
    public static void main(String[] agrs){
        Account a1 = new Account();
        Account a2 = new Account("181359",5000);
        System.out.println(a1.getId());
        System.out.println(a2.getId());
        System.out.println(a2.getBalance());
        System.out.println(a1);
        System.out.print(a2);
    }
}

class Account{
    private int id;
    private String pwd="000000";
    private double balance;

    private static double interest;
    private static double minMoney = 1.0;
    private static int init = 1001;

    public Account(){
        id=init++;
    }
    public Account(String pwd, double balance){
        this();
        this.pwd=pwd;
        this.balance=balance;
    }


    public int getId() {
        return id;
    }
    public double getBalance() {
        return balance;
    }
    public static double getMinMoney() {
        return minMoney;
    }
    public static double getInterest() {
        return interest;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    public static void setInterest(double interest) {
        Account.interest = interest;
    }
    public static void setMinMoney(double minMoney) {
        Account.minMoney = minMoney;
    }

    @Override
    public String toString() {
        return "Account [id="+id+", pwd="+pwd+", balance="+balance+"]";
    }
}
