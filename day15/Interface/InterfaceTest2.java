package Interface;

//接口的具体使用，体现多态性
//接口，实际上可以看作是一种规范

public class InterfaceTest2 {
    public static void main(String[] args){
        Computer c = new Computer();
        
        //1.创建了接口的非匿名实现类的非匿名对象
        Flash f = new Flash();
        c.transferData(f);

        //2.创建了非匿名实现类的匿名对象
        c.transferData(new Printer());

        //3.创建了接口的匿名实现类的非匿名对象
        USB phone = new USB() {

            @Override
            public void start() {
                System.out.println("手机开始工作");
                
            }

            @Override
            public void stop() {
                System.out.println("手机结束工作");
                
            }
            
        };
        c.transferData(phone);

        //4.创建了接口的匿名实现类的匿名对象
        c.transferData(new USB() {

            @Override
            public void start() {
                System.out.println("mp3开始工作");
                
            }

            @Override
            public void stop() {
                System.out.println("mp3结束工作");
                
            }
            
        });
    }
}

class Computer{
    public void transferData(USB usb){ //实际上是USB usb = new Flash();
        usb.start();
        System.out.println("具体传输数据的细节");
        usb.stop();
    }
}

interface USB {
    void start();
    void stop();
}

class Flash implements USB{

    @Override
    public void start() {
        System.out.println("U盘开始工作");
        
    }

    @Override
    public void stop() {
        System.out.println("U盘结束工作");
        
    }
    
}

class Printer implements USB{

    @Override
    public void start() {
        System.out.println("打印机结束工作");
        
    }

    @Override
    public void stop() {
        System.out.println("打印机结束工作");
        
    }
    
}