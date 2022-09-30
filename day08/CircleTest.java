public class CircleTest{
    public static void main(String[] args){
        Circle c1 =  new Circle();
        System.out.println(c1.getSize(3));
    }
}

class Circle{
    // double radius;
    public double getSize(double radius){
        double size=Math.PI*radius*radius;
        return size;
    }
}