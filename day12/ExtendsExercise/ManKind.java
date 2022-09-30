package ExtendsExercise;

public class ManKind {
    int sex;
    int salary;

    public ManKind(){
        
    }

    public void manOrWoman(){
        if(sex==1){
            System.out.println("Man");
        } else{
            System.out.println("Woman");
        }
    }

    public void employeed(){
        if(salary==0){
            System.out.println("No job");
        } else{
            System.out.println("Job");
        }
    }
}
