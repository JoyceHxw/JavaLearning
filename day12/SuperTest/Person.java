package SuperTest;

public class Person {
    String name="黄渲雯";
    int age=22;
    int id=51029;

    public Person(){
        System.out.println("我无处不在");
    }
    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    
    public void eat(){
        System.out.println("吃饭");
    }

    public void sleep(){
        System.out.println("睡觉");
    }
}
