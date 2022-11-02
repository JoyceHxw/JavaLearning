import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Scanner;

//异常体系结构
//java.lang.Throwable
//      java.lang.Error：一般不编写针对性的代码进行处理
//      java.lang.Exception：可以进行异常的处理
//          编译时的异常（checked），如IOException，ClassNotFoundException
//          运行时的异常（unchecked），如NullPointerException，ArrayIndexOutOfBoundsException

public class ExceptionTest{
    public static void main(String[] args){
        ExceptionTest e = new ExceptionTest();
        e.test6();
    }

    //运行时异常
    //NullPointerException
    public void test1(){
        int[] arr = null;
        System.out.println(arr[3]);

        String str = null;
        System.out.println(str.charAt(0));
    }

    // IndexOutOfBoundsException
    public void test2(){
        int[] arr = new int[10];
        System.out.println(arr[10]);
    }

    //ClassCastException
    public void test3(){
        Object o = new Date();
        String str = (String)o;
    }

    //NumberFormatException
    public void test4(){
        String str = "abc";
        int num = Integer.parseInt(str);
    }

    //InputMismatchException
    public void test5(){
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        System.out.println(score);
    }

    //ArithmeticException
    public void test6(){
        int a = 0;
        int b =10;
        System.out.println(b/a);
    }

    //编译时异常
    //
    // public void test7(){
    //     File file = new File("hello.txt");
    //     FileInputStream fis = new FileInputStream(file);
    //     int data = fis.read();
    //     while(data != -1){
    //         System.out.print((char)data);
    //         data = fis.read();
    //     }

    //     fis.close();
    // }
}