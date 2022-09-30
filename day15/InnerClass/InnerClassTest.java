package InnerClass;

//内部类：将一个类A声明在另一个类B中，类A为内部类
//内部类分为成员内部类（静态、非静态），局部内部类（方法内、代码快内、构造器内）
//成员内部类：一方面，作为外部类的成员，可以调用外部类的结构。可以被static修饰。可以被四种不同的权限修饰；另一方面，作为一个类，可以定义属性、方法、构造器。可以被final，abstract修饰


public class InnerClassTest {
    public static void main(String[] args){
        //创建Dog实例（静态的成员内部类）
        Person.Dog dog = new Person.Dog();
        dog.show();

        //创建Bird实例（非静态的成员内部类）
        Person p = new Person();
        Person.Bird bird = p.new Bird();
        bird.sing();
        bird.display("C");


    }
}

class Person{
    String name = "A";
    int age;
    public void eat(){
        System.out.println("吃饭");
    }
    //成员内部类
    static class Dog{
        String name;
        int age;
        
        public void show(){
            System.out.println("狗叫");
        }
    }
    class Bird{
        String name="B";

        public void sing(){
            System.out.println("我是一只小小鸟");
            eat();
        }
        public void display(String name){
            System.out.println(name); //方法的形参
            System.out.println(this.name); //内部类的属性
            System.out.println(Person.this.name); //外部类的属性
        }
    }

    //局部内部类
    //开发中很少见
    public void method(){
        class AA{

        }
    }

    {
        class BB{

        }
    }

    public Person(){
        class CC{

        }
    }

    //返回一个实现了Comparable接口的类的对象
    public Comparable getComparable(){
        class MyComparable implements Comparable{

            @Override
            public int compareTo(Object o) {
                // TODO Auto-generated method stub
                return 0;
            }
            
        }
        return new MyComparable();
    }
}