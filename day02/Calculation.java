class Calculation {
    public static void main (String[] args) {
        double a = 12.4;
        int b = (int)a;
        //强制转换，可能损失精度
        //整形常量默认为int类型，浮点型常量默认为double类型
        System.out.println(b);
    }
}