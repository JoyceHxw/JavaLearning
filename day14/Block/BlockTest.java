package Block;

//代码块的作用：初始化对象和类
//代码块只能使用static修饰
//静态代码块：内部可以有输出语句；随着类的加载而执行。只执行一次；对类的属性初始化
//非静态代码块：内部可以有输出语句；随着对象的创建而执行，每创建一个对象就执行一次；可以对对象的属性进行初始化
//静态代码块的执行优于非静态代码块的执行
public class BlockTest {
    public static void main(String[] args){
        String desc = Person.desc;
        Person p = new Person();
        System.out.println(p.age);
        System.out.println(desc);

        Person p2 = new Person();
    }
}

class Person{
    String name;
    int age;
    static String desc = "我是一个人";
    
    public Person(){

    }
    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    //代码块
    {
        System.out.println("Hello! 1");
        age=1;
    }
    {
        System.out.println("Hello! 2");
    }
    static{
        System.out.println("Hello! static 1");
        desc="我是一个爱学习的人";
    }
    static{
        System.out.println("Hello! static 2");
    }

    public void eat(){
        System.out.println("吃饭");
    }
    @Override
    public String toString() {
        return "Person [name="+name+", age="+age+"]";
    }
}