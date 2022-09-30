package SuperTest;

public class Student extends Person{
    String major="经济";
    int id=181239;

    public Student(){

    }
    public Student(String name, int age, String major){
        super(name, age);//必须写在首行
        this.major=major;
    }

    public void study(){
        System.out.println("学习"+major);
    }

    //重写
    public void eat(){
        System.out.println("学生吃饭");
    }

    public void show(){
        System.out.println(this.name+"\t"+super.name);
        System.out.println(this.id+"\t"+super.id);
        eat();
        super.eat();
        study();
    }
}
