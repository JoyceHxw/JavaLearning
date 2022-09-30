public class StudentTest{
    public static void main(String[] args){
        Student[] s = new Student[20];

        //生成对象
        for(int i=0; i<=19; i++){
            s[i] = new Student();
            s[i].number = i+1;
            s[i].state = (int)(Math.random()*6+1);
            s[i].score =  Math.random()*101;
            // if(s[i].state==3){
            //     System.out.println("学号是"+s[i].number+"；"+"年级是"+s[i].state+"；"+"分数是"+s[i].score+"；");
            // }
        }

        StudentTest test = new StudentTest();
        test.print(s);
        test.search(s,4);
        test.rank(s);


        // for(int i=0; i<=19; i++){
        //     System.out.println(s[i].view());
        // }

        //排序
        // for(int a=1; a<=19; a++){
        //     for(int b=0; b<=18-a; b++){
        //         if(s[b].score>=s[b+1].score){
        //             //不是交换成绩是交换对象
        //             Student temp = s[b];
        //             s[b]=s[b+1];
        //             s[b+1] = temp;
        //         }
        //     }
        // }
        
        // for(int i=0; i<=19; i++){
        //     System.out.println(s[i].view());
        // }

    }

    //遍历封装
    public void print(Student[] s){
        for(int i=0; i<=19; i++){
            System.out.println(s[i].view());
        }
    }

    //搜索封装
    public void search(Student[] s, int state){
        for(int i=0; i<=19; i++){
            if(s[i].state==state){
                System.out.println("学号是"+s[i].number+"；"+"年级是"+s[i].state+"；"+"分数是"+s[i].score+"；");
            }
        }

    }

    //排序封装
    public void rank(Student[] s){
        for(int a=1; a<=19; a++){
            for(int b=0; b<=18-a; b++){
                if(s[b].score>=s[b+1].score){
                    //不是交换成绩是交换对象
                    Student temp = s[b];
                    s[b]=s[b+1];
                    s[b+1] = temp;
                }
            }
        }
    }
}

class Student{
    int number;
    int state;
    double score;
    
    public String view(){
        return "学号是"+number+"；"+"年级是"+state+"；"+"分数是"+score+"；";
    }
}