package service;


import domain.Architect;
import domain.Designer;
import domain.Employee;
import domain.Equipment;
import domain.NoteBook;
import domain.PC;
import domain.Printer;
import domain.Programmer;
// import view.TSUtility;

public class NameListService {
    public static void main(String[] args){
        NameListService n = new NameListService();
        System.out.println(n.getAllEmployees().length);
        System.out.println(n.getEmployee(3).getName());

    }

    Employee[] employees = new Employee[Data.EMPLOYEES.length];

    public NameListService(){


        Equipment equipment;

        for(int i = 0; i < Data.EMPLOYEES.length; i++){
            if(Data.EMPLOYEES[i][0]=="10"){
                employees[i] = new Employee();
                employees[i].setId(Integer.parseInt(Data.EMPLOYEES[i][1]));
                employees[i].setName(Data.EMPLOYEES[i][2]);
                employees[i].setAge(Integer.parseInt(Data.EMPLOYEES[i][3]));
                employees[i].setSalary(Double.parseDouble(Data.EMPLOYEES[i][4]));
            } else if(Data.EMPLOYEES[i][0]=="11"){
                employees[i] =  new Programmer();
                Programmer programmer = (Programmer) employees[i];
                programmer.setId(Integer.parseInt(Data.EMPLOYEES[i][1]));
                programmer.setName(Data.EMPLOYEES[i][2]);
                programmer.setAge(Integer.parseInt(Data.EMPLOYEES[i][3]));
                programmer.setSalary(Double.parseDouble(Data.EMPLOYEES[i][4]));


                if(Data.EQUIPMENTS[i][0]=="21"){
                    equipment = new PC();
                    PC pc = (PC) equipment;
                    pc.setModel(Data.EQUIPMENTS[i][1]);
                    pc.setDisplay(Data.EQUIPMENTS[i][2]);
                    programmer.setEquipment(equipment);
                } else if(Data.EQUIPMENTS[i][0]=="22"){
                    equipment = new NoteBook();
                    NoteBook noteBook = (NoteBook) equipment;
                    noteBook.setModel(Data.EQUIPMENTS[i][1]);
                    noteBook.setPrice(Double.parseDouble(Data.EQUIPMENTS[i][2]));
                    programmer.setEquipment(equipment);
                } else if(Data.EQUIPMENTS[i][0]=="23"){
                    equipment = new Printer();
                    Printer printer = (Printer) equipment;
                    printer.setName(Data.EQUIPMENTS[i][1]);
                    printer.setType(Data.EQUIPMENTS[i][2]);
                    programmer.setEquipment(equipment);
                }
            } else if(Data.EMPLOYEES[i][0]=="12"){
                employees[i] = new Designer();
                Designer designer = (Designer)employees[i];
                designer.setId(Integer.parseInt(Data.EMPLOYEES[i][1]));
                designer.setName(Data.EMPLOYEES[i][2]);
                designer.setAge(Integer.parseInt(Data.EMPLOYEES[i][3]));
                designer.setSalary(Double.parseDouble(Data.EMPLOYEES[i][4]));
                
                if(Data.EQUIPMENTS[i][0]=="21"){
                    equipment = new PC();
                    PC pc = (PC) equipment;
                    pc.setModel(Data.EQUIPMENTS[i][1]);
                    pc.setDisplay(Data.EQUIPMENTS[i][2]);
                    designer.setEquipment(equipment);
                } else if(Data.EQUIPMENTS[i][0]=="22"){
                    equipment = new NoteBook();
                    NoteBook noteBook = (NoteBook) equipment;
                    noteBook.setModel(Data.EQUIPMENTS[i][1]);
                    noteBook.setPrice(Double.parseDouble(Data.EQUIPMENTS[i][2]));
                    designer.setEquipment(equipment);
                } else if(Data.EQUIPMENTS[i][0]=="23"){
                    equipment = new Printer();
                    Printer printer = (Printer) equipment;
                    printer.setName(Data.EQUIPMENTS[i][1]);
                    printer.setType(Data.EQUIPMENTS[i][2]);
                    designer.setEquipment(equipment);
                }

                designer.setBonus(Double.parseDouble(Data.EMPLOYEES[i][5]));
            } else if(Data.EMPLOYEES[i][0]=="13"){
                employees[i] = new Architect();
                Architect architect = (Architect)employees[i];
                architect.setId(Integer.parseInt(Data.EMPLOYEES[i][1]));
                architect.setName(Data.EMPLOYEES[i][2]);
                architect.setAge(Integer.parseInt(Data.EMPLOYEES[i][3]));
                architect.setSalary(Double.parseDouble(Data.EMPLOYEES[i][4]));
                
                if(Data.EQUIPMENTS[i][0]=="21"){
                    equipment = new PC();
                    PC pc = (PC) equipment;
                    pc.setModel(Data.EQUIPMENTS[i][1]);
                    pc.setDisplay(Data.EQUIPMENTS[i][2]);
                    architect.setEquipment(equipment);
                } else if(Data.EQUIPMENTS[i][0]=="22"){
                    equipment = new NoteBook();
                    NoteBook noteBook = (NoteBook) equipment;
                    noteBook.setModel(Data.EQUIPMENTS[i][1]);
                    noteBook.setPrice(Double.parseDouble(Data.EQUIPMENTS[i][2]));
                    architect.setEquipment(equipment);
                } else if(Data.EQUIPMENTS[i][0]=="23"){
                    equipment = new Printer();
                    Printer printer = (Printer) equipment;
                    printer.setName(Data.EQUIPMENTS[i][1]);
                    printer.setType(Data.EQUIPMENTS[i][2]);
                    architect.setEquipment(equipment);
                }

                architect.setBonus(Double.parseDouble(Data.EMPLOYEES[i][5]));
                architect.setStock(Integer.parseInt(Data.EMPLOYEES[i][6]));
            }  
        }

    }

    public Employee[] getAllEmployees(){
        return employees;
    }

    public Employee getEmployee(int id) throws TeamException{
        // int number = TSUtility.readInt()-1;
        if(id <=0 || id >=13){
            throw new TeamException("找不到指定的员工");
        }

        return employees[id-1];
        
    }

}
