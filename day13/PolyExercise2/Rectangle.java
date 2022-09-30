package PolyExercise2;

public class Rectangle extends GeometricObject {

    private double width;
    private double height;

    public Rectangle(double width, double height,String color, double weight) {
        super(color, weight);
        this.width=width;
        this.height=height;
    }

    public double getWeight(){
        return width;
    }
    public double getHeight(){
        return height;
    }

    public void setWidth(double width){
        this.width=width;
    }
    public void setHeight(double height){
        this.height=height;
    }

    public double findArea(){
        return width*height;
    }
    
}
