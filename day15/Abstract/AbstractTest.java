package Abstract;
//abstract可以用来修饰类、方法
//abstract修饰类：类不能实例化；抽象类中一定有构造器，便于子类实例化调用；都会提供抽象类的子类
//abstract修饰方法：只有方法的声明，没有方法体；包含抽象方法的类一定是抽象类（不能调用抽象方法）；抽象类中可以有抽象方法
//若子类重写了父类中所有的抽象方法后，则子类可实例化；若子类没有重写父类中所有的抽象方法，则此子类也是一个抽象类，需要用abstract修饰

public class AbstractTest{
    public static void main(String[] args){
        //抽象后，不可实例化
        // Person p1 = new Person();
        Student s1 = new Student("Tome", 20);

    }
}

abstract class Person{
    String name;
    int age;

    public Person(){

    }
    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    // public void eat(){
    //     System.out.println("人吃饭");
    // }
    //抽象方法
    public abstract void eat();
    public void walk(){
        System.out.println("人走路");
    }

}

class Student extends Person{
    public Student(String name, int age){
        super(name,age);
    }

    public void eat(){
        System.out.println("学生多吃");
    }
}