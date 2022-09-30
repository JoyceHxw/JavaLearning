package Polymorphism;

public class PolyTest {
    public static void main(String[] args){
        //对象的多态性：父类的引用指向子类的对象
        Person p1 = new Man();
        Person p2 = new Woman();

        //多态的使用：当调用子父类同名同参得方法时，实际执行的是子类重写父类的方法--虚拟方法调用
        //编译指向父类，运行指向子类
        //多态性不适用于属性，调用父类的属性
        p1.eat();

        //不能调用父类中没有定义的方法或属性
        // p1.stand();
        //有了对象的多态性后，内存中实际上是加载了子类特有的属性和方法，但是由于变量声明为父类类型，倒是编译时，只能调用父类中声明的属性和方法

        //使用强制类型转换符调用子类特有的属性和方法（向下转型）
        Man m1 = (Man)p1;
        m1.stand();

        //使用强转时，可能出现ClassCastException的异常，使用instanceof
        //a instanceof A：判断对象a是否是类A的实例
        //p1本质上new的就是Man
        //如果a instanceof A 返回true，则a instanceof B返回true，那么B是A的父类
        if(p1 instanceof Woman){
            Woman w1 = (Woman)p1;
            w1.sit();
            System.out.println("转换Woman成功");
        }

        if(p1 instanceof Man){
            Man m2 = (Man)p1;
            m2.stand();
            System.out.println("转换Man成功");
        }

    }
}
