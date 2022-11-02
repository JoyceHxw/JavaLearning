
//异常的处理：抓抛模型

//过程一：“抛”，程序在正常执行的过程中，一旦出现异常，就会在异常代码处生成一个对应异常类的对象，并将此对象抛出，其后的代码不再执行
//过程二：“抓”，异常的处理方式：try-catch-finally，throws

//try-catch-finally的使用
//finally是可选的
//使用try将可能出现异常代码包装起来，在执行的过程中，一旦出现异常就会生成一个对应异常类的对象，根据此对象的类型，去catch中进行匹配
//一旦try中的异常对象匹配到某一个catch时，就进入catch中进行异常的处理，一旦处理完成，就会跳出当前try- catch结构（在当前没有写finally的情况），继续执行其后的代码
//catch中的异常类型如果没有子父类关系，则要求子类一定生命在父类的上面，否则报错
//常用的异常对象处理的方式：getMessage(), printStackTrace()
//在try结构中声明的变量，出了try-catch结构后，不能再被调用

public class ExceptionTest1 {
    public static void main(String[] args){
        ExceptionTest1 e = new ExceptionTest1();
        e.test1();
    }
    

    public void test1(){
        String str = "abc";
        try{
            int num = Integer.parseInt(str);
            System.out.println(num);
        } catch(NumberFormatException e){
            System.out.println("出现数值转换异常了");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Hello!");
    }
}
