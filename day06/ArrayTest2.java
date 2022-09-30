class ArrayTest2{
    public static void main(String[] args){
        //二维数组的声明和初始化
        //静态初始化
        int[][] arr1 = new int[][]{{1,2,3},{2,6},{6,4,7}};
        //动态初始化
        String[][] arr2 = new String[3][2];
        String[][] arr3 = new String[3][];
        
        //调用位置元素
        System.out.println(arr1[0][1]);
        System.out.println(arr2[1][1]);

        arr3[1] = new String[4];
        //如果不定义第二维数组，则无法调用
        System.out.println(arr3[1][0]);

        //获取数组的长度
        System.out.println(arr1.length);
        System.out.println(arr1[1].length);

        //遍历二维数组
        for(int i = 0; i<arr1.length; i++){
            for(int j=0; j<arr1[i].length; j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        
        //二维数组的初始化
        int[][] arr4 = new int[4][3];
        System.out.println(arr4);//地址
        System.out.println(arr4[1]);//地址
        System.out.println(arr4[1][0]);

        String[][] arr5 = new String[4][3];
        System.out.println(arr5);//地址
        System.out.println(arr5[1]);//地址
        System.out.println(arr5[1][0]);

        double[][] arr6 = new double[4][];
        System.out.println(arr6);//地址
        System.out.println(arr6[1]);//地址
    }
}