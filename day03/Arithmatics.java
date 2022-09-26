class Arithmatics{
    public static void main(String[] args) {
        //int型运算结果仍未int型，即使结果定义为double型也可能会损失精度；
        //int与float或double型运算结果为float或double型
        int num1 = 12;
        int num2 = 5;
        double num3 = num1/num2;
        double num4 = num1/(num2+0.0);

        System.out.println(num3);
        System.out.println(num4);

        //前++：先自增1，再运算
        //后++：先运算，后自增1
        //自增1不会改变变量本身的数据类型
        int a1 = 10;
        int b1 = ++a1;

        int a2 = 3;
        int b2 = a2++;

        System.out.println("a1=" + a1 + ", b1=" + b1);
        System.out.println("a2=" + a2 + ", b2=" + b2);

        short num5 = 3;
        num5 += 0.1; //不改变变量本身的数据类型
        System.out.println(num5);

        //交换两个变量的值
        //求和法好处：不用定义临时变量；坏处：相加操作可能超出存储范围，且只适用于数值类型
        //推荐使用定义临时变量的方式
        int x = 10;
        int y = 20;
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("x="+x+",y="+y);

        //三元运算符
        int m = 12;
        int n = 18;
        
        int max = (m>n)? m : n;
        System.out.println(max);
        
    }
}