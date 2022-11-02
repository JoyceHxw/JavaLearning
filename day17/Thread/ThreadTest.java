package Thread;

//多线程的创建
//方式一：
//1.创建一个继承于Thread类的子类；
//2.重写Thread类的run()，将此线程执行的操作声明在run()中
//3.创建Thread类的子类的对象
//4.通过此对象调用start()（启动当前线程；调用当前线程的run()）


public class ThreadTest{
    public static void main(String[] args){
        MyThread thread1 = new MyThread();
        thread1.start();

        //再启动一个线程，不能让已经start()的线程去执行，需要重新new
        MyThread thread2 = new MyThread();
        thread2.start();

        //如下操作仍然是在main()线程中执行
        for(int i = 0; i < 100; i++){
            if(i%2!=0){
                System.out.println(i + "****************************");
            }
        }
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        for(int i = 0; i < 100; i++){
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+"  "+i);
            }
        }
    }
}