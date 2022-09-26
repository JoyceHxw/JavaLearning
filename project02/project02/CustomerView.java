package project02;
import java.util.Scanner;

class CustomerView{

    CustomerList customerList = new CustomerList(10);
    // CustomerView customerView = new CustomerView();
    Scanner scan = new Scanner(System.in);


    public void enterMainMenu(){
        CustomerView customerView = new CustomerView();
        boolean isFlag=true;

        while(isFlag==true){
            System.out.println("客户信息管理软件");
            System.out.println("1 添加客户");
            System.out.println("2 修改客户");
            System.out.println("3 删除客户");
            System.out.println("4 客户列表");
            System.out.println("5 退出");
            
            System.out.print("请输入你的选择：");
            int number = scan.nextInt();

            if(number==1){
                customerView.addNewCustomer();
                // isFlag=false;
            } else if(number==2){
                customerView.modifyCustomer();
                // isFlag=false;
            } else if(number==3){
                customerView.deleteCustomer();
                // isFlag=false;
            } else if(number==4){
                customerView.listAllCustomers();
                // isFlag=false;
            } else if(number==5){
                System.out.println("你确认想退出吗?(0/1)");
                int choice = scan.nextInt();
                if(choice==1){
                   isFlag=false;
                } else{
                    System.out.println("请重新输入你的选择：");
                    // isFlag=true;
                }
            } else{
                System.out.println("请重新输入：");
                // isFlag=true;
            }
        }
    }


    private void addNewCustomer(){
        // CustomerList customerList = new CustomerList(10);
        // CustomerView customerView = new CustomerView();
        Customer cust =  new Customer();

        System.out.print("姓名：");
        String name=scan.next();
        cust.setName(name);

        System.out.print("性别：");
        String gender=scan.next();
        cust.setGender(gender);

        System.out.print("年龄：");
        int age=scan.nextInt();
        cust.setAge(age);

        System.out.print("电话：");
        String phone=scan.next();
        cust.setPhone(phone);

        System.out.print("邮箱：");
        String email=scan.next();
        cust.setEmail(email);

        boolean isSuccess = customerList.addCustomer(cust);
        if(isSuccess){
            System.out.println("添加完成");
        } else{
            System.out.println("添加失败");
        }
    }

    private void modifyCustomer(){
        // CustomerList customerList = new CustomerList(10);
        // CustomerView customerView = new CustomerView();
        while(true){

            System.out.print("请选择要修改的索引号：");
            int index=scan.nextInt(); 
            Customer cust = customerList.getCustomer(index-1);

            if(index<=0 || cust == null){
                System.out.println("请重新选择：");
            } else{
                System.out.print("姓名（"+cust.getName()+"）"+"是否要修改（0/1）：");
                int choice1 = scan.nextInt();
                if(choice1==1){
                    System.out.print("新的名字是：");
                    String newName=scan.next();
                    cust.setName(newName);
                }
                System.out.print("性别（"+cust.getGender()+"）"+"是否要修改（0/1）：");
                int choice3 = scan.nextInt();
                if(choice3==1){
                    System.out.print("新的性别是：");
                    String newGender=scan.next();
                    cust.setGender(newGender);
                }
                System.out.print("年龄（"+cust.getAge()+"）"+"是否要修改（0/1）：");
                int choice2 = scan.nextInt();
                if(choice2==1){
                    System.out.print("新的年龄是：");
                    int newAge=scan.nextInt();
                    cust.setAge(newAge);
                }
                System.out.print("电话（"+cust.getPhone()+"）"+"是否要修改（0/1）：");
                int choice4 = scan.nextInt();
                if(choice4==1){
                    System.out.print("新的电话是：");
                    String newPhone=scan.next();
                    cust.setPhone(newPhone);
                }
                System.out.print("邮箱（"+cust.getEmail()+"）"+"是否要修改（0/1）：");
                int choice5 = scan.nextInt();
                if(choice5==1){
                    System.out.print("新的邮箱是：");
                    String newEmail=scan.next();
                    cust.setEmail(newEmail);
                }
            }
            boolean isSuccess = customerList.replaceCustomer(index-1, cust);
            if(isSuccess==true){
                System.out.println("替换成功");
                return;
            } else{
                System.out.println("替换失败");
                return;
            }
        }
    }

    private void deleteCustomer(){
        // CustomerList customerList = new CustomerList(10);
        // CustomerView customerView = new CustomerView();
        while(true){
            System.out.print("请选择要删除客户的编号（99退出）：");
            int index=scan.nextInt();
            Customer cust = customerList.getCustomer(index-1);

            if(index==99){
               return;//结束方法
            } else if(cust==null){
                System.out.println("请重新选择编号：");
                // return;
            } else{
                System.out.print("你确认要删除吗？（0/1）");
                int choice = scan.nextInt();
                if(choice==0){
                    return;
                } else{
                    boolean deleteSuccess = customerList.deleteCustomer(index-1);
                    if(deleteSuccess==true){
                        System.out.println("删除成功");
                    } else{
                        System.out.println("删除失败");
                    }
                    break;
                }
            }
        }
        

    }

    private void listAllCustomers(){
        int total = customerList.getTotal();
        if(total==0){
            System.out.println("没有客户记录");
        } else{
            System.out.println("客户列表");
            System.out.println("编号\t姓名\t性别\t年龄\t电话\t邮箱");
            Customer[] customers=customerList.getAllCustomers();
            for(int i=0;i<=total-1;i++){
                System.out.println((i+1)+"\t"+customers[i].getName()+"\t"+customers[i].getGender()+"\t"+customers[i].getAge()+"\t"+customers[i].getPhone()+"\t"+customers[i].getEmail());
            }
        }
    }

    public static void main(String[] args){
        CustomerView customerView = new CustomerView();
        customerView.enterMainMenu();
    }

}
