package EqualsExercise;

public class Exercise1 {
    public static void main(String[] args){
        Order order1=new Order(1100,"a");
        Order order2=new Order(1100,"b");
        System.out.println(order1.equals(order2));
    }
}

class Order{
    private int orderId;
    private String orderName;

    public Order(int orderId, String orderName){
        this.orderId=orderId;
        this.orderName=orderName;
    }

    public int getOrderId(){
        return orderId;
    }
    public String getorderName(){
        return orderName;
    }

    public void setOrderId(int orderId){
        this.orderId=orderId;
    }
    public void setOrderName(String orderName){
        this.orderName=orderName;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
        
        if(obj instanceof Order){
            Order o =(Order) obj;
            if(this.orderId==o.orderId && this.orderName.equals(o.orderName)){
                return true;
            } else{
                return false;
            }
        } else{
            return false;
        }
    }
}
