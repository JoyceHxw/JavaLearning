package EqualsExercise;

// import javax.swing.plaf.basic.BasicDesktopIconUI.MouseInputHandler;

public class Exercise2 {
    public static void main(String[] args){
        MyDate m1 = new MyDate(14,3,1976);
        MyDate m2 = new MyDate(14,3,1976);
        System.out.println(m1.equals(m2));
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

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        } else if(obj instanceof MyDate){
            MyDate m = (MyDate) obj;
            if(this.day==m.day && this.month==m.month && this.year==m.year){
                return true;
            } else{
                return false;
            }
        } else{
            return false;
        }
    }
}