package Security;

//方式二：同步方法
//1.同步方法仍然涉及到同步监视器，只是不需要显式地声明
//2.非静态的同步方法，同步监视器是this；静态的同步方法，同步监视器是当前类本身


public class WindowTest1 {
    public static void main(String[] args){
        Window1 w = new Window1();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}


class Window1 implements Runnable{
    private int ticket = 100;
    Object o = new Object();

    @Override
    public void run() {
        while(true){
            show();
            }
    }

    public synchronized void show(){
        if(ticket > 0){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "   " + "买票，票号为：" + ticket);
            ticket--;
        }
    }
}