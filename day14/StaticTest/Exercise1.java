package StaticTest;

public class Exercise1 {
    public static void main(String[] args){
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Circle c3 = new Circle(2.4);

        System.out.println(c1.id);
        System.out.println(c2.id);
        System.out.println(c3.id);

        System.out.println(Circle.getTotal());

    }
}

class Circle{
    double radius;
    int id;

    public Circle(){
        id=init++;
        total++;
    }
    public Circle(double radius){
        this();
        this.radius=radius;
    }

    private static int total;
    private static int init =1001;

    public double findArea(){
        return Math.PI*radius*radius;
    }

    public static int getTotal(){
        return total;
    }
}
