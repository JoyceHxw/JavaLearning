package SuperExercise;

public class CheckAccount extends Account {
    private double overdraft;

    public CheckAccount(int id, double balance, double interest, double overdraft){
        super(id, balance, interest);
        this.overdraft=overdraft;
    }

    public double getOverdraft(){
        return overdraft;
    }

    public void withdraw(double amount){
        //不能直接调用private
        if(getBalance()>=amount){
            // setBalance(getBalance()-amount);
            super.withdraw(amount);
        } else{
            double overAmount = amount - getBalance();
            if(overdraft>=overAmount){
                setBalance(0);
                overdraft -= overAmount;
            } else{
                System.out.println("超过可透支的限额");
            }
        }
    }
}
