package Abstract;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args){
        Employee1[] e = new Employee1[2];
        e[0]= new SalariedEmployee("Joyce", 1, new MyDate(2000, 12, 19),5000);
        e[1]= new HourlyEmployee("Mary", 2, new MyDate(1999, 5, 12),24,8);
        Scanner scan = new Scanner(System.in);
        int typeMonth = scan.nextInt();
        for(int i=0; i<e.length; i++){
            System.out.println(e[i].toString());
            if(typeMonth==e[i].getBirthday().getMonth()){
                System.out.println(e[i].earnings()+100);
            }
        }
    }
}

abstract class Employee1{
    private String name;
    private int number;
    private MyDate birthday;

    public Employee1(){

    }
    public Employee1(String name, int number, MyDate birthday){
        this.name=name;
        this.number=number;
        this.birthday=birthday;
    }

    public String getName() {
        return name;
    }
    public int getNumber() {
        return number;
    }
    public MyDate getBirthday() {
        return birthday;
    }

    public abstract double earnings();

    @Override
    public String toString() {
        return "[name=" + name + ", number" + number + ", birthday=" + birthday.toDateString() +"]";
    }

}

class MyDate{
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day){
        this.year=year;
        this.month=month;
        this.day=day;
    }

    public int getYear(){
        return year;
    }
    public int getMonth() {
        return month;
    }
    public int getDay() {
        return day;
    }

    public String toDateString(){
        return year + "年" + month + "月" + day + "日";
    }
}

class SalariedEmployee extends Employee1{

    private double monthlySalary;

    public SalariedEmployee(String name, int number, MyDate birthday, double monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary=monthlySalary;
    }

    @Override
    public double earnings() {
        return monthlySalary;
    }


    public String toString(){
        return "SalariedEmployee"+super.toString();
    }

}

class HourlyEmployee extends Employee1{

    private int wage=24;
    private int hour=8;

    public HourlyEmployee(String name, int number, MyDate birthday, int wage, int hour) {
        super(name, number, birthday);
        this.wage=wage;
        this.hour=hour;
    }

    @Override
    public double earnings() {
        return wage*hour;
    }
    
    public String toString(){
        return "HourlyEmployee" + super.toString();
    }
}