import java.util.Scanner;

class ArrayExercise{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入学生人数：");
        int number = scan.nextInt();

        double[] scores =  new double[number];
        double maxscore=0;
        for(int i=0;i<scores.length;i++){
            System.out.println("请输入第" + (i+1) + "个学生的成绩：");
            scores[i] = scan.nextDouble();
            if(scores[i]>=maxscore){
                maxscore=scores[i];
            }
        }
        // double maxscore=0;
        // for(int i=0;i<scores.length;i++){
        //     if(scores[i]>=maxscore){
        //         maxscore=scores[i];
        //     }
        // }
        System.out.println("其中的最高分为：" + maxscore);

        String levels = "";
        for(int i=0;i<scores.length;i++){
            if(scores[i]>= (maxscore-10)){
                levels += "第" + (i+1) + "个学生的成绩为："+scores[i]+"等级为A"+"\n";
            } else if(scores[i]>= (maxscore-20)){
                levels += "第" + (i+1) + "个学生的成绩为："+scores[i]+"等级为B"+"\n";
            } else if(scores[i]>= (maxscore-30)){
                levels += "第" + (i+1) + "个学生的成绩为："+scores[i]+"等级为C"+"\n";
            } else{
                levels += "第" + (i+1) + "个学生的成绩为："+scores[i]+"等级为D"+"\n";
            }
        }
        System.out.print(levels);

    }
}