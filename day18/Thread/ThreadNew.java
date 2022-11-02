package Thread;

//创建线程的方式三：实现Callable接口
//如何理解比实现Runnable接口方式强大
//1.call()可以有返回值的
//2.call()可以抛出异常，被外面的操作捕获，获取异常的信息
//3.Callable是支持泛型的


//1.创建一个实现Callable的实现类
//2.实现call方法，将此线程需要执行的操作声明在call()中
//3.创建Callable接口实现类的对象
//4.将此Callable接口实现类的对象作为参数传递到FutureTask构造器中，创建FutureTask的对象
//5.将FutureTask的对象作为参数传递到Thread类的构造器中，创建Thread对象，并调用start()

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadNew{
    public static void main(String[] args){
        NumThread n = new NumThread();

        FutureTask<Object> f = new FutureTask<Object>(n);

        new Thread(f).start();
        
        Object sum;
        try {
            //get()返回值即为FutureTask构造器参数Callable实现类重写的call()的返回值
            sum = f.get();
            System.out.println(sum);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ExecutionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}

class NumThread implements Callable<Object>{

    @Override
    public Object call() throws Exception {
        int sum = 0;
        for(int i=1;i<=100;i++){
            if(i%2==0){
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }
    
}