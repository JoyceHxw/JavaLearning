package EqualsExercise;

public class Exercise3 {
    public static void main(String[] args){
        Circle c1 = new Circle(2.3,"white",1.0);
        Circle c2 = new Circle();

        System.out.println(c1.getColor().equals(c2.getColor()));

        System.out.println(c1.equals(c2));

        System.out.println(c1.toString());

    }
}
