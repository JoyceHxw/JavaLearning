import java.util.Scanner;

// class IfTest{
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);

//         System.out.println("请输入小岳的成绩：");
//         double score = scan.nextDouble();

//         if(score == 100){ //if记得小写
//             System.out.println("奖励一台iPhone");
//         } else if(score>80 & score <=99){
//             System.out.println("奖励一顿自助餐");
//         } else{ //else可以不写
//             System.out.println("你还需要继续努力");
//         }
//     }
// }

// class IfTestExercise1{
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);

//         System.out.println("请输入第一个数：");
//         double num1 = scan.nextDouble();

//         System.out.println("请输入第二个数：");
//         double num2 = scan.nextDouble();
        
//         System.out.println("请输入第三个数：");
//         double num3 = scan.nextDouble();

//         if(num1 >= num2 ){
//             if(num3 >= num1){
//                 System.out.println(num2+","+num1+","+num3);
//             } else if(num3 <= num2){
//                 System.out.println(num3+","+num2+","+num1);
//             } else{
//                 System.out.println(num2+","+num3+","+num1);
//             }
//         } else{
//             if(num3 >= num2){
//                 System.out.println(num1+","+num2+","+num3);
//             } else if(num3 <= num1){
//                 System.out.println(num3+","+num1+","+num2);
//             } else{
//                 System.out.println(num1+","+num3+","+num2);
//             }
//         }
//     }
// }

class IfTestExercise2{
    public static void main(String[] args) {
        int lottery = (int)(Math.random()*90+10);
        Scanner scan = new Scanner(System.in);

        System.out.println("今天的中奖号码是：" + lottery);
        System.out.println("请输入你的号码：");
        int num = scan.nextInt();

        int lottery10 = lottery/10;
        int lottery1 = lottery%10;
        int num10 = num/10;
        int num1 = num%10;

        if(num == lottery){
            System.out.println("您的奖金是10000美元");
        } else if(num10 == lottery1 & num1 == lottery10){
            System.out.println("您的奖金是3000美元");
        } else if(num10 == lottery10 || num1 == lottery1){
            System.out.println("您的奖金是1000美元");
        } else if(num10 == lottery1 || num1 == lottery10){
            System.out.println("您的奖金是500美元");
        } else{
            System.out.println("很遗憾，您没有中奖");
        }

    }
}