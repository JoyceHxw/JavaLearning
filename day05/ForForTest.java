// class ForForTest{
//     public static void main(String[] args){
//         for(int a=1; a<=5; a++){
//             for(int i=1; i<=5-a; i++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=a; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         for(int a2=1; a2<=4; a2++){
//             for(int i2=1; i2<=a2; i2++){
//                 System.out.print(" ");
//             }
//             for(int j2=1; j2<=5-a2; j2++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
        
//     }
// }

// class ForForTest99{
//     public static void main(String[] args){
//         for(int j=1;j<=9;j+=1){
//             for(int i=1; i<=j; i+=1){
//                 System.out.print(i+"*"+j+"="+(i*j)+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// class ForForTestPrimeNumber{
//     public static void main(String[] args){
//         long start = System.currentTimeMillis();
//         int count =0;
//         for(int j=2;j<=100000;j++){
//             // long multiply =1l;
//             //注意如果相乘的化要改为long型，不然容易超出int范围
//             //如果数值太大，就会花费较长时间
//             boolean isFlag = true;//优化2
//             for(int i=2; i<=Math.sqrt(j); i++){  //优化3改成根号
//                 // multiply=multiply*(j%i);
//                 // if(multiply==0){
//                 //     break;
//                 // } // 优化1
//                 if(j%i==0){
//                     isFlag = false;
//                     break; // 优化2
//                 } 
//             }  
//             if(isFlag==true){
//                 // System.out.println("质数"+j);
//                 count++;
//             }
//         }
//         long end = System.currentTimeMillis();
//         System.out.println("所花费的时间为"+(end-start)+"毫秒");
//     }
// }

//break:结束当前循环；continue:结束当次循环
class ForForTestPrimeNumber{
    public static void main(String[] args){
        long start = System.currentTimeMillis();
        int count =0;
        label: for(int j=2;j<=100000;j++){
            // long multiply =1l;
            //注意如果相乘的化要改为long型，不然容易超出int范围
            //如果数值太大，就会花费较长时间
            boolean isFlag = true;//优化2
            for(int i=2; i<=Math.sqrt(j); i++){  //优化3改成根号
                // multiply=multiply*(j%i);
                // if(multiply==0){
                //     break;
                // } // 优化1
                if(j%i==0){
                    isFlag = false;
                    continue label; // 优化2
                } 
            }  
            //能执行到此步骤的都是质数
            count++;
        }
        long end = System.currentTimeMillis();
        System.out.println("所花费的时间为"+(end-start)+"毫秒");
        System.out.println(count);
    }
}