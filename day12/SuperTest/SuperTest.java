package SuperTest;

public class SuperTest {
    public static void main(String[] args){
        Student s = new Student("Tom",22,"economics");
        s.show();
        //super调用父类中声明的属性或方法，通常情况下省略super；
        //当子类和父类中定义了同名的属性或方法，如果要调用父类中的，则必须用super
        //this先找本类的，如果没有再找父类的

        Person p = new Person();
        Student s1 = new Student();
        //在构造器的首行，没有显式地声明this或super，则默认调用的是父类中的空参构造器
        //在类的多个构造器中，至少有一个构造器使用了super调用父类中的构造器，所以子类肯定包括父类的属性
    }
}
