package project02;
import java.util.Scanner;

public class CustomerList {
    private Customer[] customers;
    private int total;
    java.util.Scanner scan =  new Scanner(System.in);

    //构造器
    public CustomerList(int totalCustomer){
        customers = new Customer[totalCustomer];
        //totalCustomer是容量，total是存入的个数
    }

    //方法
    public boolean addCustomer(Customer customer){
        if(total>=customers.length){
            return false;
        } else{
            customers[total++] = customer;
            return true;
        }

    }
    public boolean replaceCustomer(int index, Customer cust){
        boolean isFlag = false;
        if(index<=total-1){
            customers[index]=cust;
            isFlag=true;
        } else{
            isFlag=false;
        }
        return isFlag;
    }
    public boolean deleteCustomer(int index){
        //数组是有序的，必须一个挨一个
        boolean isFlag = false;
        if(index<=total-1){
            for(int i = index; i<=total-1; i++){
                customers[i]=customers[i+1];
            }
            //最后有数据的元素需要置空
            customers[--total]=null;
            isFlag=true;
        } else{
            isFlag=false;
        }
        return isFlag;
    }
    public Customer[] getAllCustomers(){
        //不能直接返回customers，因为有空值
        Customer[] custs=new Customer[total];
        for(int i = 0; i<total;i++){
            custs[i]=customers[i];
        }
        return custs;
    }
    public Customer getCustomer(int index){
        if(index>=total){
            return null;
        } else{
            return customers[index];
        }
    }
    public int getTotal(){
        return total;
    }
}
