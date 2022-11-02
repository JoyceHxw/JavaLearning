
//finally是可选的
//finally中声明的是一定会被执行的代码，即使catch中又出现异常了，try中又return语句，catch中有return语句等情况
//像数据库连接，输入输出流，网络变成Socket等资源，JVM是不能自动回收的，需要手动进行资源的释放，此时资源的释放就需要声明在finally中

public class FinallyTest {

    public static void main(String[] args){
        FinallyTest f = new FinallyTest();
        // f.test1();
        int num = f.method();
        System.out.println(num);
    }

    public void test1(){
        try{
            int a = 10;
            int b = 0;
            System.out.println(a/b);
        } catch(ArithmeticException e){
            e.printStackTrace();

            int[] arr = new int[10];
            System.out.println(arr[10]);

        } catch(Exception e){
            e.printStackTrace();
        } finally{
            System.out.println("一定会执行的代码");
        }
    }

    public int method(){
        try{
            int[] arr = new int[10];
            System.out.println(arr[10]);
            return 1;
        } catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            return 2;
        } finally{
            System.out.println("我一定会被执行");
        }
    }
}
