import java.util.Scanner;

// class WhileTest{
//     public static void main(String[] args){
//         int i = 1;
//         while(i<=100){
//             if(i%2 == 0){
//                 System.out.println("偶数有"+i);
//             }
//             i+=1;
//         }
//     }
// }
// //与for循环不同的是 i在循环外也有效


// class DoWhileTest{
//     public static void main(String[] args){
//         int i = 1;
//         int sum = 0;
//         int count = 0;

//         do{
//             if(i%2 == 0){
//                 System.out.println("偶数有"+i);
//                 sum+=i;
//                 count++;
//             }
//             i+=1;
//         } while(i<=100); 
//         System.out.println("偶数总数为"+sum);
//         System.out.println("偶数个数为"+count);
//     }
// }

class WhileTestExercise{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int values = 1;
        int count1 = 0;
        int count2 = 0;

        while(values != 0){ //或者可以用while(True)或for(;;)
            System.out.println("请输入一个数");
            values = scan.nextInt();
            if(values > 0){
                count1++;
            } else if(values<0){
                count2++;
            }
            System.out.println("正数有"+count1+"个");
            System.out.println("负数有"+count2+"个");
        }
    }
}
