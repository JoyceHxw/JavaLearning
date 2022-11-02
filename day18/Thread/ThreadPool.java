package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//创建线程的方式四：使用线程池
//1.提供指定线程数量的线程池
//2.执行指定的线程操作，需要提供实现Runnable接口或Callable接口实现类的对象
//3.关闭连接池

public class ThreadPool {
    public static void main(String[] args){
        ExecutorService service = Executors.newFixedThreadPool(10);

        service.execute(new NumberThread()); //Runnable
        service.execute(new NumberThread1());
        // service.submit(); //Callable

        service.shutdown();
    }
}

class NumberThread implements Runnable{

    @Override
    public void run(){
        for(int i=1;i<=100;i++){
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+"  "+i);
            }
        }
    }
    
}

class NumberThread1 implements Runnable{

    @Override
    public void run(){
        for(int i=1;i<=100;i++){
            if(i%2!=0){
                System.out.println(Thread.currentThread().getName()+"  "+i);
            }
        }
    }
    
}