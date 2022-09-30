public class RecursionTest{
    // public static void main(String[] args){
    //     RecursionTest r = new RecursionTest();
    //     System.out.println(r.getSum(100));
    //     System.out.println(r.getFunction(5));

    // }

    int getSum(int n){
        if(n==1){
            return 1;
        } else{
            return n +getSum(n-1);
        }
    }

    public int getFunction(int n){
        if(n==1){
            return 1;
        }else if(n==2){
            return 4;
        }else{
            return 2*getFunction(n-1) + getFunction(n-2);
        }
    }
}