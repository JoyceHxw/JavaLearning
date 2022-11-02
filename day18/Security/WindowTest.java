package Security;

//买票过程中，可能出现重票、错票问题，即线程的安全问题
//通过同步机制来解决线程的安全问题
//方式一：同步代码块synchronized（会降低效率）
//1.操作共享数据的代码，即为需要被同步的代码  （不能包含代码多了，也不能包含少了）
//2.共享数据：多个线程共同操作的变量
//3.同步监视器，俗称：锁。任何一个类的对象都可以充当锁（要求多个线程共用一把锁）

//this可以充当同步监视器，但在继承Thread类创建多线程的方式中，慎用this充当同步监视器

public class WindowTest {
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
            synchronized(o){
                if(ticket > 0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "   " + "买票，票号为：" + ticket);
                    ticket--;
                } else{
                    break;
                }
            }
            
        }
    }
}