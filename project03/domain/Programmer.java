package domain;

import service.Status;

public class Programmer extends Employee{
    private int membetId;
    private int counter;
    Status status= Status.FREE;
    Equipment equipment;
    
    public Programmer(){

    };
    
    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment=equipment;
    }
    
    public int getMembetId() {
        return membetId;
    }
    public void setMembetId(int membetId) {
        this.membetId = membetId;
    }

    public int getCounter() {
        return counter;
    }
    public void setCounter(int counter) {
        this.counter = counter;
    }

    public Equipment getEquipment() {
        return equipment;
    }
    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public String getClassName(){
        return "Programmer";
    }

    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
}
