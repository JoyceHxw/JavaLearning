import java.io.FileNotFoundException;
import java.io.IOException;

//方法重写的规则：
//子类重写的方法抛出的异常类型不大于父类被重写的方法抛出的异常类型

//开发中如何选择使用try-catch-finally，还是使用throws
//如果父类中被重写的方法没有throws方式处理异常，则子类重写的方法也不能使用throws，子类必须用try-catch-finally处理
//执行的方法中，先后调用了另外几个方法，这几个方法是递进关系的，建议这几个方法用throws处理，而执行的方法可以使用try-catch-finally处理


public class OverrideTest {
    
    public static void main(String[] args){
        OverrideTest test = new OverrideTest();
        test.display(new SubClass());
    }

    public void display(SuperClass s){
        try {
            s.method();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class SuperClass{
    public void method() throws IOException{

    }
}

class SubClass extends SuperClass{
    public void method() throws FileNotFoundException{

    }
}