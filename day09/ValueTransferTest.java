//如果传递的参数是基本数据类型，此时实参赋给形参的是实参真实存储的是数据值
//方法执行完，自动释放
//栈存放局部变量，局部变量存放基本数据类型和引用数据类型的地址
// public class ValueTransferTest{
//     public static void main(String[] args){
//         ValueTransferTest v = new ValueTransferTest();
//         int m=10;
//         int n=20;
//         System.out.println(m+" "+n);

//         v.swap(m,n);
//         System.out.println(m+" "+n);
        
//     }

//     public void swap(int a, int b){
//         int temp =a;
//         a=b;
//         b=a; 
//     }

// }

//如果传递的参数是引用数据类型，此时实参赋给形参的是实参存储数据的地址

public class ValueTransferTest{
    public static void main(String[] args){

        ValueTransferTest v = new ValueTransferTest();
        
        Data data = new Data();
        data.m=10;
        data.n=20;
        System.out.println(data.m+" "+data.n);
        v.swap(data);
        System.out.println(data.m+" "+data.n);

        
    }

    public void swap(Data data){
        int temp =data.m;
        data.m=data.n;
        data.n=temp; 
    }

}

class Data{
    int m;
    int n;
}