package EqualsExercise;

import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;

public class Circle extends GeometricObject {
    private double radius;

    public Circle(){
        super();
        radius=1.0;
    }
    public Circle(double radius,String color, double weight) {
        super(color, weight);
        this.radius=radius;
    }
    
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }

    public double findArea(){
        return Math.PI*radius*radius;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        } else if(obj instanceof Circle){
            Circle c = (Circle)obj;
            if(this.radius==c.radius){
                return true;
            } else{
                return false;
            }
        } else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Circle [radius="+radius +"]";
    }
}
