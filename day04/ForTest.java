import java.util.Scanner;

// class ForTest{
//     public static void main(String[] args) {

//         for(long num=1l, s = 0l, c=0l; num<=100; num++) {
//             s += num;
//             if(num % 2 == 0){
//                 c+=1;
//                 System.out.println("第"+c+"个偶数："+num);
//             }
//             System.out.println("num="+num);
//             System.out.println("s="+s);
//         }
//     }
// }

class ForTest{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("第一个数");
        int m = scan.nextInt();
        System.out.println("第二个数");
        int n = scan.nextInt();

        int min = (m>n)? n : m;

        // for(int x=min; m%x != 0 || n%x != 0; x--) {
        //     // if(m%x==0 && n%x==0) {
        //     //     System.out.println("最大公约数是"+x);
        //     //     break; //一旦在循环中执行到break就跳出循环
        //     // }
        //     System.out.println("最大公约数是"+x);
        // }
        //这个条件语句当到最大公约数时就结束循环了

        for(int x=min; x>=1; x--) {
            if(m%x==0 && n%x==0) {
                System.out.println("最大公约数是"+x);
                break; //一旦在循环中执行到break就跳出循环
            }
        }
    }
}