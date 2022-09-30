public class TriangleTest{
    public static void main(String[] agrs){
        Triangle t = new Triangle();
        t.setBase(4.2);
        t.setHeight(3.6);
        System.out.println(t.getBase());
        System.out.println(t.getHeight());

        Triangle t1 = new Triangle(2.4,6.4);
        System.out.println(t1.getBase());
        System.out.println(t1.getHeight());

    }
}

class Triangle{
    
    private double base;
    private double height;

    public Triangle(){
    } 
    public Triangle(double b, double h){
        base=b;
        height=h;
    } 

    public void setBase(double b){
        base=b;
    }
    public void setHeight(double h){
        height=h;
    }

    public double getBase(){
        return base;
    }
    public double getHeight(){
        return height;
    }
}