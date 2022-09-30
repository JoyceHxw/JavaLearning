//this调用构造器
//只能调用除自己以外的构造器
//构造器只能被调用一次也只能调用一次其他构造器
//this调用其他构造器必须声明在当前构造器的首航

public class ThisConstructor{
    public static void main(String[] args){
        Boy boy = new Boy("Romeo", 19);
        boy.shout();

        Girl girl = new Girl("Juliet", 18);
        girl.marry(boy);

        Girl girl1 = new Girl("祝英台", 23);
        if(girl.compare(girl1)<=0){
            System.out.println(girl1.getName()+"大");
        } else{
            System.out.println(girl.getName()+"大");
        }

    }
}

class Boy{
    private String name;
    private int age;

    public Boy(){
        System.out.println("this调用构造器");
    }

    public Boy(String name, int age){
        this();
        this.name=name;
        this.age=age;
    }

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

    public void marry(Girl girl){
        System.out.println("我要娶"+girl.getName());
    }

    public void shout(){
        if(age>=22){
            System.out.println("你可以登记结婚了");
        } else{
            System.out.println("你还不能结婚");
        }
    }
}

class Girl{
    private String name;
    private int age;

    public Girl(String name, int age){
        this.name=name;
        this.age=age;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }


    public void marry(Boy boy){
        System.out.println("我要嫁给"+boy.getName());
        boy.marry(this);
    }

    public int compare(Girl girl){
        return this.age-girl.age;
    }
}

