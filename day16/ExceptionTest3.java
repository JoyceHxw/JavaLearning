

public class ExceptionTest3 {
    public static void main(String[] args){
        Student s = new Student();
        try {
            s.register(-224563);
            System.out.println(s);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

class Student {
    private int id;
    public void register(int id) throws Exception{
        if(id>0){
            this.id=id;
        } else{
            // throw new RuntimeException("数据非法");
            // throw new Exception("数据非法");
            throw new MyException("不能输入负数");
        }
    }
}
