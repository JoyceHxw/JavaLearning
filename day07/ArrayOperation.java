import javax.swing.TransferHandler.TransferSupport;

// class ArrayOperation{
//     public static void main(String[] args){
//         int[] arr = new int[10];

//         int max = 10;
//         int min = 99;
//         int sum = 0;

//         for(int i=0; i<10; i++){
//             arr[i]=(int)(Math.random()*90+10);
//             System.out.println(arr[i]);
//             if(arr[i]>=max){
//                 max=arr[i]; //最大值
//             }
//             if(arr[i]<=min){
//                 min=arr[i];//最小值
//             }
//             sum+=arr[i];
//         }
        
//         System.out.println("最大值是"+max);
//         System.out.println("最小值是"+min);
//         System.out.println("和为"+sum);
//         System.out.println("平均值是"+sum/arr.length);

//     }
// }

// class ArrayDuplication{
//     public static void main(String[] args){
//         String[] arr1 = new String[]{"AA","DD","UU","HH","II","RR"};
//         //数组的复制，要重新定义数组元素
//         String[] arr2 = new String[arr1.length];
//         for(int i=0; i<arr2.length; i++){
//             arr2[i]=arr1[i];
//             System.out.print(arr2[i]+"\t");
//         }
        
//     }
// }

class ArrayFind{
    public static void main(String[] args){
        //线性查找
        String[] arr1 = new String[]{"AA","DD","UU","HH","II","UU"};
        String goal = "UU";

        for(int i=0; i<arr1.length; i++){
            if(goal.equals(arr1[i])){
                System.out.println("所在索引位置："+i);
            }
        }

        //二分法查找
        //前提：所要查找的数组必须有序
        int[] arr2 = new int[]{-18,-15,-5,0,2,5,8,14,16,21,36};
        int goal2 = 8;
        int head =0;
        int end=arr2.length-1;
        boolean isFlag = true;

        while(head<=end){
            int middle = (head+end)/2;
            if(goal2==arr2[middle]){
                System.out.println("所在索引位置为"+middle);
                isFlag=false;
                break;
            } else if(arr2[middle]>goal2){
                end = middle-1;
            } else{
                head=middle+1;
            }
        }

        if(isFlag){
            System.out.println("很遗憾没有找到");
        }



        
    }
}