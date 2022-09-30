class InstanceTest{
    public static void main(String[] args){
        Phone p1 = new Phone();
        System.out.println(p1);

        p1.sendEmail();
        p1.playGame();

        //匿名对象
        new Phone().sendEmail();
        new Phone().playGame();
        new Phone().price = 5808;
        new Phone().showPrice();
        //匿名对象只能调用一次，每次new都是新的对象

        //匿名对象的使用
        PhoneShop p3 = new PhoneShop();
        p3.show(new Phone());
    }
}

class PhoneShop{
    public void show(Phone p2){
        p2.sendEmail();
        p2.playGame();
    }
}


class Phone{
    double price;

    public void sendEmail(){
        System.out.println("发送邮件");
    }

    public void playGame(){
        System.out.println("玩游戏");
    }

    public void showPrice(){
        System.out.println("价格为："+price);
    }
}