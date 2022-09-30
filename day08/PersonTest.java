//2.创建类的对象/类的实例化
public class PersonTest{
    public static void main(String[] args){
        //创建Person类的对象
        Person p1 = new Person();

        //调用对象的属性
        p1.name="Tom";
        p1.isMale=true;
        System.out.println(p1.name);

        //调用对象的方法
        p1.eat();
        p1.sleep();
        p1.talk("Chinese");


        //一个类的多个对象相互独立
        Person p2 = new Person();
        System.out.println(p2.name);
    }
}

//1.创建类
class Person{
    String name;
    int age=1;
    boolean isMale;

    public void eat(){
        System.out.println("人可以吃饭");
    }

    public void sleep(){
        System.out.println("人可以睡觉");
    }

    public void talk(String language){
        System.out.println("人可以说话，使用的是"+language);
    }
}