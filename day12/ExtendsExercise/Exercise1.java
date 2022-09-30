package ExtendsExercise;

public class Exercise1{
    public static void main(String[] args){
        Kids someKid = new Kids();
        someKid.salary=5000;
        someKid.sex=0;

        someKid.manOrWoman();
        someKid.employeed();
        someKid.yearsOld=22;
        someKid.printAge();

        KidOverwrite k = new KidOverwrite();
        k.major="经济";
        k.study();
    }
}