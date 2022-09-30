package ExtendsExercise;

public class KidOverwrite extends Kids {
    String major;

    public KidOverwrite(){

    }

    public void study(){
        System.out.println("学习"+major);
    }
    //对父类中的方法进行重写
    //子类重写的方法名和形参必须与父类被重写的方法名相同
    //子类重写的方法的权限修饰符不小于覆盖被重写的方法的权限修饰符
    //子类中不能重写父类中权限为private的方法
    //父类被重写的方法的返回值是void或基本数据类型，则子类重写的也必须一样
    //父类被重写的方法的返回值是A类型，则子类重写方法的返回值类型可以是A类型或A类的子类
}
