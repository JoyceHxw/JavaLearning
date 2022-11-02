package Security;

public class ProductCustomer {
    public static void main(String[] args){
        Clerk clerk = new Clerk();
        Producer producer = new Producer(clerk);
        Customer customer = new Customer(clerk);

        producer.setName("生产者");
        customer.setName("消费者");

        producer.start();
        customer.start();
    }
}

class Clerk{
    private int productCount = 0;

    public synchronized void ProduceProduct(){
        if(productCount<20){
            productCount++;
            System.out.println(Thread.currentThread().getName()+"开始生产第"+productCount+"个产品");
            notify();
        } else{
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    public synchronized void ConsumeProduct(){
        if(productCount>0){
            System.out.println(Thread.currentThread().getName()+"开始消费第"+productCount+"个产品");
            productCount--;
            notify();
        } else{
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class Producer extends Thread{
    private Clerk clerk;
    public Producer(Clerk clerk){
        this.clerk = clerk;
    }
    @Override
    public void run() {
        System.out.println(getName()+"开始生产产品");
        while(true){
            try {
                sleep(200);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            clerk.ProduceProduct();
        }
    }
}

class Customer extends Thread{
    private Clerk clerk;
    public Customer(Clerk clerk){
        this.clerk = clerk;
    }

    public void run() {
        System.out.println(getName()+"开始消费产品");
        while(true){
            try {
                sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            clerk.ConsumeProduct();
        }
    }
}
