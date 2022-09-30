package SuperExercise;

public class Account {
    private int id;
    private double balance;
    private double interest;

    // public Account(){

    // }

    public Account(int id, double balance, double interest){
        this.id=id;
        this.balance=balance;
        this.interest = interest;
    }

    public int getId(){
        return id;
    }
    public double getBalance(){
        return balance;
    }
    public double getInterest(){
        return interest;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public void setInterest(double interest){
        this.interest=interest;
    }
    public double getMonthInterest(){
        return interest/12;
    }
    public void withdraw(double amount){
        if(balance>=amount){
            balance -= amount;
        } else{
            System.out.println("余额不足");
        }
    }
    public void deposit(double amount){
        balance += amount;
    }
}
