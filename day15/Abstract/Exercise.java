package Abstract;

public class Exercise {
    public static void main(String[] args){
        Manager m = new Manager("Cook", 54, 100000, 80000);
        m.work();

        CommonEmployee c = new CommonEmployee();
        c.work();
    }
}

abstract class Employee{
    private String name;
    private int age;
    private double salary;

    public Employee(){

    }
    public Employee(String name, int age, double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    public abstract void work();
}

class Manager extends Employee{
    private double bonus;

    public Manager(String name, int age, double salary, double bonus){
        super(name, age, salary);
        this.bonus=bonus;
    }
    @Override
    public void work() {
        System.out.println("管理员工");
    }
}

class CommonEmployee extends Employee{
    @Override
    public void work() {
        System.out.println("搬砖");
    }
}