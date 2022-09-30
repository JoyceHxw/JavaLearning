package Interface8;

//JDK8：除了定义全局常量和抽象方法外，还可以定义静态方法、默认方法

public class InterfaceTest implements CompareA,CompareB{
    public static void main(String[] args){
        InterfaceTest i = new InterfaceTest();
        // i.method1(); 
        //接口中定义的静态方法只能通过接口来调用
        CompareA.metho1();
        
        //通过实现类的对象可以调用接口中的默认方法
        //如果实现类重写了接口中的默认方法，调用时，仍然调用的是重写的方法
        //如果子类或实现类继承的父类和实现的接口中，声明了同名同参数的方法，那么子类在没有重写的情况下，默认调用的是父类中同名同参的方法（父类优先，属性不是）
        //如果实现类实现了多个接口，而多个接口中定义了同名同参的默认方法，那么在实现类没有重写的情况下，会报错（接口冲突），必须重写
        i.method2();
        i.method3();
        i.myMethod();
    }

    public void method2(){
        System.out.println("shanghai2");
    }
    public void method3(){
        System.out.println("shenzhen");
    }
    public void myMethod(){
        //调用接口中默认的方法
        CompareA.super.method3();
        CompareB.super.method3();
    }
}

interface CompareA{
    //静态方法
    public static void metho1(){
        System.out.println("beijing");
    }
    //默认方法
    public default void method2(){
        System.out.println("shanghai");
    }
    default void method3(){
        System.out.println("shanghai");
    }
}

interface CompareB{
    public default void method3(){
        System.out.println("shanghai");
    }
}
