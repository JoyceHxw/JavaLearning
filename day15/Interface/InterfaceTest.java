package Interface;

//类和接口是两个并列的结构
//JDK7以前，只能定义全局常量（public static final）（可以省略）和抽象方法（public abstract）（可以省略）
//JDK8还可以定义静态方法、默认方法
//接口不能实例化，通过类实现
//如果实现类覆盖了接口中所有抽象方法，则此实现类就可以实例化；如果没有覆盖所有抽象方法，则此实现类仍为抽象类
//java类可以实现多个接口，弥补了Java单继承性的局限性
// Class A extends B implements C, D
//接口与接口之间可以继承，而且可以多继承

//接口的具体使用，体现多态性
//接口，实际上可以看作是一种规范

public class InterfaceTest {
    public static void main(String[] args){
        System.out.println(Fly.MAX_SPEED);
        Plane p = new Plane();
        p.fly();
        p.stop();
        p.attack();
    }
}

interface Fly{
    //全局常量
    public static final int MAX_SPEED = 7900;
    int MIN_SPEED = 1;

    //抽象方法
    public abstract void fly();

    void stop();

}

interface Attack{
    void attack();
}

class Plane implements Fly,Attack{

    @Override
    public void fly() {
        System.out.println("起飞");
        
    }

    @Override
    public void stop() {
        System.out.println("降落");
        
    }

    @Override
    public void attack() {
        System.out.println("攻击");
        
    }
    
}

interface SpaceCraft extends Fly, Attack{

}