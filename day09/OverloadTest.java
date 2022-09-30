class OverloadTest{
    public static void main(String[] args){
        OverloadTest o = new OverloadTest();
        System.out.println(o.getMax(4, 7));
        System.out.println(o.getMax(4.6, 1.1));
        System.out.println(o.getMax(5.6, 2.2, 3.7));
        o.show("hello","word");
        
    }


    public int getMax(int a, int b){
        if(a>=b){
            return a;
        } else{
            return b;
        }
    }

    public double getMax(double a, double b){
        if(a>=b){
            return a;
        } else{
            return b;
        }
    }

    public double getMax(double a, double b, double c){
        // if(a>=b){
        //     if(b>=c){
        //         return a;
        //     }
        //     else{
        //         if(a>=c){
        //             return a;
        //         }
        //         else{
        //             return c;
        //         }
        //     }
        // } else{
        //     if(a>=c){
        //         return b;
        //     }
        //     else{
        //         if(b>=c){
        //             return b;
        //         }
        //         else{
        //             return c;
        //         }
        //     }
        // }
        double max = (a>=b)? a:b;
        return (max>=c)? max: c;
    }

    //定义可变个数形参
    //与数组类似，不能共存
    //可变个数形参在方法的形参中，必须放在最后面，且只能放一个
    public void show(String ... strs){
        for(int i =0; i<strs.length; i++){
            System.out.println(strs[i]);
        }
        
    }
}
