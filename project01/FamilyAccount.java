import java.util.Scanner;
class FamilyAccount{
    public static void main(String[] args){
        double balance = 0;
        String details = "收支\t账户金额\t收支金额\t说明\n";
        while(true){
            Scanner scan = new Scanner(System.in);

            System.out.println("-家庭账户-");
            System.out.println("1 收支明细");
            System.out.println("2 登记收入");
            System.out.println("3 登记支出");
            System.out.println("4 退出");
            System.out.println();
            System.out.println("请选择1-4");
           
            int choice = scan.nextInt();
    
            if(choice == 1){
                // String type = "";
                // double amount = 0;
                // String description = "";
                System.out.println("-------收支明细");
                System.out.println(details);
            } else if(choice == 2){
                System.out.println("-------登记收入");
                System.out.print("请输入本次收入金额：");
                double income = scan.nextDouble();
                System.out.print("请输入本次收入说明：");
                String description = scan.next();
                // System.out.println("本次收入金额："+income);
                // System.out.println("本次收入说明："+description);
                balance += income;
                details += "收入\t"+balance+"\t\t"+income+"\t\t"+description+"\n";
            } else if(choice == 3){
                System.out.println("-------登记支出");
                System.out.print("请输入本次支出金额：");
                double outcome = scan.nextDouble();
                System.out.print("请输入本次支出说明：");
                String description = scan.next();
                // System.out.println("本次支出金额："+outcome);
                // System.out.println("本次支出说明："+description);
                balance -= outcome;
                details += "支出\t"+balance+"\t\t"+outcome+"\t\t"+description+"\n";
            } else if(choice == 4){
                System.out.println("-------退出");
                System.out.println("确认是否退出（0/1）");
                int confirmation = scan.nextInt();
                if(confirmation == 1){
                    break;
                } else if(confirmation == 0){
                } else{
                    System.out.println("请重新输入（Y/N）");
                }
            } else{
                System.out.println("请重新输入");
            }
        }
        
    }
}