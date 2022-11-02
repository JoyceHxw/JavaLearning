package Thread;

//Thread常用方法
//start()：启动当前线程；调用当前线程的run()
//run()：通常需要重写Thread类中的此方法，将创建的线程要执行的操作声明在此方法中
//currentThread()：静态方法，返回执行当前代码的线程
//getName()：获取当前线程的名字
//setName()：设置当前线程的名字
//yield()：释放当前cpu的执行
//join()：在线程A中调用线程B的join()，此时线程A就进入阻塞状态，知道线程B完全执行完以后，线程A才继续执行
//sleep(long millitime)：让当前线程睡眠指定的时间
//isAlive()：判断当前线程是否存货


//线程的优先级：
//MAX_PRIORITY: 10
//MIN_PRIORITY：1
//NORM_PRIORITY：5 （默认的）
//getPriority()：获取线程的优先级
//setPriority(int p)：设置线程的优先级
//高优先级的线程要抢占低优先级线程cpu的执行权，但只是从概率上讲

public class ThreadMethod {
    public static void main(String[] name){
        HelloThread t = new HelloThread();
        t.setName("线程一");
        t.setPriority(Thread.MAX_PRIORITY);
        t.start(); 

        //给主线程命名
        Thread.currentThread().setName("主线程");
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        for(int i = 0; i < 100; i++){
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+Thread.currentThread().getPriority()+"  "+i);
            }

            // if(i==20){
            //     try {
            //         t.join();
            //     } catch (InterruptedException e) {
            //         // TODO Auto-generated catch block
            //         e.printStackTrace();
            //     }
                
            // }
        }

        // System.out.println(t.isAlive());
    }
}


class HelloThread extends Thread{
    @Override
    public void run() {
        for(int i = 0; i < 100; i++){
            if(i%2==0){
                // try {
                //     sleep(100);
                // } catch (InterruptedException e) {
                //     // TODO Auto-generated catch block
                //     e.printStackTrace();
                // }
                System.out.println(Thread.currentThread().getName()+Thread.currentThread().getPriority()+"  "+i);
            }
        }
    }
}