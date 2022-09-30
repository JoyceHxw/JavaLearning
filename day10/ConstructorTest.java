//构造器的作用：创建对象；初始化对象的属性
//如果没有显式的定义类的构造器，则系统默认提供一个空参的构造器
//一个类中定义的多个构造器，彼此构成重载
//一旦显式地定义了类的构造器之后，系统就不再提供默认的空参构造器
public class ConstructorTest{
    public static void main(String[] args){
        Constructor c = new Constructor();
        c.eat();
        System.out.println(c.age);
        Constructor c1 = new Constructor("Joyce",22);
        System.out.println(c1.name);
        System.out.println(c1.age);

    }
}

class Constructor{
    //属性
    String name;
    int age;

    //构造器
    public Constructor(){
        // System.out.println("Constructor...");
        age=18;
    }

    public Constructor(String n,int a){
        name=n;
        age=a;
    }


    //方法
    public void eat(){
        System.out.println("吃饭");
    }
}