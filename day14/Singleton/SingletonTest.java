package Singleton;

//饿汉式：一开始就造好，对象加载时间过长；线程安全的；
//懒汉式：延迟对象的创建；目前的写法线程不安全

public class SingletonTest {
    public static void main(String[] args){
        Bank b1 = Bank.getInstance();
        Bank b2 = Bank.getInstance();

        System.out.println(b1==b2);
    }
}

//饿汉式
class Bank{
    //1.私有化类的构造器
    private Bank(){

    }

    //2.内部创建类的对象，必须为静态的
    private static Bank instance = new Bank();

    //3.提供公共的静态方法，返回类的对象
    public static Bank getInstance(){
        return instance;
    }
}
