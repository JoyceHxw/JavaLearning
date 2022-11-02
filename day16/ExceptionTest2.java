import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//异常处理的方式二：throws+异常类型
//写在方法的声明处，指明此方法执行时可能会抛出的异常类型，一旦方法体执行时，出现异常，仍会在异常代码处生成一个异常类的对象。此对象满足throws后异常类型时，就会被抛出
//异常代码后面的代码不会被执行

public class ExceptionTest2 {

public static void main(String[] args){
    ExceptionTest2 e = new ExceptionTest2();
    try{
        e.method2();
    } catch(IOException e1){
        e1.printStackTrace();
    }

}

    public void method2() throws IOException{
        method1();
    }

    public void method1() throws FileNotFoundException,IOException{
        File file = new File("hello.txt");
            FileInputStream fis = new FileInputStream(file);
            int data = fis.read();
            while(data != -1){
                System.out.print((char)data);
                data = fis.read();
            }
    
            fis.close();
            System.out.println("hahaha");
    }
}
