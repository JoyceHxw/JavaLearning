package view;


import domain.Architect;
import domain.Designer;
import domain.Programmer;
import service.NameListService;
import service.Status;
import service.TeamException;
import service.TeamService;

public class TeamView {
    public static void main(String[] args){
        TeamView t = new TeamView();
        t.enterMainMenu();
    }

    NameListService listSvc = new NameListService();
    TeamService teamSvc = new TeamService();

    public void enterMainMenu(){
        Boolean isFlag = true;
        while(isFlag){
            System.out.println("开发团队调度软件");
            String info = "ID" + "\t" + "姓名" + "\t" + "年龄" +"\t" + "工资" +"\t" + "职位" +"\t" + "\t" +"状态" +"\t" + "奖金" + "\t" +"股票" +"\t" + "领用设备" + "\n";
            for(int i =1; i<=listSvc.getAllEmployees().length; i++){
                if(listSvc.getEmployee(i).getClassName()=="Employee"){
                    info +=listSvc.getEmployee(i).getId() + "\t" + listSvc.getEmployee(i).getName() + "\t" + listSvc.getEmployee(i).getAge() +"\t" + listSvc.getEmployee(i).getSalary() +"\t" + null+"\t" +"\t" + Status.FREE +"\n";
                } else if(listSvc.getEmployee(i).getClassName()=="Programmer"){
                    Programmer programmer = (Programmer)listSvc.getEmployee(i);
                    info +=programmer.getId() + "\t" + programmer.getName() + "\t" + programmer.getAge() +"\t" + programmer.getSalary() +"\t" + programmer.getClassName() +"\t" + programmer.getStatus() + "\t"+"\t"+"\t"+programmer.getEquipment().getDescription() +"\n";
                } else if(listSvc.getEmployee(i).getClassName()=="Designer"){
                    Designer designer = (Designer)listSvc.getEmployee(i);
                    info +=designer.getId() + "\t" + designer.getName() + "\t" + designer.getAge() +"\t" + designer.getSalary() +"\t" + designer.getClassName() +"\t" + designer.getStatus() + "\t"+designer.getBonus()+"\t" +"\t"+designer.getEquipment().getDescription() +"\n";
                } else if(listSvc.getEmployee(i).getClassName()=="Architect"){
                    Architect architect = (Architect)listSvc.getEmployee(i);
                    info +=architect.getId() + "\t" + architect.getName() + "\t" + architect.getAge() +"\t" + architect.getSalary() +"\t" + architect.getClassName() +"\t" + architect.getStatus() + "\t"+architect.getBonus()+"\t" +architect.getStock()+"\t"+architect.getEquipment().getDescription() +"\n";
                }
            }
            System.out.println(info);
            System.out.println("1-团队列表  2-添加团队成员  3-删除团队成员  4-退出  请选择：");
    
            char menu = TSUtility.readMenuSelection();
            if(menu == '1'){
                System.out.println("团队成员列表");
                System.out.println("团队人数："+teamSvc.getTotal());
                String teamInfo = "TID/ID" + "\t" + "姓名" + "\t" + "年龄" + "\t" + "工资" + "\t" + "职位" + "\t" + "奖金" + "\t" + "股票" + "\n";
                for(int i =0; i<teamSvc.getTotal(); i++){
                    if(teamSvc.getTeam()[i].getClassName()=="Programmer"){
                        // Programmer programmer = (Programmer)teamSvc.getTeam()[i];
                        teamInfo += teamSvc.getTeam()[i].getMembetId() + "/" + teamSvc.getTeam()[i].getId()+ "\t"  + teamSvc.getTeam()[i].getName() + "\t" + teamSvc.getTeam()[i].getAge() + "\t" + teamSvc.getTeam()[i].getSalary() + "\t" + teamSvc.getTeam()[i].getClassName() + "\t" + null + "\t" + null + "\n";
                    } else if(teamSvc.getTeam()[i].getClassName()=="Designer"){
                        Designer designer = (Designer)teamSvc.getTeam()[i];
                        teamInfo += designer.getMembetId() + "/" + designer.getId()+ "\t"  + designer.getName() + "\t" + designer.getAge() + "\t" + designer.getSalary() + "\t" + designer.getClassName() + "\t" + designer.getBonus() + "\t" + null +"\n";
                    } else if(teamSvc.getTeam()[i].getClassName()=="Architect"){
                        Architect architect = (Architect)teamSvc.getTeam()[i];
                        teamInfo += architect.getMembetId() + "/" + architect.getId()+ "\t"  + architect.getName() + "\t" + architect.getAge() + "\t" + architect.getSalary() + "\t" + architect.getClassName() + "\t" + architect.getBonus() + "\t" + architect.getStock() +"\n";
                    }
                }
                System.out.println(teamInfo);
            } else if(menu == '2'){
                System.out.println("添加成员");
                System.out.print("请输入要添加的员工ID：");
                int addID = TSUtility.readInt();
                try{
                    teamSvc.addMember(listSvc.getEmployee(addID));
                    System.out.println("添加成功");
                } catch(TeamException e){
                    System.out.println(e.getMessage());
                }
                TSUtility.readReturn();
            } else if(menu == '3'){
                System.out.println("删除成员");
                System.out.print("请输入要删除的员工TID：");
                int delID = TSUtility.readInt();
                try{
                    teamSvc.removeMember(delID);
                } catch(TeamException e){
                    System.out.println(e.getMessage());
                }
                TSUtility.readReturn();
                
            } else if(menu=='4'){
                System.out.print("是否确认退出（Y/N）：");
                if(TSUtility.readConfirmSelection()=='Y'){
                    isFlag=false;
                }
            }
        }
        
    }

}
