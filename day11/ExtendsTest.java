public class ExtendsTest{
    public static void main(String[] args){
        Person p = new Person();
        Student s = new Student();

        p.name = "Tom";
        p.age = 1;
        p.eat();
        p.sleep();
        System.out.println(p.name);

        s.eat();
        s.sleep();
        s.study();
        System.out.println(s.name);
    }
}