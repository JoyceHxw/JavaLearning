package Security;

public class LockExercise {
    public static void main(String[] args){
        Account a = new Account();
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(a);

        t1.setName("用户1");
        t2.setName("用户2");

        t1.start();
        t2.start();
    }
}

class Account implements Runnable{
    private double account = 10000;

    @Override
    public void run() {
        while(true){
            synchronized(this){
                if(account>=1000){
                    account -= 1000;
                    System.out.println(Thread.currentThread().getName()+"取出1000元，还剩"+account+"元");
                } else{
                    System.out.println("余额不足");
                    break;
                }
            }
        }
    }
    
}
