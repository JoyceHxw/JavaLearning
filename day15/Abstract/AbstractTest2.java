package Abstract;

public class AbstractTest2{
    public static void main(String[] args){
        //匿名子类的对象
        Person p = new Person() {
            @Override
            public void walk() {
                System.out.println("学生走路");
            }
            @Override
            public void eat() {
                System.out.println("学生吃饭");
            }
        };
        method(p);

        method(new Person() {
            @Override
            public void walk() {
                System.out.println("好好走路");
            }
            @Override
            public void eat() {
                System.out.println("好好吃饭");
            }
        });

    }

    public static void method(Person p){
        p.eat();
        p.walk();
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
