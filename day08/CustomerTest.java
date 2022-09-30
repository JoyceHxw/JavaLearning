public class CustomerTest{
    public static void main(String[] args){
        Customer cus1 =  new Customer();
        cus1.eat();
        cus1.sleep(8);
    }
}


//方法声明的类型包括：有无返回值；有无形参
//如果有返回值，则必须声明返回值的类型，并在方法中使用return来返回指定类型的变量或常量
//如果没有返回值，则用void来表示，通常不使用return，如果使用则写return;表示结束方法
//可以声明多个形参：数据类型1 形参1, 数据类型2 形参2
//方法中不可以定义方法
class Customer{
    String name;
    int age;
    boolean isMale;

    public void eat(){
        System.out.println("客户吃饭");
    }

    public void sleep(int hour){
        System.out.println("客户休息"+hour+"小时");
        System.out.println("客户吃饭"); //方法中可以调用当前类的属性或方法；方法A中又调用了方法A是递归
    }

    public String getName(){
        return name;
    }

    public String getNation(Sting nation){
        String info = "客户的国家是"+nation;
        return info;
    }
}