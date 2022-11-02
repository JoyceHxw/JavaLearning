package Security;

import java.util.concurrent.locks.ReentrantLock;

//解决线程安全问题的方式三：Lock锁
//synchronized与Lock的不同：
//1.synchronized机制在执行完相应的同步代码后，自动的释放同步监视器；Lock需要手动的启动同步和结束同步

public class LockTest {
    public static void main(String[] args){
        Window w = new Window();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.start();
        t2.start();
        t3.start();

    }
}

class Window implements Runnable{

    private int ticket = 100;

    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while(true){
            try{

                lock.lock();
                
                if(ticket>0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"-"+ticket);
                    ticket--;
                } else{
                    break;
                }
            } finally{
                lock.unlock();
            }
            
        }
        
    }
}
