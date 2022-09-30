public class RectangleTest{
    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        r1.m = 7;
        r1.n = 2;
        r1.getRectangle();
        System.out.println(r1.size());
    }
}

class Rectangle{
    int m;
    int n;

    public void getRectangle(){
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public double size(){
        return m*n;
    }
}