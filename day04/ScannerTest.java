import java.util.Scanner;

class ScannerTest{
//类命名的时候不要用已有类名
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入你的姓名");
        String name = scan.next();
        System.out.println(name);

        System.out.println("请输入你的年龄");
        int age = scan.nextInt();
        System.out.println(age);

        System.out.println("你是来相亲的吗？(true/false)");
        boolean thought = scan.nextBoolean();
        System.out.print(thought);
        //如果输入的数据类型与指定的数据类型不匹配，则会报错
    }
}