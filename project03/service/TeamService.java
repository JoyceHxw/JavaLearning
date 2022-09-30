package service;

import domain.Employee;
import domain.Programmer;

public class TeamService {
    public static int counter=-1;
    public static int memerId=0;
    public final int MAX_MEMBER = 5;
    Programmer[] team = new Programmer[MAX_MEMBER];
    int total = 0;

    public TeamService(){
        
    }

    public Programmer[] getTeam(){
        return team;
    }

    public void addMember(Employee e) throws TeamException{
        if(e == null){
            throw new TeamException("找不到指定的员工");
        } else if(e.getClassName()=="Employee"){
            throw new TeamException("不能添加无职位员工");
        } else if(total==MAX_MEMBER){
            throw new TeamException("团队已满，无法添加");
        } else{
            Programmer p = (Programmer)e;
            int i = 0;
            while(team[i] != null){
                if(team[i].getId()==e.getId()){
                    throw new TeamException("该成员已存在");
                }
                i++;
            }
            team[i]=p;
            counter +=1;
            memerId +=1;
            p.setCounter(counter);
            p.setMembetId(memerId);
            total +=1;
            p.setStatus(Status.BUSY);
        }
    }

    public void removeMember(int memberId) throws TeamException{
        int isnull = 0;
        for(int n =0; n<total; n++){
            if(team[n].getMembetId()==memberId){
                isnull+=1;
            }
        }

        if(isnull==0){
            throw new TeamException("找不到指定的员工");
        } else{
            int j = 0;
            while(true){
                if(team[j].getMembetId()==memberId){
                    team[j].setStatus(Status.FREE);
                    team[j]=null;
                    int i = j;
                    while(team[i+1]!=null){
                        team[i]=team[i+1];
                        team[i+1].setCounter(i);
                        i++;
                    }
                    team[total-1]=null;
                    total -=1;
                    counter -=1;
                    System.out.println("删除成功");

                    break;
                } else{
                    j++;
                }
            }
        }
    }
    
    public int getTotal() {
        return total;
    }

}
