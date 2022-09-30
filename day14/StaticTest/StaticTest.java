package StaticTest;
//static修饰属性：静态变量（对应实例变量）
//多个对象共享同一个静态变量。当通过某一个对象修改静态变量时，会导致其他对象调用此静态变量时，是修改过了的
//静态变量随着类的加载而加载，早于对象创建，只加载一次，内存只存在一份，存在方法区的静态域中

//static修饰方法：静态方法
//随着类的加载而加载，可以通过类.静态方法来调用
//静态方法中，只能调用静态的方法或属性；非静态方法中，既可以调用非静态的方法或属性，也可以调用静态的方法或属性
//在静态的方法中，不能使用this，super

//static的作用：属性是可以被多个对象所共享的；操作静态属性的方法通常设置为static；工具类中的方法，习惯上声明为static

public class StaticTest{
    public static void main(String[] args){
        Chinese.nation = "CHN";
        Chinese.show();
        Chinese c1 = new Chinese();
        c1.name="马龙";
        c1.age=33;
        // c1.nation="中国";

        Chinese c2 = new Chinese();
        c1.name="樊振东";
        c1.age=26;
        // c1.nation="中国";

        System.out.println(c2.nation);
    }
}

class Chinese{
    String name;
    int age;
    static String nation;

    public static void show(){
        System.out.println("我是一个中国人");
    }
}