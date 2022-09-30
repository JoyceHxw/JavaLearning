package Singleton;

public class SingletonTest2 {
    public static void main(String[] args){
        Order o1 = Order.getInstance();
        Order o2 = Order.getInstance();

        System.out.println(o1==o2);
    }
}

//懒汉式
class Order{
    private Order(){

    }

    //2.声明当前类的对象，没有初始化，声明为static
    private static Order instance = null;

    //3.声明public static返回当前类的对象的方法
    public static Order getInstance(){
        if(instance == null){
            instance = new Order();
        }
        return instance;
    }
}
