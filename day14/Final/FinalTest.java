package Final;
//final 可以用来修饰类、方法、变量
//final修饰一个类：此类不能被其他类所继承，如String类、System类、StringBuffer类
//final修饰一个方法：此方法不可以被重写，比如Object类中的getClass()
//final修饰一个变量；此时的变量成为常量
//final修饰一个属性：可以考虑赋值的位置有：显式初始化、代码块中初始化、构造器中初始化
//final修饰局部变量：尤其式用final修饰形参时，表明此形参是一个常量，只能在方法体内使用此形参，不能进行重新赋值
//static final用来修饰属性：全局常量
public class FinalTest {
    final int width =10;
    final int left;
    final int right;
    {
        left=1;
    }
    public FinalTest(){
        right=2;
    }
    public void doWidth(){
        // width=11;
    }

    public void show(){
        final int a =10;
        // a++;
    }
    public void show(final int num){
        // num=20;
        System.out.println(num);
    }
    public static void main(String[] args){

    }
}

final class FinalA{

}

// class FinalB extends FinalA{

// }
