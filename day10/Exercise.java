
public class Exercise{
    public static void main(String[] arg){
        Bank bank = new Bank();
        bank.addCustomer("Joyce", "Huang");
        bank.addCustomer("Jane", "Liu");
        bank.addCustomer("Mary", "Zhao");
        
        bank.getCustomer(0).setAccount(new Account(2000));
        bank.getCustomer(0).getAccount().withdraw(500);
        bank.getCustomer(0).getAccount().getBalance();

        System.out.println(bank.getCustomer(0).getFirstName()+" "+bank.getCustomer(0).getLastName()+"的余额为"+bank.getCustomer(0).getAccount().getBalance());
        System.out.println("银行的客户数为"+bank.getNumberOfCustomer());
    }
}

class Account{
    private double balance;
    public Account(double init_balance){
        this.balance=init_balance;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amt){
        if(amt>0){
            balance +=amt;
            System.out.println("存钱成功");
        }
    }

    public void withdraw(double amt){
        if(balance>=amt){
            balance -=amt;
            System.out.println("取钱成功");
        } else{
            System.out.println("余额不足");
        }
    }
}

class Customer{
    private String firstName;
    private String lastName;
    private Account account;
    
    public Customer(String f, String l){
        firstName=f;
        lastName=l;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public Account getAccount(){
        return account;
    }
    public void setAccount(Account acct){
        account=acct;
    }
}

class Bank{
    private Customer[] customers;
    private int numberOfCustomer;
    
    public Bank(){
        customers=new Customer[10];
    }

    public void addCustomer(String f, String l){
        Customer customer = new Customer(f,l);
        // int i = customers.length;
        // customers[i]=customer;
        // numberOfCustomer += 1;
        customers[numberOfCustomer++]=customer;
    }
    public int getNumberOfCustomer(){
        return  numberOfCustomer;
    }
    public Customer getCustomer(int index){
        if(index>=0 && index<numberOfCustomer){
            return customers[index];
        }
        return null;
    }
}