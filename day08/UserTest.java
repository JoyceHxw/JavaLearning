public class UserTest{
    public static void main(String[] args){
        User u1 = new User();
        System.out.println(u1.name);
        System.out.println(u1.age);
        System.out.println(u1.isMale);
    }
    

}

class User{
    //属性（成员变量）
    String name;
    int age;
    boolean isMale;


    //局部变量没有默认初始化值，在调用前一定要显示赋值。形参在调用时赋值即可
    public void talk(String language){ //language形参，也是局部变量
        System.out.println("使用"+language);
    }

    public void eat(){
        String food = "烙饼"; //局部变量
        System.out.println("北方人喜欢吃"+food);
    }
}