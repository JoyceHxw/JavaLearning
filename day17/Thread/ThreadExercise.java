package Thread;

//创建thread匿名子类

public class ThreadExercise {
    public static void main(String[] args){
        new Thread(){
            public void run(){
                for(int i = 0; i < 100; i++){
                    if(i%2==0){
                        System.out.println(Thread.currentThread().getName()+"  "+i);
                    }
                }
            }
        }.start();

        new Thread(){
            public void run(){
                for(int i = 0; i < 100; i++){
                    if(i%2!=0){
                        System.out.println(Thread.currentThread().getName()+"  "+i);
                    }
                }
            }
        }.start();
    }
}

