//this理解为当前对象或当前正在创建的对象
public class ThisTest{
    public static void main(String[] args){
        This t =  new This();
        t.setName("joyce");
        System.out.println(t.getName());
        t.setAge(22);
        System.out.println(t.getAge());
    }
}

class This{
    private String name;
    private int age;

    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}