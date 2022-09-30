package PolyExercise;

public class InstanceTest{
    public static void main(String[] args){
        InstanceTest i = new InstanceTest();
        i.method(new Student());
    }

    public void method(Person e){
        String info = e.getInfo();
        System.out.println(info);
    }
}