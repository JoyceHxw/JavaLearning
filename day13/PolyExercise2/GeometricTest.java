package PolyExercise2;

public class GeometricTest {
    public static void main(String[] args){
        GeometricTest g = new GeometricTest();
        System.out.println(g.isEqual(new Circle(2, "white", 5), new Rectangle(3, 4, "red", 10)));
        g.showArea(new Circle(2, "white", 5));
    }

    public boolean isEqual(GeometricObject o1, GeometricObject o2){
        if(o1.findArea()==o2.findArea()){
            return true;
        } else{
            return false;
        }
    }

    public void showArea(GeometricObject o){
        System.out.println(o.findArea());
    }
}
