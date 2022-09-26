import java.util.Scanner;

public class Test{
    public static void main(String[] args){
        Test t = new Test();
        t.customer();
    }

    public void customer(){
        Scanner scan = new Scanner(System.in);

        boolean isFlag=true;
        while(isFlag==true){
            System.out.println("客户信息管理软件");
            System.out.println("1 添加客户");
            System.out.println("2 修改客户");
            System.out.println("3 删除客户");
            System.out.println("4 客户列表");
            System.out.println("5 退出");
            
            System.out.println("请输入你的选择：");
            int index = scan.nextInt();

            if(index==1){
                System.out.println("1 添加客户");
                isFlag=false;
            } else{
                isFlag=true;
            }
        }
    }
}
