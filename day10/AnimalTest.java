//封装性的体现：将类的属性私有化，同时提供公共的方法来获取和设置此属性的值
//四种权限（private,缺省,protected,public）都可以用来修饰类的内部结构：属性、方法、构造器、内部类
//但只有使用缺省、public修饰类
class AnimalTest{
    public static void main(String[] args){
        Animal a= new Animal();
        a.name="猫";
        //a.legs=3; 不可直接赋值
        a.setLegs(4);
        System.out.println(a.getLegs());
        a.show();
    }
}

class Animal{
    String name;
    private int legs; //限制赋值权限

    //对属性的设置
    public void setLegs(int i){
        if(i>0){
            legs=i;
        } else{
            legs=0;
        }
    }

    //对属性的获取
    public int getLegs(){
        return legs;
    }
    //get和set分开写，不然没有意义

    public void show(){
        System.out.println(name+"的脚有"+legs+"只");
    }
}