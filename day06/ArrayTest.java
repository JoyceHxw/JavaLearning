class ArrayTest{
    public static void main(String[] args){
        //一维数组的声明和初始化
        //数组一旦初始化完成，其长度就确定了
        //整形的默认初始值为0；char型为ASII码0；boolean型为false；引用数据类型为null
        int[] ids;
        ids = new int[]{1001, 1002, 1003, 1004}; //静态初始化：数组的初始化和数组元素的赋值操作同时进行
        
        String[] names = new String[3]; //动态初始化：数组的初始化和数组元素的赋值操作分开进行
        names[0] = "黄渲雯";
        names[1] = "黄刚";
        names[2] = "赵平";

        System.out.println(ids.length);
        System.out.println(names.length);

        for(int i = 0; i<names.length; i++){
            System.out.println(names[i]);
        }
    }
}