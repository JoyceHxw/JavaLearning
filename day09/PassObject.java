
public class PassObject{
    public static void main(String[] args){
        Circle c = new Circle();
        PassObject p = new PassObject(); 
        p.printAreas(c, 4);
        System.out.println(c.radius);

    }

    public void printAreas(Circle c, int time){
        for(int i=1; i<=time; i++){
            c.radius=i;
            System.out.println(i + "\t\t"+ c.findArea());
        }
    }
}

class Circle{
    double radius;

    public double findArea(){
        return Math.PI*radius*radius;
    }
}