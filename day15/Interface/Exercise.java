package Interface;

public class Exercise {
    public static void main(String[] args){
        ComparableCircle c1 = new ComparableCircle(2.4);
        ComparableCircle c2 = new ComparableCircle(2.5);
        System.out.println(c1.compareTo(c2));
    }
}

interface CompareObject{
    public int compareTo(Object o);
}

class Circle{
    private double radius;

    public Circle(){

    }
    public Circle(double radius){
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
}

class ComparableCircle extends Circle implements CompareObject{

    public ComparableCircle(){

    }
    public ComparableCircle(double radius){
        super(radius);
    }
    @Override
    public int compareTo(Object o) {
        if(this==o){
            return 0;
        } else if(o instanceof ComparableCircle){
            ComparableCircle c = (ComparableCircle) o;
            // return this.getRadius()-c.getRadius(); //返回int型
            if(this.getRadius()>c.getRadius()){
                return 1;
            } else if(this.getRadius()<c.getRadius()){
                return -1;
            } else {
                return 0;
            }
        } else{
            return 0;
        }
    }
    
}