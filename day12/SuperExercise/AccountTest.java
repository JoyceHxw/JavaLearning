package SuperExercise;

public class AccountTest {
    public static void main(String[] args){
        // Account a = new Account(1122, 20000, 0.045);
        // a.withdraw(30000);
        // System.out.println(a.getBalance());
        // a.deposit(3000);
        // System.out.println(a.getBalance()+"\t"+a.getMonthInterest());

        CheckAccount c = new CheckAccount(1122, 20000, 0.045, 5000);
        c.withdraw(5000);
        System.out.println(c.getBalance()+"\t"+c.getOverdraft());
        c.withdraw(18000);
        System.out.println(c.getBalance()+"\t"+c.getOverdraft());
        c.withdraw(3000);
        System.out.println(c.getBalance()+"\t"+c.getOverdraft());


    }
}
