
//自定义异常类
//继承于现有的异常结构：RunTimeException, Exception
//提供全局常量：serialVersionUID
//提供重载的构造器

public class MyException extends RuntimeException {
    static final long serialVersionUID = -70342471907456939L;

    public MyException(){

    }
    public MyException(String msg){
        super(msg);
    }
}
